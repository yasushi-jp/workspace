package chainofresponsibility;

/**
 * トラブルを解決する具象クラス（特定番号のトラブルを解決）<BR>
 *
 * ConcreteHandler（具体的処理者）の役<BR>
 * ConcreteHandler役は、要求を処理する具体的な役である。
 */
public class SpecialSupport extends Support {

	/** この番号だけ解決できる */
	private int number;

	/**
	 * コンストラクタ
	 * @param name トラブル解決者の名前
	 * @param number解決できる番号
	 */
	public SpecialSupport(String name, int number) {
		super(name);
		this.number = number;
	}

	/**
	 * 解決用メソッド
	 */
	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() == number) {
			return true;
		} else {
			return false;
		}
	}

}
