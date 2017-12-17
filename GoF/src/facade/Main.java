package facade;

import facade.pagemaker.PageMaker;

/**
 * 動作テスト用のクラス<BR>
 * <BR>
 * Client（依頼人）の役<BR>
 * <PRE>
 * Facadeパターンを利用する役。
 * （GoF本ではClient役はFacadeパターンに含まれていない。）
 * </PRE>
 */
public class Main {
	public static void main(String[] args) {
		PageMaker.makeWelcomePage("hyuki@hyuki.com", "welcome.html");
	}
}
