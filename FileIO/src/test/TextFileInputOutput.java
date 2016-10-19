package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * テキストファイルの読み書き
 */
public class TextFileInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		String inputFileName = "C:/dk/test.txt";

		// 書き込みファイルの名前
		String outputFileName = "C:/dk/test_utf8.txt";

		// ファイルオブジェクトの生成
		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);

		try (
			// 入力ストリームの生成
			FileInputStream fis = new FileInputStream(inputFile);
			InputStreamReader isr = new InputStreamReader(fis, "SJIS");
			BufferedReader br = new BufferedReader(isr);

			// 出力ストリームの生成
			FileOutputStream fos = new FileOutputStream(outputFile);
			OutputStreamWriter osw = new OutputStreamWriter(fos,"UTF-8");
			PrintWriter pw = new PrintWriter(osw);
		){
			// テキストファイルからの読み込み
			String msg;
			while ((msg = br.readLine()) != null) {
				pw.println(msg);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
