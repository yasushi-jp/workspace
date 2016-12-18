/**
 *
 */
package adapter.delegation;

/**
 * 変換装置（アダプター）<BR>
 * <BR>
 * Adapterパターンの主人公。
 * Adaptee役のメソッドを使って何とかTarget役を満たそうというのが
 * Adapterパターンの目的であり、Adaptee役の仕事。
 * （交流100ボルトを直流12ボルトに変換するアダプター）
 * 当クラスがこの役をつとめる。
 */
public class PrintBanner extends Print {

	private Banner banner;

	public PrintBanner(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeek() {
		banner.showWithParen();
	}

	@Override
	public void printStrong() {
		banner.showWithAster();
	}

}
