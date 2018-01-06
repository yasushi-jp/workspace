package memento;

import memento.game.Gamer;
import memento.game.Memento;

/**
 * ゲームを進行させるクラス。<BR>
 * Mementoのインスタンスを保存しておき、必要に応じてGamerの状態を復元する。<BR>
 * <BR>
 * Caretaker（世話をする人）の役<BR>
 * <PRE>
 * Caretaker役は、現在のOriginator役の状態を保存したい時に、そのことをOriginator役に伝える。
 * Originator役はそれを受けてMemento役を作り、Caretaker役に渡す。
 * Caretaker役は将来の必要に備えて、そのMemento役を保存しておく。
 * しかし、Caretaker役は、Memento役の持つ2種類のインタフェース（API）のうち、
 * 「狭いインタフェース（API）」しか使えないので、Memento役の内部情報にアクセスできるわけではない。
 * ただ、作ってもらったMmemento役を、ひとかたまりのブラックボックスとして、まるごと保存しておくだけである。
 * Originator役とMemento役は固く結びついているが、Caretaker役とMemento役はゆるやかに結びついている。
 * Memento役はCaretaker役に対して情報隠蔽を行っている。
 * </PRE>
 */
public class Main {
	public static void main(String[] args) {
		Gamer gamer = new Gamer(100);				// 最初の所持金は100
		Memento memento = gamer.createMemento();	// 最初の状態を保存しておく
		for (int i = 0; i < 100; i++) {
			System.out.println("==== " + i);		// 回数表示
			System.out.println("現状:" + gamer);	// 現在の主人公の状態表示

			gamer.bet();	// ゲームを進める

			System.out.println("所持金は" + gamer.getMoney() + "円になりました。");

			// Mementoの取り扱いの決定
			if (gamer.getMoney() > memento.getMoney()) {
				System.out.println("    （だいぶ増えたので、現在の状態を保存しておこう）");
				memento = gamer.createMemento();
			} else if (gamer.getMoney() < memento.getMoney() / 2) {
				System.out.println("    （だいぶ減ったので、以前の状態に復帰しよう）");
				gamer.restoreMemento(memento);
			}

			// 時間待ち
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("");
		}
	}
}
