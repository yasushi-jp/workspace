package builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * HTMLファイルを使って文書を作るクラス<BR>
 * <BR>
 * ConcreteBuilder（具体的建築者）の役<BR>
 * ConcreteBuilder役はBuilder役のインターフェース（API）を実装しているクラス。
 * 実際のインスタンス作成で呼び出されるメソッドがここで実装される。
 * また、最終的にできた結果を得るためのメソッドが用意される。
 *
 */
public class HTMLBuilder extends Builder {

	/** 作成するファイル名 */
	private String filename;

	/** ファイルに書き込むPrintWriter */
	private PrintWriter writer;

	@Override
	public void makeTitle(String title) {
		filename = title + ".html";		// タイトルを元にファイル名を決定
		try {
			writer = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			e.printStackTrace();
		}
		writer.println("<html><head><title>" + title + "</title></head><body>");
		writer.println("<h1>" + title + "</h1>");	// タイトルを出力
	}

	@Override
	public void makeString(String str) {
		// <p>タグで文字列を出力
		writer.println("<p>" + str + "</p>");
	}

	@Override
	public void makeItems(String[] items) {
		// HTMLでの箇条書きを<ul>と<li>で出力
		writer.println("<ul>");
		for (String item : items) {
			writer.println("<li>" + item + "</li>");
		}
		writer.println("</ul>");
	}

	@Override
	public void close() {
		writer.println("</body></html>");	// タグを閉じる
		writer.close();						// ファイルをクローズ
	}

	public String getRsult() {		// 完成した文書
		return filename;			// ファイル名を返す
	}
}
