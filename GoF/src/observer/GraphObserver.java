package observer;

/**
 * 簡易グラフで数を表すクラス<BR>
 * <BR>
 * ConcreteObserver（具体的な観察者）の役<BR>
 * <PRE>
 * CobcreteObserver役は、具体的なObserverである。
 * updateメソッドが呼び出されると、そのメソッドの中でSubject役の現在の状態を取得する。
 * </PRE>
 */
public class GraphObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.print("GraphObserver:");
		int count = generator.getNumber();
		for (int i = 0; i < count; i++) {
			System.out.print("*");
		}
		System.out.println("");
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
