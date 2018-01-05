package observer;

/**
 * 数字で数を表示するクラス<BR>
 * <BR>
 * ConcreteObserver（具体的な観察者）の役<BR>
 * <PRE>
 * CobcreteObserver役は、具体的なObserverである。
 * updateメソッドが呼び出されると、そのメソッドの中でSubject役の現在の状態を取得する。
 * </PRE>
 */
public class DigitObserver implements Observer {

	@Override
	public void update(NumberGenerator generator) {
		System.out.println("DigitObserver:" + generator.getNumber());
		try {
			Thread.sleep(100);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
