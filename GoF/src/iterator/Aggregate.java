package iterator;

/**
 * 集合体を表すインターフェース<BR>
 * <BR>
 * Iterator役を作りだすインターフェース（API）を定める役。<BR>
 * Aggregateインターフェース（API）は、「私が持っている要素を順番にスキャンしてくれる人」を
 * 作り出すメソッド。
 * 当インターフェースがこの役をつとめ、iteratorメソッドを定める。
 *
 * @param <E>
 *
 */
public interface Aggregate<E> {
	public abstract Iterator<E> iterator();
}
