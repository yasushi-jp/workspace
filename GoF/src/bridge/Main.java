package bridge;

import java.io.UnsupportedEncodingException;

/**
 * 動作テスト用のクラス
 *
 */
public class Main {

	/**
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {

		Display d1 = new Display(new StringDisplayImpl("Hello, Japan"));
		Display d2 = new Display(new StringDisplayImpl("Hello, World"));
		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello, Universe."));

		d1.display();
		d2.display();
		d3.display();
		d3.multiDisplay(5);
	}

}
