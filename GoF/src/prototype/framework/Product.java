package prototype.framework;

/**
 * 抽象メソッドuseとcreateCloneが宣言されているインターフェース
 *
 */
public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
}
