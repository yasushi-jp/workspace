package test.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * テキストファイルの読み込み
 */
public class TextFileInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		String inputFileName = "C:/dk/test.txt";

		// ファイルオブジェクトの生成
		File inputFile = new File(inputFileName);

		try (
			// 入力ストリームの生成
			FileInputStream fis = new FileInputStream(inputFile);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
		){
			// テキストファイルからの読み込み
			String msg;
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
