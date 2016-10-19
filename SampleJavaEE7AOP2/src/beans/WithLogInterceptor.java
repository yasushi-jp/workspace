package beans;

import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.annotation.Priority;
import javax.annotation.Resource;
import javax.enterprise.context.Dependent;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Interceptor		// インターセプターの宣言
@Dependent
@WithLog			// バインド用アノテーション
@Priority(Interceptor.Priority.APPLICATION)		// 優先度
public class WithLogInterceptor implements Serializable {

	// プロデューサー経由でロガー取得
	@Inject
	transient Logger logger;

	// アプリケーション名の取得
	@Resource(lookup="java:app/AppName")
	private String appName;

	/**
	 * インターセプターのメソッド
	 * @param ic 実行コンテキスト - 本来実行される処理。
	 * @return 本来実行される処理の戻り値
	 * @throws Exception 何らかの例外
	 */
	@AroundInvoke
	public Object invoke(InvocationContext ic) throws Exception {

		// ターゲットは、CDIのクライアントプロキシなので、スーパークラスを取得。
		String classAndMethod = ic.getTarget().getClass().getSuperclass().getName()
				+ "#" + ic.getMethod().getName();

		// メソッド開始前のログ
		logger.info(() -> appName + ":" + classAndMethod + " start.");

		Object ret = null;
		try {
			// メソッドの実行
			System.out.println("call by interceptor");
			ret = ic.proceed();
		} catch (Exception e) {
			// 例外のログを出したら、例外はそのまま再スローする。
			// トランザクションインターセプターの内部で処理されるので、
			// ここでは根本例外が出る。
			logger.log(Level.SEVERE, appName, e);
			throw e;
		}

		// メソッド終了後のログ
		logger.info(() -> appName + ":" + classAndMethod + " end.");

		return ret;
	}
}
