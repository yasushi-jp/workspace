/**
 *
 */
package factorymethod;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;
import factorymethod.idcard.IdCardFactory;

/**
 * 動作テスト用のクラス
 *
 */
public class Main {

	public static void main(String[] args) {
		Factory factory = new IdCardFactory();
		Product card1 = factory.create("大塚泰司");
		Product card2 = factory.create("大塚勝彦");
		Product card3 = factory.create("大塚竜也");
		card1.use();
		card2.use();
		card3.use();
	}

}
