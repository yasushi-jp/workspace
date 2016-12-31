package strategy;

import java.util.Random;

/**
 * 勝ったら次も同じ手を出す戦略を表すクラス<BR>
 * <BR>
 * ConcreteStrategy（具体的戦略）の役<BR>
 * Strategy役のインターフェース（API）を実際に実装する役。
 * ここで具体的な戦略（作戦・方策・方法・アルゴリズム）を実際に実装する。
 */
public class WinningStrategy implements Strategy {

	private Random random;
	private boolean won = false;
	private Hand prevHand;


	/**
	 * コンストラクタ
	 * @param seed シード
	 */
	public WinningStrategy(int seed) {
		this.random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		if (!won) {
			prevHand = Hand.getHand(random.nextInt(3));
		}
		return prevHand;
	}

	@Override
	public void study(boolean win) {
		this.won = win;
	}

}
