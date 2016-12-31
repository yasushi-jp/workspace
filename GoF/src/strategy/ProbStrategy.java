package strategy;

import java.util.Random;

/**
 * 1回目の手から次の手を確率的に計算する戦略を表すクラス<BR>
 * <BR>
 * ConcreteStrategy（具体的戦略）の役<BR>
 * Strategy役のインターフェース（API）を実際に実装する役。
 * ここで具体的な戦略（作戦・方策・方法・アルゴリズム）を実際に実装する。
 */
public class ProbStrategy implements Strategy {

	private Random random;
	private int prevHandValue = 0;
	private int currentHandValue = 0;

	private int[][] history = {
			{1, 1, 1,},
			{1, 1, 1,},
			{1, 1, 1,},
	};

	/**
	 * コンストラクタ
	 * @param seed シード
	 */
	public ProbStrategy(int seed) {
		this.random = new Random(seed);
	}

	@Override
	public Hand nextHand() {
		int bet = random.nextInt(getSum(currentHandValue));
		int handvalue = 0;
		if (bet < history[currentHandValue][0]) {
			handvalue = 0;
		} else if (bet < history[currentHandValue][0] + history[currentHandValue][1]) {
			handvalue = 1;
		} else {
			handvalue = 2;
		}
		prevHandValue = currentHandValue;
		currentHandValue = handvalue;
		return Hand.getHand(handvalue);
	}

	@Override
	public void study(boolean win) {
		if (win) {
			history[prevHandValue][currentHandValue]++;
		} else {
			history[prevHandValue][(currentHandValue + 1) % 3]++;
			history[prevHandValue][(currentHandValue + 2) % 3]++;

		}
	}

	private int getSum(int hv) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += history[hv][i];
		}
		return sum;
	}
}
