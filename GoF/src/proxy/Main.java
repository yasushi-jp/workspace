package proxy;

/**
 * 動作テスト用のクラス<BR>
 * Client（依頼人）の役<BR>
 * <PRE>
 * Proxyパターンを利用する役である。
 * （GoF本ではClient役はProxyパターンの中には含まれない。）
 * </PRE>
 */
public class Main {
	public static void main(String[] args) {
		Printable p = new PrinterProxy("Alice");
		System.out.println("名前は現在" + p.getPrinterName() + "です。");
		p.setPrinterName("Bob");
		System.out.println("名前は現在" + p.getPrinterName() + "です。");
		p.print("Hello, world.");
	}
}
