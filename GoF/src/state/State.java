package state;

/**
 * 金庫の状態を表すインタフェース<BR>
 * State（状態）役<BR>
 * <PRE>
 * State役は、状態を表すためのものである。
 * 状態ごとに異なる振る舞いをするインタフェース（API）を定める。
 * このインタフェース（API）は、状態に依存した振る舞いをするメソッドの集まりとなる。
 * </PRE>
 */
public interface State {
	public abstract void doClock(Context context, int hour);	// 時刻設定
	public abstract void doUse(Context context);				// 金庫使用
	public abstract void doAlarm(Context context);				// 非常ベル
	public abstract void doPhone(Context context);				// 通常電話
}
