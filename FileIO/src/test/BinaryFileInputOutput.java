package test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * バイナリーデータの読み書き
 */
public class BinaryFileInputOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		String inputFileName = "C:/dk/input.dat";

		// 書き込みファイルの名前
		String outputFileName = "C:/dk/output.dat";

		// ファイルオブジェクトの生成
		File inputFile = new File(inputFileName);
		File outputFile = new File(outputFileName);

		try (
			// 入力ストリームの生成
			FileInputStream fis = new FileInputStream(inputFile);
			BufferedInputStream bis = new BufferedInputStream(fis);

			// 出力ストリームの生成
			FileOutputStream fos = new FileOutputStream(outputFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		){
			// 読み込み用バイト配列
			byte[] buf = new byte[1024];

			// ファイルへの読み書き
			int len = 0;
			while ((len = bis.read(buf)) != -1) {
				 bos.write(buf, 0, len);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
