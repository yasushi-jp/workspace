package prototype;

import prototype.framework.Product;

/**
 * 文字列を枠線で囲って表示するクラス。
 * useとcreateCloneを実装している。<BR>
 * <BR>
 * ConcretePrototype（具体的な原型）の役<BR>
 * ConcretePrototype役はインスタンスをコピーして
 * 新しいインスタンスを生成するメソッドを実際に実装する。
 *
 */
public class MessageBox implements Product {

	private char decochar;


	public MessageBox(char decochar) {
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s + " " + decochar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}

}
