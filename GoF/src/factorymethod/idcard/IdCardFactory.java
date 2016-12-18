package factorymethod.idcard;

import java.util.ArrayList;
import java.util.List;

import factorymethod.framework.Factory;
import factorymethod.framework.Product;

/**
 * メソッドcreateProduct、registerProductを実装しているクラス<BR>
 * <BR>
 * ConcreteCreater（具体的作成者）の役<BR>
 * 具体的な製品を作るクラスを定める。
 */
public class IdCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();

	@Override
	protected Product createProduct(String owner) {
		return new IdCard(owner);
	}

	@Override
	protected void registerProduct(Product product) {
		owners.add(((IdCard)product).getOwner());
	}

	/**
	 * @return owners
	 */
	public List<String> getOwners() {
		return owners;
	}

}
