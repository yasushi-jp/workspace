package memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * ゲームを行う主人公のクラス。Mementoのインスタンスを作る<BR>
 * <BR>
 * Originator（作成者）の役<BR>
 * <PRE>
 * Originator役は、自分の現在の状態を保存したいときにMemento役を作る。
 * Originator役はまた、以前のMemento役を渡されると、そのMemento役を作った時点の状態に戻る処理を行う。
 * </PRE>
 *
 */
public class Gamer {
	private int money;									// 所持金
	private List<String> fluits = new ArrayList<>();	// フルーツ
	private Random random = new Random();				// 乱数生成器
	private static String[] fluitsname = {				// フルーツ名の表
			"リンゴ", "ぶどう", "バナナ", "みかん",
	};

	public Gamer(int money) {	// コンストラクタ
		this.money = money;
	}

	public int getMoney() {		// 現在の所持金を得る
		return money;
	}

	public void bet() {						// 賭ける…ゲームの進行
		int dice = random.nextInt(6) + 1;	// サイコロを振る
		if (dice == 1) {					// 1の目…所持金が増える
			money += 100;
			System.out.println("所持金が増えました。");
		} else if (dice == 2) {				// 2の目…所持金が半分になる
			money /= 2;
			System.out.println("所持金が半分になりました。");
		} else if (dice == 6) {				// 6の目…フルーツをもらう
			String f = getFluit();
			System.out.println("フルーツ(" + f + ")をもらいました。");
			fluits.add(f);
		} else {							// それ以外…何も起きない
			System.out.println("何も起こりませんでした。");
		}
	}

	public Memento createMemento() {		// スナップショットを撮る
		Memento m = new Memento(money);
		Iterator<String> it = fluits.iterator();
		while (it.hasNext()) {
			String f = it.next();
			if (f.startsWith("おいしい")) {	// フルーツはおいしいものだけ保存
				m.addFluit(f);
			}
		}
		return m;
	}

	public void restoreMemento(Memento memento) {	// アンドゥを行う
		this.money = memento.money;
		this.fluits = memento.getFluits();
	}

	@Override
	public String toString() {		// 文字列表現
		return "[money = " + money + ", fluits = " + fluits + "]";
	}

	public String getFluit() {		// フルーツを1個得る
		String prefix = "";
		if (random.nextBoolean()) {
			prefix = "おいしい";
		}
		return prefix + fluitsname[random.nextInt(fluitsname.length)];
	}
}
