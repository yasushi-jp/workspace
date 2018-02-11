package state;

/**
 * 金庫の状態変化を管理し、警備センターとの連絡をとるインターフェース。<BR>
 * Context（状況、前後関係、文脈）の役<BR>
 * <PRE>
 * Context役は、現在の状態を表すConcreteState役を持つ。
 * また、Stateパターンの利用者に必要なインタフェース（API）を定める。
 * </PRE>
 */
public interface Context {
	public abstract void setClock(int hour);				// 時刻の設定
	public abstract void changeState(State state);			// 状態変化
	public abstract void callSecurityCenter(String msg);	// 警備センター呼び出し
	public abstract void recordLog(String msg);				// 警備センター記録
}
