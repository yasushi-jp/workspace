package templatemethod;

/**
 * メソッドopen、print、closeを実装しているクラス<BR>
 * <BR>
 * ConcreteClass（具象クラス）の役<BR>
 * AbstractClass役で定義されている抽象メソッドを具体的に実装する。
 * ここで実装したメソッドはAbstractClass役のテンプレートメソッドから呼び出される。
 */
public class CharDisplay extends AbstractDisplay {	// CharDisplayはAbstractDisplayのサブクラス

	private char ch;	// 表示すべき文字

	/**
	 * コンストラクタで渡された文字chをフィールドに記憶しておく。
	 *
	 * @param ch 表示する文字
	 */
	public CharDisplay(char ch) {
		this.ch = ch;
	}

	/**
	 * 文字列"<<"を表示する。<BR>
	 * <BR>
	 * スーパークラスでは抽象メソッド。
	 * ここでオーバーライドして実装。
	 */
	@Override
	protected void open() {
		System.out.print("<<");	// 開始文字列"<<"を表示。
	}

	/**
	 * コンストラクタで与えられた1文字を表示する。<BR>
	 * <BR>
	 * スーパークラスでは抽象メソッド。
	 * ここでオーバーライドして実装。
	 * このメソッドがdisplayから繰り返し呼び出される。
	 */
	@Override
	protected void print() {
		System.out.print(ch);	// フィールドに記憶していた文字を1個表示する。
	}

	/**
	 * 文字列">>"を表示する。<BR>
	 * <BR>
	 * スーパークラスでは抽象メソッド。
	 * ここでオーバーライドして実装。
	 */
	@Override
	protected void close() {
		System.out.println(">>");	// 終了文字列"<<"を表示。

	}

}
