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
		Path path = Paths.get("C:/dk", "test.txt");

		try {
			byte[] data = Files.readAllBytes(path);
			String hex;
			for (int i = 0; i < data.length; i++) {
				hex = String.format("%1$x", data[i]);
				hex = hex.length() == 1 ? "0" + hex : hex;
				System.out.print(hex + " ");
			}
			System.out.println();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
