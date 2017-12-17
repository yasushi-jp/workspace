package facade.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * メールアドレスからユーザのWebページを作成するクラス<BR>
 * <BR>
 * Facade（正面）の役<BR>
 * <PRE>
 * Facade役は、システムを構成しているその他おおぜいの役の「シンプルな窓口」となる。
 * Facade役は、高レベルでシンプルなインターフェース（API）をシステム外部に提供する。
 * </PRE>
 */
public class PageMaker {

	private PageMaker() {	// インスタンスは作らないのでprivate宣言する
	}

	public static void makeWelcomePage(String mailaddr, String filename) {
		try {
			Properties mailprop = Database.getProperties("maildata");
			String username = mailprop.getProperty(mailaddr);
			HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
			writer.title("Welcome to " + username + "'s page!");
			writer.paragraph(username + "のページへようこそ。");
			writer.paragraph("メールまっていますね。");
			writer.mailto(mailaddr, username);
			writer.close();
			System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
