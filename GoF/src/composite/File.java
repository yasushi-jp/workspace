package composite;

/**
 * ファイルを表すクラス<BR>
 *
 * Leaf（葉）の役<BR>
 * 「中身」を表す役。この役の中には、他のものを入れることができない。
 *
 */
public class File extends Entry {

	private String name;
	private int size;


	/**
	 * コンストラクタ
	 * @param name 名称
	 * @param size サイズ
	 */
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	protected void printList(String prefix) {
		System.out.println(prefix + "/" + this);
	}

}
