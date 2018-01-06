package memento.game;

import java.util.ArrayList;
import java.util.List;

/**
 * Gamerの状態を表すクラス<BR>
 * <BR>
 * Memento（記念品）の役<BR>
 * <PRE>
 * Memento役は、Originator役の内部情報をまとめる。
 * Memento役は、Originator役の内部情報を持っているが、その情報を誰にでも公開するわけではない。
 *
 * Memento役は、次の2種類のインタフェース（API）を持っている。
 *
 * ・wide interface … 広いインタフェース（API）
 * Memento役が提供する「広いインタフェース（API）」は、
 * オブジェクトの状態を元に戻すために必要な情報がすべて得られるメソッドの集合である。
 * 広いインタフェース（API）はMemento役の内部情報をさらけだすので、これを使えるのはOriginator役だけである。
 *
 * ・narrow interface … 狭いインタフェース（API）
 * Memento役が提供する「狭いインタフェース（API）」は、外部のCaretaker役に見せるものである。
 * 狭いインタフェース（API）でできることには限りがあり、内部状態が外部に公開されるのを防ぐ。
 *
 * 上記の2種類のインタフェース（API）を使い分けることで、オブジェクトのカプセル化の破壊を防ぐことができる。
 * Originator役とMemento役は非常に密接な関係にある。
 * </PRE>
 */
public class Memento {
	int money;						// 所持金
	ArrayList<String> fuluits;		// フルーツ

	public int getMoney() {			// 所持金を得る（narrow interface）
		return money;
	}

	Memento(int money) {			// コンストラクタ（wide interface）
		this.money = money;
		this.fuluits = new ArrayList<>();
	}

	void addFluit(String fuluit) {	// フルーツを追加する（wide interface）
		fuluits.add(fuluit);
	}

	@SuppressWarnings("unchecked")
	List<String> getFluits() {		// フルーツを得る
		return (List<String>) fuluits.clone();
	}
}
