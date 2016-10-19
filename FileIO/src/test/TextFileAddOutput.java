package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * テキストファイルへの追加書き込み
 */
public class TextFileAddOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込みファイルの名前
		String outputFileName = "C:/dk/test.txt";

		// ファイルオブジェクトの生成
		File outputFile = new File(outputFileName);

		try (
				// 出力ストリームの生成（追記モード）
				FileOutputStream fos = new FileOutputStream(outputFile, true);
				OutputStreamWriter osw = new OutputStreamWriter(fos);
				PrintWriter pw = new PrintWriter(osw);
			){
				// ファイルへの書き込み
				pw.println("テキストファイル追加出力03");
				pw.println("テキストファイル追加出力04");

			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
