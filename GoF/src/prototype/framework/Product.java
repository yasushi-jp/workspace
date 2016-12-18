package prototype.framework;

/**
 * 抽象メソッドuseとcreateCloneが宣言されているインターフェース<BR>
 * <BR>
 * Prototype（原型）の役<BR>
 * Prototype役はインスタンスをコピー（複製）して
 * 新しいインスタンスを作成するためのメソッドを定める。
 *
 */
public interface Product extends Cloneable {
	public abstract void use(String s);
	public abstract Product createClone();
}
