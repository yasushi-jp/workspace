package abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;

/**
 * 抽象的な製品：HTMLのページを表すクラス<BR>
 * <BR>
 * AbstractProduct（抽象的な製品）の役<BR>
 * AbstractProduct役はAbstractFactory役によって作り出される抽象的な部品や製品の
 * インターフェース（API）を定める。
 */
public abstract class Page {

	protected String title;
	protected String author;
	protected ArrayList<Item> content = new ArrayList<Item>();

	public Page(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void add(Item item) {
		content.add(item);
	}

	public void output() {
		try {
			String filename = title + ".html";
			Writer writer = new FileWriter(filename);
			writer.write(this.makeHTML());
			writer.close();
			System.out.println(filename + "を作成しました。");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public abstract String makeHTML();
}
