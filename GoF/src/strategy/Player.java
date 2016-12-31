package strategy;

/**
 * じゃんけんを行うプレイヤーを表すクラス<BR>
 * <BR>
 * Context（文脈）の役<BR>
 * Strategy役を利用する役。
 * ConcreteStrategy役のインスタンスを持っていて、
 * 必要に応じてそれを利用する。
 * （あくまで呼び出すのはStrategy役のインターフェース（API）である。）
 */
public class Player {

	private String name;
	private Strategy strategy;
	private int wincount = 0;
	private int losecount = 0;
	private int gamecount = 0;

	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param strategy 戦略
	 */
	public Player(String name, Strategy strategy) {
		this.name = name;
		this.strategy = strategy;
	}

	/**
	 * 戦略にお伺いを立てる
	 * @return 次の手
	 */
	public Hand nextHand() {
		return strategy.nextHand();
	}

	/**
	 * 勝った
	 */
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}

	/**
	 * 負けた
	 */
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}

	/**
	 * 引き分け
	 */
	public void even() {
		gamecount++;
	}

	@Override
	public String toString() {
		return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose]";
	}
}
