package visitor;

/**
 * ファイルを表すクラス<BR>
 *
 * ConcreteElement（具体的要素）の役<BR>
 *
 * ConcreteElement役は、Element役のインターフェース（API）を実装する役である。
 *
 */
public class File extends Entry {

	/** 名前 */
	private String name;

	/** サイズ */
	private int size;


	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param size サイズ
	 */
	public File(String name, int size) {
		this.name = name;
		this.size = size;
	}

	/**
	 * 名前を返す
	 *
	 * @return 名前
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * サイズを返す
	 *
	 * @return サイズ
	 */
	@Override
	public int getSize() {
		return size;
	}

	/**
	 * 訪問者の受け入れ
	 */
	@Override
	public void accept(Visitor v) {
		v.visit(this);
	}

}
