package chainofresponsibility;

/**
 * 発生したトラブルを表すクラス。
 * トラブル番号（number）を持つ。
 */
public class Trouble {

	/** トラブル番号 */
	private int number;

	/**
	 * コンストラクタ
	 */
	public Trouble(int number) {
		this.number = number;
	}

	/**
	 * トラブル番号を返す
	 *
	 * @return トラブル番号
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * トラブルの文字列表現
	 */
	public String toString() {
		return "[Trouble " + number + "]";
	}
}
