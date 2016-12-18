package iterator;

/**
 * 数え上げ、スキャンを行うインターフェース<BR>
 * <BR>
 * Iterator（反復子）の役<BR>
 * 要素を順番にスキャンしていくインターフェース（API）を定める役。<BR>
 * 当インターフェースがこの役をつとめ、
 * 次の要素が存在するかどうか得るためのhasNextメソッドと、
 * 次の要素を得るためのnextメソッドを定める。
 */
public interface Iterator<E> {
	public abstract boolean hasNext();
	public abstract E next();
}
