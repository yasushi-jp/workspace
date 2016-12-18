package builder;

/**
 * 1つの文書を作るクラス<BR>
 * <BR>
 * Director（監督者）の役<BR>
 * Director役はBuilder役のインターフェース（API）を使ってインスタンスを生成する。
 * ConcleteBuilder役に依存した実装は行わない。
 * ConcleteBuilder役が何であってもうまく機能するように、Builder役のメソッドのみを使う。
 */
public class Director {
	private Builder builder;

	/**
	 *  Builderのサブクラスのインスタンスが与えられるので、
	 * builderフィールドに保持しておく
	 */
	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 文書構築
	 */
	public void construct() {
		builder.makeTitle("Greeting");			// タイトル
		builder.makeString("朝から昼にかけて");	// 文字列
		builder.makeItems(new String[] {		// 箇条書き
				"おはようございます。",
				"こんにちは。",
		});
		builder.makeString("夜に");				// 別の文字列
		builder.makeItems(new String[] {		// 別の箇条書き
				"こんばんは。",
				"おやすみなさい。",
				"さようなら。",
		});
		builder.close();						// 文書を完成させる
	}
}
