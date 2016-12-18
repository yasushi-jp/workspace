package templatemethod;

/**
 * メソッドdisplayのみ実装されている抽象クラス<BR>
 * <BR>
 * AbstractClass（抽象クラス）の役<BR>
 * AbstractClass役はテンプレートメソッドを実装する。
 * また、そのテンプレートメソッドで使用している抽象メソッドを宣言する。
 * この抽象メソッドはサブクラスであるConcreteClass役によって実装される。
 *
 */
public abstract class AbstractDisplay {
	protected abstract void open();	// サブクラスに実装をまかせる抽象メソッド (1) open
	protected abstract void print();	// サブクラスに実装をまかせる抽象メソッド (2) print
	protected abstract void close();	// サブクラスに実装をまかせる抽象メソッド (3) close

	// この抽象クラスで実装しているメソッドdisplay
	public final void display() {
		open();							// まずopenして…
		for (int i = 0; i < 5; i++) {	// 5回printを繰り返して
			print();
		}
		close();	// 最後にcloseする。これがdisplayメソッドで実装されている内容
	}
}
