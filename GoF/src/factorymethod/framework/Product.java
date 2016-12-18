package factorymethod.framework;

/**
 * 抽象メソッドuseのみ定義されている抽象クラス<BR>
 * <BR>
 * Product（製品）の役<BR>
 * 生成されるインスタンスが持つべきインターフェース（API）を定める抽象クラス。
 * 具体的な内容は、サブクラスのConcreteProduct役が定める。
 */
public abstract class Product {
	public abstract void use();
}
