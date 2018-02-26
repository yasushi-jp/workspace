package proxy;

/**
 * PrinterとPrinterProxyに共通のインタフェース<BR>
 * Subject（主体）の役<BR>
 * <PRE>
 * Proxy役とRealSubject役を同一視するためのインタフェース（API）を定める。
 * Subject役があるおかげで、Client役は、Proxy役とRealSubject役の違いを意識する必要がない。
 * </PRE>
 */
public interface Printable {
	public abstract void setPrinterName(String name);	// 名前の設定
	public abstract String getPrinterName();			// 名前の習得
	public abstract void print(String string);			// 文字列表示（プリントアウト）
}
