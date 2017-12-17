package facade.pagemaker;

import java.io.IOException;
import java.io.Writer;

/**
 * HTMLファイルを作成するクラス<BR>
 * <BR>
 * システムを構成しているその他おおぜいの役<BR>
 * <PRE>
 * その他おおぜいの役は、それぞれの仕事を行うが、Facade役のことは意識しない。
 * Facade役から呼び出されて仕事を行うが、その他おおぜいの役からFacade役を呼び出すことはない。
 * </PRE>
 */
public class HtmlWriter {
	private Writer writer;

	/**
	 * コンストラクタ
	 * @param writer Writer
	 */
	public HtmlWriter(Writer writer) {
		this.writer = writer;
	}

	/**
	 * タイトルの出力
	 * @param title タイトル
	 * @throws IOException
	 */
	public void title(String title) throws IOException {
		writer.write("<html>");
		writer.write("<head>");
		writer.write("<title>" + title + "</title>");
		writer.write("</head>");
		writer.write("<body>\n");
		writer.write("<h1>" + title + "</h1>\n");
	}

	/**
	 * 段落の出力
	 * @param msg メッセージ
	 * @throws IOException
	 */
	public void paragraph(String msg) throws IOException {
		writer.write("<p>" + msg + "</p>\n");
	}

	/**
	 * リンクの出力
	 * @param href リンク先
	 * @param caption キャプション
	 * @throws IOException
	 */
	public void link(String href, String caption) throws IOException {
		paragraph("<a href=\"" + href + "\">" + caption + "</a>");
	}

	/**
	 * メールアドレスの出力
	 * @param mailaddr メールアドレス
	 * @param username ユーザー名
	 * @throws IOException
	 */
	public void mailto(String mailaddr, String username) throws IOException {
		link("mailto:" + mailaddr, username);
	}

	/**
	 * クローズ処理
	 * @throws IOException
	 */
	public void close () throws IOException {
		writer.write("</body>");
		writer.write("</html>\n");
		writer.close();
	}
}
