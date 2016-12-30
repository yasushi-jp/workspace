package bridge;

/**
 * 機能のクラス階層：「指定回数だけ表示する」という機能を追加したクラス<BR>
 * <BR>
 * RefinedAbstraction（改善した抽象化）の役<BR>
 * Abstraction役に対して機能を追加した役。
 *
 */
public class CountDisplay extends Display {

	public CountDisplay(DisplayImpl impl) {
		super(impl);
	}

	public void multiDisplay(int times) {	// times回繰り返して表示する
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
