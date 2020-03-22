package test.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * バイナリーファイルを読み込む
 */
public class BinaryFileInput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		String inputFileName = "C:/dk/viewcount.xlsx";

		// ファイルオブジェクトの生成
		File inputFile = new File(inputFileName);

		try (
				// 入力ストリームの生成
				FileInputStream fis = new FileInputStream(inputFile);
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			// 読み込み用バイト配列
			byte[] buf = new byte[1024];

			int len = 0;
			// 入力ストリームからの読み込み（ファイルの読み込み）
			while ((len = bis.read(buf)) != -1) {
				String hex;
				for (int i = 0; i < len; i++) {
					hex = String.format("%1$x", buf[i]);
					hex = hex.length() == 1 ? "0" + hex : hex;
					System.out.print(hex + " ");
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
