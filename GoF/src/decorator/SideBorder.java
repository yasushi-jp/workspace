package decorator;

/**
 * 左右にのみ飾り枠をつけるクラス<BR>
 *
 * ConcreteDecorator（擬態的な装飾者）の役<BR>
 * 具体的なDecoratorの役。
 *
 */
public class SideBorder extends Border {

	/** 飾りとなる文字 */
	private char borderChar;

	/**
	 * コンストラクタでDisplayと飾り文字を指定
	 * @param display 中身
	 * @param ch 飾り文字
	 */
	public SideBorder(Display display, char ch) {
		super(display);
		this.borderChar = ch;
	}

	/**
	 * 文字数は中身の両側に飾り文字を加えたもの
	 *
	 * @return 文字数（飾り文字を含む）
	 */
	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	/**
	 * 行数は中身の行数と同じ
	 *
	 * @return 行数
	 */
	@Override
	public int getRows() {
		return display.getRows();
	}

	/**
	 * 指定行の内容は、中身の指定行の両側に飾り文字をつけたもの
	 *
	 * @return 指定行の文字列（飾り文字含む）
	 */
	@Override
	public String getRowText(int row) {
		return borderChar + display.getRowText(row) + borderChar;
	}

}
