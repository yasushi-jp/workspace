package chainofresponsibility;

/**
 * トラブルを解決する具象クラス（指定した番号未満のトラブルを解決）<BR>
 *
 * ConcreteHandler（具体的処理者）の役<BR>
 * ConcreteHandler役は、要求を処理する具体的な役である。
 */
public class LimitSupport extends Support {

	/** この番号未満なら解決できる */
	private int limit;

	/**
	 * コンストラクタ
	 * @param name トラブル解決者の名前
	 * @param limit リミット
	 */
	public LimitSupport(String name, int limit) {
		super(name);
		this.limit = limit;
	}

	/**
	 * 解決用メソッド
	 */
	@Override
	protected boolean resolve(Trouble trouble) {
		if (trouble.getNumber() < limit) {
			return true;
		} else {
			return false;
		}
	}

}
