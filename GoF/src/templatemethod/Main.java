/**
 *
 */
package templatemethod;

import java.io.UnsupportedEncodingException;

/**
 * 動作用のテストクラス
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		// 'H'を持ったCharDisplayのインスタンスを1個生成。
		AbstractDisplay d1 = new CharDisplay('H');

		// "hello, world."を持ったStringDisplayのインスタンスを1個生成。
		AbstractDisplay d2 = new StringDisplay("Hello, world.");

		// "こんにちは。"を持ったStringDisplayのインスタンスを1個生成。
		AbstractDisplay d3 = new StringDisplay("こんにちは。");

		// d1, d2, d3ともすべて同じAbstractDisplayのサブクラスのインスタンスだから、
		// 継承したdisplayメソッドを呼び出すことができる。
		// 実際の動作は個々のクラスCharDisplayやStringDisplayで定まる。
		d1.display();
		d2.display();
		d3.display();
	}

}
