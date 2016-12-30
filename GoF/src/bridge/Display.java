package bridge;

/**
 * 機能のクラス階層：「表示する」クラス<BR>
 * <BR>
 * Abstraction（抽象化）の役<BR>
 * 「機能のクラス階層」の最上位クラス。
 * Implementor役のメソッドを使って基本的な機能だけが記述されているクラス。
 * このクラスはImplementor役を保持する。
 */
public class Display {

	private DisplayImpl impl;

	public Display(DisplayImpl impl) {
		this.impl = impl;
	}

	public void open() {
		impl.rawOpen();
	}

	public void print() {
		impl.rawPrint();
	}

	public void close() {
		impl.rawClose();
	}

	public final void display() {
		open();
		print();
		close();
	}
}
