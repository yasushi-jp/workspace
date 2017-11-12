package decorator;

/**
 * 文字列表示用の抽象クラス<BR>
 *
 * Componentの役<BR>
 * 機能を追加するときの核になる役。
 * Componentの役はインターフェース（API）だけを定める。
 *
 */
public abstract class Display {

	/** 横の文字数を得る */
	public abstract int getColumns();

	/** 縦の行数を得る */
	public abstract int getRows();

	/** row番目の文字列を得る */
	public abstract String getRowText(int row);

	/**
	 * 全部表示する
	 */
	public final void show() {
		for (int i = 0; i < getRows(); i++) {
			System.out.println(getRowText(i));
		}
	}
}
