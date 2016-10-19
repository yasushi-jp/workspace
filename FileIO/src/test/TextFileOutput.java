package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * テキストファイルへの書き込み
 */
public class TextFileOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込みファイルの名前
		String outputFileName = "C:/dk/test.txt";

		// ファイルオブジェクトの生成
		File outputFile = new File(outputFileName);

		try (
			// 出力ストリームの生成
			FileOutputStream fos = new FileOutputStream(outputFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos);
			PrintWriter pw = new PrintWriter(osw);
		){
			// ファイルへの書き込み
			pw.println("テキストファイル出力01");
			pw.println("テキストファイル出力02");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
