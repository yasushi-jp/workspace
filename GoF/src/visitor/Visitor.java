package visitor;

/**
 * ファイルやディレクトリを訪れる訪問者を表す抽象クラス<BR>
 *
 * Visitor（訪問者）の役<BR>
 * Visitor役は、データ構造の具体的な要素（ConcreteElement役）ごとに
 * 「XXXXを訪問した」というvisit(XXXX)メソッドを宣言する。
 * visit(XXXX)はXXXXを処理するためのメソッドで、実際のコードはConcreteVisitor役の側に書かれる。
 *
 */
public abstract class Visitor {

	public abstract void visit(File file);
	public abstract void visit(Directory directory);

}
