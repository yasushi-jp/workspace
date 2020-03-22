package test.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * テキストファイルへの書き込み
 */
public class TextFileOutput1 {

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
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw = new BufferedWriter(osw);
		){
			// ファイルへの書き込み
			bw.write("テキストファイル出力01");
			bw.newLine();
			bw.write("テキストファイル出力01");
			bw.newLine();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
