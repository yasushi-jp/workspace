package bridge;

import java.io.UnsupportedEncodingException;

/**
 * 実装のクラス階層：「文字列を使って表示する」クラス<BR>
 * <BR>
 * ConcleteImplementor（具体的な実装者）の役<BR>
 * 具体的にImplementor役のインターフェース（API）を実装する役。
 *
 */
public class StringDisplayImpl extends DisplayImpl {

	private String string;		// 表示するべき文字列。
	private int width;			// バイト単位で計算した文字列の「幅」。

	/**
	 * コンストラクタで渡された文字列stringをフィールドに記憶しておく。
	 * さらにバイト単位の幅もフィールドに記憶しておく。
	 *
	 * @param string 表示する文字列
	 * @throws UnsupportedEncodingException
	 *
	 */
	public StringDisplayImpl(String string) throws UnsupportedEncodingException {
		this.string = string;
		this.width = string.getBytes("MS932").length;
	}

	@Override
	public void rawOpen() {
		printLine();
	}

	@Override
	public void rawPrint() {
		System.out.println("|" + string + "|");		// 前後に"|"をつけて表示。
	}

	@Override
	public void rawClose() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");				// 枠の角を表現する"+"マークを表示する。
		for (int i = 0; i < width; i++) {	// width個の"-"を表示して、
			System.out.print("-");			// 枠線として用いる。
		}
		System.out.println("+");			// 枠の角を表現する"+"マークを表示する。
	}
}
