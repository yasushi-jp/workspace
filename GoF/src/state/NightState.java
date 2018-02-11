package state;

/**
 * Stateを表すクラス。（夜間の状態を表す）<BR>
 * ConcreteState（具体的な状態）の役<BR>
 * <PRE>
 * ConcreteState役は、具体的な個々の状態を表現するものである。
 * State役で定められたインタフェース（API）を具体的に実装する。
 * </PRE>
 */
public class NightState implements State {

	private static NightState singleton = new NightState();
	private NightState() {					// コンストラクタはprivate
	}

	public static State getInstance() {		// 唯一のインスタンスを得る
		return singleton;
	}

	@Override
	public void doClock(Context context, int hour) {	// 時刻設定
		if (9 <= hour && hour < 17) {
			context.changeState(DayState.getInstance());
		}
	}

	@Override
	public void doUse(Context context) {				// 金庫使用
		context.callSecurityCenter("非常：夜間の金庫使用！");
	}

	@Override
	public void doAlarm(Context context) {				// 非常ベル
		context.callSecurityCenter("非常ベル（夜間）");
	}

	@Override
	public void doPhone(Context context) {				// 通常通話
		context.recordLog("夜間の通話録音");
	}

	@Override
	public String toString() {							// 文字列表現
		return "[夜間]";
	}
}
