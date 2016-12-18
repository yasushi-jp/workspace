package adapter.delegation;

/**
 * 動作テスト用のクラス<BR>
 * <BR>
 * Client（依頼者）の役<BR>
 * Target役のメソッドを使って仕事をする役。
 * 直流12ボルトで動くノートパソコンの役。
 * 当クラスがこの役をつとめる。
 *
 */
public class Main {

	public static void main(String[] args) {
		Print p = new PrintBanner("Hello");
		p.printWeek();
		p.printStrong();
	}

}
