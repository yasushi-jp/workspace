package chainofresponsibility;

/**
 * トラブルを解決する具象クラス（常に「処理しない」）<BR>
 *
 * ConcreteHandler（具体的処理者）の役<BR>
 * ConcreteHandler役は、要求を処理する具体的な役である。
 *
 */
public class NoSupport extends Support {

	public NoSupport(String name) {
		super(name);
	}

	/**
	 * 解決用メソッド
	 */
	@Override
	protected boolean resolve(Trouble trouble) {
		return false;	// 自分は何も処理しない
	}

}
