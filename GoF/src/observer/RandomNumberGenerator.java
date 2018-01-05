package observer;

import java.util.Random;

/**
 * ランダムに数を生成するクラス<BR>
 * <BR>
 * ConcreteSubject（具体的な被験者）の役<BR>
 * <PRE>
 * ConcreteSubject役は、具体的な「観察される側」を表現する役である。
 * 状態が変化したら、そのことを登録されているObserver役に伝える。
 * </PRE>
 */
public class RandomNumberGenerator extends NumberGenerator {
	private Random random = new Random();	// 乱数発生器
	private int number;						// 現在の数

	@Override
	public int getNumber() {	// 数を取得する
		return number;
	}

	@Override
	public void execute() {
		for (int i = 0; i < 20; i++) {
			number = random.nextInt(50);
			notifyObservers();
		}
	}

}
