package observer;

/**
 * 観察者を表すインタフェース<BR>
 * <BR>
 * Observer（観察者）の役<BR>
 * <PRE>
 * Observer役は、Subject役から「状態が変化しましたよ」と教えてもらう役である。
 * そのためのメソッドがupdateメソッドである。
 * </PRE>
 */
public interface Observer {
	public abstract void update(NumberGenerator generator);
}
