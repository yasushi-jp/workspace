package bridge;

/**
 * 実装のクラス階層：「表示する」クラス<BR>
 * <BR>
 * Implementor（実装者）の役<BR>
 *「実装のクラス階層」の最上位クラス。
 * Abstraction役のインターフェース（API）を実装するためのメソッドを規定する役。
 *
 */
public abstract class DisplayImpl {
	public abstract void rawOpen();
	public abstract void rawPrint();
	public abstract void rawClose();
}
