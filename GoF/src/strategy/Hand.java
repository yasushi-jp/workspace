package strategy;

/**
 * じゃんけんの「手」を表すクラス
 *
 */
public class Hand {

	/** グーを表す値 */
	public static final int HANDVALUE_GUU = 0;

	/** チョキを表す値 */
	public static final int HANDVALUE_CHO = 1;

	/** パーを表す値 */
	public static final int HANDVALUE_PAA = 2;

	/** じゃんけんの手を表す3つのインスタンス */
	public static final Hand[] hand = {
			new Hand(HANDVALUE_GUU),
			new Hand(HANDVALUE_CHO),
			new Hand(HANDVALUE_PAA),
	};

	/** じゃんけんの手の文字列表現 */
	private static final String[] name = {"グー", "チョキ", "パー",};

	/** じゃんけんの手の値 */
	private int handvalue;

	/**
	 * コンストラクタ
	 */
	public Hand(int handvalue) {
		this.handvalue = handvalue;
	}

	/** 値からインスタンスを得る */
	public static Hand getHand(int handvalue) {
		return hand[handvalue];
	}

	/**
	 * 自分の手が相手の手より強いかを判定。
	 * @param h 相手の手
	 * @return thisがhより強いときtrue
	 */
	public boolean isStrongerThan(Hand h) {
		return fight(h) == 1;
	}

	/**
	 * 自分の手が相手の手より弱いか判定。
	 * @param h 相手の手
	 * @return thisがhより弱いときtrue
	 */
	public boolean isWeakerThan(Hand h) {
		return fight(h) == -1;
	}

	/**
	 * じゃんけんの判定
	 * @param h 相手の手
	 * @return 引き分けは0、thisの勝ちなら1、hの勝ちなら-1
	 */
	private int fight(Hand h) {
		if (this == h) {
			return 0;
		} else if ((this.handvalue + 1) % 3 == h.handvalue)  {
			return 1;
		} else {
			return -1;
		}
	}

	/**
	 * 文字列表現へ変換
	 */
	@Override
	public String toString() {
		return name[handvalue];
	}
}
