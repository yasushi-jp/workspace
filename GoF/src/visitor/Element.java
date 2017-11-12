package visitor;

/**
 * Visitorクラスのインスタンスを受け入れるデータ構造を表すインターフェース<BR>
 *
 * Element（要素）の役<BR>
 * Element役は、Visitor役の訪問先を表す役。
 * 訪問者を受け入れるacceptメソッドを宣言する。
 * acceptメソッドの引数にはvisitor役が渡される。
 *
 */
public interface Element {
	public abstract void accept(Visitor v);
}
