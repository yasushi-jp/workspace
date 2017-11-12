package composite;

/**
 * FileとDirectoryを同一視する抽象クラス<BR>
 *
 * Compornentの役<BR>
 * Leaf役（File）とComposite役（Directory）を同一視するための役<BR>
 * Compornent役は、Leaf役とComposite役に共通のスーパークラスとして実現する。<BR>
 *
 */
public abstract class Entry {

	/** 名前を取得する */
	public abstract String getName();

	/** サイズを取得する */
	public abstract int getSize();

	/** エントリを追加する */
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	/**
	 * 一覧を表示する
	 */
	public void printList() {
		printList("");
	}

	/** prefixを前に付けて一覧を表示する */
	protected abstract void printList(String prefix);

	/** 文字列表現 */
	@Override
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
