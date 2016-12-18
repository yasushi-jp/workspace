package factorymethod.idcard;

import factorymethod.framework.Product;

/**
 * メソッドuseを実装しているクラス<BR>
 * <BR>
 * ConcreteProduct（具体的製品）の役<BR>
 * 具体的な製品を定める。
 */
public class IdCard extends Product {

	private String owner;

	public IdCard(String owner) {
		System.out.println(owner + "のカードを作ります。");
		this.owner = owner;
	}

	@Override
	public void use() {
		System.out.println(owner + "のカードを使います。");
	}

	/**
	 * @return owner
	 */
	public String getOwner() {
		return owner;
	}

}
