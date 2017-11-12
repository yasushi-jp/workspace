package visitor;

import java.util.Iterator;

/**
 * FileとDirectoryのスーパークラスとなる抽象クラス（Acceptorインターフェースを実装）
 *
 */
public abstract class Entry implements Element {

	/**
	 * 名前を取得する。
	 *
	 * @return 名前
	 */
	public abstract String getName();

	/**
	 * サイズを取得する
	 *
	 * @return サイズ
	 */
	public abstract int getSize();

	/**
	 * エントリを追加する。
	 *
	 * @param entry エントリ
	 * @return 追加後のエントリ
	 * @throws FileTreatmentException
	 */
	public Entry add(Entry entry) throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	/**
	 * Iteratorを返す。
	 *
	 * @return Iterator
	 * @throws FileTreatmentException
	 */
	public Iterator<Entry> iterator()  throws FileTreatmentException {
		throw new FileTreatmentException();
	}

	/**
	 * 文字列表現
	 */
	public String toString() {
		return getName() + " (" + getSize() + ")";
	}
}
