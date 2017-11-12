package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ディレクトリを表すクラス<BR>
 *
 * ConcreteElement（具体的要素）の役<BR>
 * ConcreteElement役は、Element役のインターフェース（API）を実装する役である。
 *
 * ObjectStructure（オブジェクトの構造）の役<BR>
 * ObjectStructure役はElement役の集合を扱う役である。
 * ConcreteVisitor役が個々のElement役を扱えるようなメソッドを揃えている。
 * （ここではConcreteVisitor役が個々のElement役を扱えるようにiteratorメソッドが用意されている。）
 *
 */
public class Directory extends Entry {

	/** ディレクトリの名前 */
	private String name;

	/** ディレクトリエントリの集合 */
	private List<Entry> dir = new ArrayList<>();

	/**
	 * コンストラクタ
	 *
	 * @param name
	 *            ディレクトリの名前
	 */
	public Directory(String name) {
		this.name = name;
	}

	/**
	 * ディレクトリの名前を取得する。
	 *
	 * @return ディレクトリの名前
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * ディレクトリのサイズを取得する。
	 *
	 * @return ディレクトリのサイズ
	 */
	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> it = dir.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			size += entry.getSize();
		}
		return size;
	}

	/**
	 * エントリを追加する。
	 *
	 * @return エントリ
	 */
	@Override
	public Entry add(Entry entry) {
		dir.add(entry);
		return this;
	}
	/**
	 * Iteratorを返す。
	 *
	 * @return Iterator
	 */
	@Override
	public Iterator<Entry> iterator() {
		return dir.iterator();
	}

	/**
	 * 訪問者の受け入れ
	 */
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
