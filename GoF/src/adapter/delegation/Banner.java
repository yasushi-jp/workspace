package adapter.delegation;

/**
 * 提供されているもの（交流100ボルト）<BR>
 * <BR>
 * Adaptee（適合される側）の役<BR>
 * Adapteeはすでに用意されているメソッドを持っている役。（交流100ボルトのAC電源）
 * 当クラスがこの役をつとめる。
 */
public class Banner {
	private String string;

	public Banner(String string) {
		this.string = string;
	}

	public void showWithParen() {
		System.out.println("(" + string + ")");
	}

	public void showWithAster() {
		System.out.println("*" + string + "*");
	}
}
