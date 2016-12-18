/**
 *
 */
package templatemethod;

import java.io.UnsupportedEncodingException;

/**
 * メソッドopen、print、closeを実装しているクラス<BR>
 * <BR>
 * ConcreteClass（具象クラス）の役<BR>
 * AbstractClass役で定義されている抽象メソッドを具体的に実装する。
 * ここで実装したメソッドはAbstractClass役のテンプレートメソッドから呼び出される。
 */
public class StringDisplay extends AbstractDisplay {	// StringDisplayはAbstractDisplayのサブクラス

	private String string;	// 表示するべき文字列。
	private int width;		// バイト単位で計算した文字列の「幅」。

	/**
	 * コンストラクタ
	 * @param string 文字列
	 * @throws UnsupportedEncodingException
	 */
	public StringDisplay(String string) throws UnsupportedEncodingException {
		this.string = string;					// コンストラクタで渡された文字列stringをフィールドに記憶。
		this.width = string.getBytes("SJIS").length;	// バイト単位の幅もフィールドに記憶。
	}

	/**
	 * 文字列"+----+"を表示する。<BR>
	 */
	@Override
	protected void open() {
		printLine();
	}

	/**
	 * コンストラクタで与えられている文字列を"|"と"|"ではさんで表示する。
	 */
	@Override
	protected void print() {
		System.out.println("|" + string + "|");
	}

	/**
	 * 文字列"+----+"を表示する。
	 */
	@Override
	protected void close() {
		printLine();
	}

	/**
	 * openとcloseから呼ばれるメソッド。
	 */
	private void printLine() {

		System.out.print("+");	// 枠の角を表現する"+"マークを表示。

		// width個の"-"を表示して枠線として用いる。
		for (int i = 0; i < width; i++) {
			System.out.print("-");
		}

		System.out.println("+");	// 枠の角を表現する"+"マークを表示。

	}
}
