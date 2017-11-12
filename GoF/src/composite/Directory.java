package composite;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * ディレクトリを表すクラス<BR>
 *
 * Composite（複合体）の役<BR>
 * 「容器」を表す役。Leaf役（File）やComposite役（Directory）を入れることができる。<BR>
 *
 */
public class Directory extends Entry {

	/** ディレクトリの名前 */
	private String name;

	/** ディレクトリエントリの集合 */
	private ArrayList<Entry> directory = new ArrayList<Entry>();

	/** コンストラクタ */
	public Directory(String name) {
		this.name = name;
	}

	/** 名前を取得 */
	@Override
	public String getName() {
		return name;
	}

	/** サイズを取得 */
	@Override
	public int getSize() {
		int size = 0;
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			size += entry.getSize();
		}
		return size;
	}

	/**
	 * エントリの追加
	 */
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}

	/**
	 * エントリの一覧
	 */
	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
		Iterator<Entry> it = directory.iterator();
		while (it.hasNext()) {
			Entry entry = it.next();
			entry.printList(prefix + "/" + name);
		}
	}

}
