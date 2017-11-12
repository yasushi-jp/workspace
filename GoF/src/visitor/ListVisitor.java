package visitor;

import java.util.Iterator;

/**
 * Visitorクラスのサブクラスでファイルやディレクトリの一覧を表示するクラス<BR>
 *
 * ConcreteVisitor（具体的訪問者）の役<BR>
 * ConcreteVisitor役は、Visitor役のインターフェース（API）を実装する。
 * visit(XXXX)という形のメソッドを実装し、個々のConcreteElement役ごとの処理を記述する。
 * ListVisitorでcurrentdirフィールドの値が変化したように、visit(XXXX)を処理していく中で、
 * ConcreteVisitor役の内部状態が変化することもある。
 *
 */
public class ListVisitor extends Visitor {

	/** 現在注目しているディレクトリ名 */
	private String currentdir = "";

	/**
	 * ファイルを訪問したときに呼ばれる
	 */
	@Override
	public void visit(File file) {
		System.out.println(currentdir + "/" + file);
	}

	/**
	 * ディレクトリを訪問したときに呼ばれる
	 */
	@Override
	public void visit(Directory directory) {
		System.out.println(currentdir + "/" + directory);
		String savedir = currentdir;
		currentdir = currentdir + "/" + directory.getName();
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			entry.accept(this);
		}
		currentdir = savedir;
	}

}
