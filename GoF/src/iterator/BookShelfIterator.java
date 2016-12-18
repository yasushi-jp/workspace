package iterator;

/**
 * 本棚をスキャンするクラス<BR>
 * <BR>
 * Iterator役が定めたインターフェース（API）を実際に実装する役。<BR>
 * 当クラスがこの役をつとめる。
 * この役はスキャンするために必要な情報を持っている必要がある。
 * 当クラスにBookshelfのインスタンスをbookshelfフィールドで覚えており、
 * 注目している本をindexフィールドで覚えている。
 */
public class BookShelfIterator implements Iterator<Book> {

	private BookShelf bookShelf;
	private int index;


	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Book next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}


}
