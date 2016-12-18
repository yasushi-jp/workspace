package iterator;

/**
 * 本棚を表すクラス<BR>
 * <BR>
 * Agregate役が定めたインターフェース（API）を実際に実装する役。<BR>
 * 具体的にはIterator役、すなわちConcreteIterator役のインスタンスを作り出す。
 * 当クラスがこの役をつとめ、iteratorメソッドを実装している。
 *
 */
public class BookShelf implements Aggregate<Book> {

	private Book[] books;
	private int last = 0;

	public BookShelf(int maxsize) {
		this.books = new Book[maxsize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}

	public int getLength() {
		return last;
	}

	@Override
	public Iterator<Book> iterator() {
		return new BookShelfIterator(this);
	}



}
