package decorator;

/**
 * 1行だけからなる文字列表示用のクラス<BR>
 *
 * ConcreteCompornentの役<BR>
 * Compornent役のインターフェース（API）を実装している具体的な役。
 */
public class StringDisplay extends Display {

	/** 表示文字列 */
	private String string;

	/**
	 * コンストラクタ（引数で表示文字列を指定）
	 *
	 * @param string 表示文字列
	 */
	public StringDisplay(String string) {
		this.string = string;
	}

	/**
	 * 文字数を返す
	 *
	 * @return 文字数
	 */
	@Override
	public int getColumns() {
		return string.getBytes().length;
	}

	/**
	 * 行数を返す（行数は1）
	 *
	 * @return 行数
	 */
	@Override
	public int getRows() {
		return 1;
	}

	/**
	 * 指定されたrow番号の文字列を返す
	 *
	 * @param row 指定行番号
	 * @return 指定されたrow番号の文字列
	 */
	@Override
	public String getRowText(int row) {
		if (row == 0) {
			return string;
		} else {
			return null;
		}
	}

}
