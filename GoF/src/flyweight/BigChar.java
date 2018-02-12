package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 「大きな文字」を表すクラス<BR>
 * Flyweight（フライ級）の役<BR>
 * <PRE>
 * 普通に扱うとプログラムが重くなるので共有した方がよいものを笑わす役。
 * </PRE>
 */
public class BigChar {

	// 文字の名前
	private char charname;
	// 大きな文字を表現する文字列（'#' '.' '\n'の列）
	private String fontdata;

	// コンストラクタ
	public BigChar(char charname) {
		this.charname = charname;
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("big" + charname + ".txt"));
			String line;
			StringBuilder sb = new StringBuilder();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
				sb.append("\n");
			}
			reader.close();
			this.fontdata = sb.toString();
		} catch (IOException e) {
			this.fontdata = charname + "?";
		}
	}

	// 大きな文字を表示する
	public void print() {
		System.out.println(fontdata);
	}
}
