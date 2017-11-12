package decorator;

/**
 * 上下左右に飾り枠をつけるクラス<BR>
 *
 * ConcreteDecorator（擬態的な装飾者）の役<BR>
 * 具体的なDecoratorの役。
 */
public class FullBorder extends Border {


	/**
	 * コンストラクタ
	 *
	 * @param display 中身
	 */
	public FullBorder(Display display) {
		super(display);
	}

	/**
	 * 文字数は中身の両側に左右の飾り文字分を加えたもの
	 *
	 * @return 文字数（飾り文字含む）
	 */
	@Override
	public int getColumns() {
		return 1 + display.getColumns() + 1;
	}

	/**
	 * 行数は中身の行数に上下の飾り文字分を加えたもの
	 *
	 * @return 行数（飾り文字含む）
	 */
	@Override
	public int getRows() {
		return 1 + display.getRows() + 1;
	}

	/**
	 * 指定した行の内容を返す
	 *
	 * @param row 指定行
	 * @return 文字列（飾り文字含む）
	 */
	@Override
	public String getRowText(int row) {
		if (row == 0) {									// 枠の上端
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else if (row == display.getRows() + 1) {		// 枠の下端
			return "+" + makeLine('-', display.getColumns()) + "+";
		} else {										// それ以外
			return "|" +display.getRowText(row - 1) + "|";
		}
	}

	/**
	 * 上下の飾り文字列を返す
	 *
	 * @param ch 飾り文字
	 * @param count 飾り文字の数
	 * @return 飾り文字列
	 */
	private String makeLine(char ch, int count) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < count; i++) {
			sb.append(ch);
		}
		return sb.toString();
	}
}
