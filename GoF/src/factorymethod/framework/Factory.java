package factorymethod.framework;

/**
 * メソッドcreateを実装している抽象クラス<BR>
 * <BR>
 * Creater（作成者）の役<BR>
 * Product役を生成する抽象クラス。
 * 具体的な内容はサブクラスのConcreteCreator役が定める。
 * Creater役は実際に生成するConcreteProduct役については何も知らない。
 * Creater役が知っているのはProduct役とインスタンスの生成メソッドを呼び出せば、
 * Productが生成されるということのみ。
 * 当クラスではcreateProductメソッドがインスタンス生成のメソッドとなっている。
 * newによる実際のインスタンス生成を、インスタンス生成のためのメソッド呼び出しに変えることで、
 * 具体的なクラス名による束縛からスーパークラスを解放していることになる。
 */
public abstract class Factory {

	public final Product create(String owner) {
		Product p = createProduct(owner);
		registerProduct(p);
		return p;
	}

	protected abstract Product createProduct(String owner);
	protected abstract void registerProduct(Product product);
}
