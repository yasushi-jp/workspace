package test.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * バイナリーファイルを読み込む
 */
public class BinaryFileInputNio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		Path path = Paths.get("C:/dk", "input.dat");

		try {

			// バイナリファイル一括読み込み
			byte[] data = Files.readAllBytes(path);

			// 読み込んだバイナリデータを16進数で標準出力に出力
			for (int i = 0; i < data.length; i++) {
				 System.out.printf("%02x ", data[i]);
			}
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
