package chainofresponsibility;

/**
 * トラブルを解決する具象クラス（奇数番号のトラブルを解決）<BR>
 *
 * ConcreteHandler（具体的処理者）の役<BR>
 * ConcreteHandler役は、要求を処理する具体的な役である。
 */
public class OddSupport extends Support {

	/**
	 * コンストラクタ
	 * @param name トラブル解決者の名前
	 */
	public OddSupport(String name) {
		super(name);
	}

	/**
	 * 解決用メソッド
	 */
	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

}
