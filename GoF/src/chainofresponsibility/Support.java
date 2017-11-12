package chainofresponsibility;

/**
 * トラブルを解決する抽象クラス<BR>
 *
 * Handler（処理者）の役<BR>
 * Handler役は、要求を処理するインターフェース（API）を定める役である。
 * 「次の人」を保持しておき、自分で処理できない要求がきたら、その人にたらい回しする。
 * もちろん、「次の人」もHandler役である。
 *
 */
public abstract class Support {

	/** このトラブル解決者の名前 */
	private String name;

	/** たらい回しの先 */
	private Support next;

	/**
	 * コンストラクタ（トラブル解決者の生成）
	 *
	 * @param name トラブル解決者の名前
	 */
	public Support(String name) {
		this.name = name;
	}

	/**
	 * たらい回し先を設定する
	 *
	 * @param next たらい回し先
	 * @return たらい回し先
	 */
	public Support setNext(Support next) {
		this.next = next;
		return next;
	}

	/**
	 * トラブル解決の手順
	 *
	 * @param trouble トラブル
	 */
	public final void support(Trouble trouble) {
		if (resolve(trouble)) {
			done(trouble);
		} else if (next != null) {
			next.support(trouble);
		} else {
			fail(trouble);
		}
	}

	/**
	 * 文字列表現
	 */
	public String toString() {
		return "[" + name + "]";
	}

	/**
	 * 解決用メソッド
	 * @param trouble トラブル
	 * @return 解決したかどうか
	 */
	protected abstract boolean resolve(Trouble trouble);

	/**
	 * 解決
	 *
	 * @param trouble トラブル
	 */
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolve by " + this + ".");
	}

	/**
	 * 未解決
	 *
	 * @param trouble トラブル
	 */
	protected void fail(Trouble trouble) {
		System.out.println(trouble + " cannot be resolve.");
	}
}
