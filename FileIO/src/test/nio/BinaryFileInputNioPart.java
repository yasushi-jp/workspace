package test.nio;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * バイナリーファイルを読み込む
 */
public class BinaryFileInputNioPart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		Path path = Paths.get("C:/dk", "viewcount.xlsx");

		// 入力ストリームの生成
		try (InputStream inst = Files.newInputStream(path)) {
			// 読み込み用バイト配列
			byte[] buf = new byte[1024];

			int len = 0;
			// 入力ストリームからの読み込み（ファイルの読み込み）
			while ((len = inst.read(buf)) != -1) {
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
