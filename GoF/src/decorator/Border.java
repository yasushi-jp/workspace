package decorator;

/**
 * 「飾り枠」を表す抽象クラス<BR>
 *
 * Decorator（装飾者）の役<BR>
 * Compornent役と同じインターフェース（API）を持つ。
 * そしてさらに、このDecorator役が飾る対象となるCompornent役を持つ。
 * この役は、自分が飾っている対象を「知っている」わけである。
 *
 */
public abstract class Border extends Display {

	/** この飾り枠がくるんでいる中身を指す */
	protected Display display;

	/**
	 * コンストラクタ
	 * インスタンス生成時に中身を指定
	 * @param display 中身
	 */
	public Border(Display display) {
		this.display = display;
	}


}
