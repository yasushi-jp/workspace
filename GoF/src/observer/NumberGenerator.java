package observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数を生成するオブジェクトを表すクラス<BR>
 * <BR>
 * Subject（被験者）の役<BR>
 * <PRE>
 * Subject役は、「観察される側」を表す。
 * Subject役は観察者であるObserver役を登録するメソッドと、削除するメソッドを持っている。
 * また、「現在の状態を取得する」メソッドも宣言されている。
 * </PRE>
 */
public abstract class NumberGenerator {
	private List<Observer> observers = new ArrayList<>();	// Observerたちを保持

	public void addObserver(Observer observer) {	// Observerを追加
		observers.add(observer);
	}

	public void deleteObserver(Observer observer) {	// Observerを削除
		observers.remove(observer);
	}

	public void notifyObservers() {		// Observerへ通知
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer o = it.next();
			o.update(this);
		}
	}

	public abstract int getNumber();	// 数を取得する
	public abstract void execute();		// 数を生成する
}
