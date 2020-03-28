package test.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * バイナリーファイルを読み込む
 */
public class BinaryFileInputOutputNio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		Path path = Paths.get("C:/dk", "input.dat");
		Path path2 = Paths.get("C:/dk", "output.dat");

		try {

			// バイナリファイル一括読み込み
			byte[] data = Files.readAllBytes(path);

			Files.write(path2, data);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
