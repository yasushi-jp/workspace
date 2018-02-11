package state;

/**
 * Stateを実装しているクラス。（昼間の状態を表す）<BR>
 * ConcreteState（具体的な状態）の役<BR>
 * <PRE>
 * ConcreteState役は、具体的な個々の状態を表現するものである。
 * State役で定められたインタフェース（API）を具体的に実装する。
 * </PRE>
 */
public class DayState implements State {

	private static DayState singleton = new DayState();
	private DayState() {					// コンストラクタはprivate
	}

	public static State getInstance() {		// 唯一のインスタンスを得る
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {	// 時刻設定
		if (hour < 9 || 17 <= hour) {
			context.changeState(NightState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {				// 金庫使用
		context.recordLog("金庫使用（昼間）");
	}

	@Override
	public void doAlarm(Context context) {				// 非常ベル
		context.callSecurityCenter("非常ベル（昼間）");
	}

	@Override
	public void doPhone(Context context) {				// 通常通話
		context.callSecurityCenter("通常の通話（昼間）");
	}

	@Override
	public String toString() {							// 文字列表現
		return "[昼間]";
	}
}
