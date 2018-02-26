package proxy;

/**
 * 名前つきのプリンタを表すクラス（代理人）<BR>
 * Proxy（代理人）の役<BR>
 * <PRE>
 * Proxy役はClient役の要求をできるだけ処理する。
 * もしも、自分だけでは処理できなかったら、Proxy役はRealSubject役に仕事をおまかせする。
 * Proxy役は、ほんとうにRealSubject役が必要になったらRealSubject役を生成する。
 * Proxy役はSubject役で定められているインタフェース（API）を実装している。
 * </PRE>
 */
public class PrinterProxy implements Printable {

	private String name;	// 名前
	private Printer real;	// 「本人」

	public PrinterProxy() {				// コンストラクタ
	}

	public PrinterProxy(String name) {	// コンストラクタ
		this.name = name;
	}

	@Override
	public synchronized void setPrinterName(String name) {	// 名前の設定
		if (real != null) {
			real.setPrinterName(name);	// 「本人」にも設定する
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {	// 名前の習得
		return name;
	}

	@Override
	public void print(String string) {	// 表示
		realize();
		real.print(string);
	}

	private synchronized void realize() {	// 「本人」を生成
		if (real == null) {
			real = new Printer(name);
		}
	}
}
