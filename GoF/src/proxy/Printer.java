package proxy;

/**
 * 名前つきのプリンタを表すクラス（本人）<BR>
 * RealSubject（実際の主体）の役<BR>
 * <PRE>
 * 「代理人」のProxy役では手に負えなくなったときに登場するのが、
 * 「本人」のRealsubject役である。
 * この役も、Proxy役と同じくSubject役で定められているインタフェース（API）を実装している。
 * </PRE>
 */
public class Printer implements Printable {

	private String name;

	public Printer() {				// コンストラクタ
		hevyJob("Printerのインスタンスを生成中");
	}

	public Printer(String name) {	// コンストラクタ
		this.name = name;
		hevyJob("Printerのインスタンス（" + name + "）を生成中");
	}

	@Override
	public void setPrinterName(String name) {	// 名前の設定
		this.name = name;
	}

	@Override
	public String getPrinterName() {			// 名前の習得
		return name;
	}

	@Override
	public void print(String string) {			// 名前つきで表示
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}

	private void hevyJob(String msg) {	// 多い作業（のつもり）
		System.out.print(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.println("完了。");

	}
}
