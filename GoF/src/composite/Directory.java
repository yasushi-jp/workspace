package composite;

import java.util.ArrayList;

/**
 * ディレクトリを表すクラス
 *
 */
public class Directory extends Entry {

	/** ディレクトリの名前 */
	private String name;

	/** ディレクトリエントリの集合 */
	private ArrayList<Entry> directory = new ArrayList<Entry>();

	@Override
	public String getName() {
		// TODO 自動生成されたメソッド・スタブ
		return null;
	}

	@Override
	public int getSize() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	protected void printList(String prefix) {
		// TODO 自動生成されたメソッド・スタブ

	}

}
