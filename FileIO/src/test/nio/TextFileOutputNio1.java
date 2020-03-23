package test.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * テキストファイルへの書き込み
 */
public class TextFileOutputNio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込みファイルの名前
		Path path = Paths.get("C:/dk", "output.txt");

		// BufferedWriterの生成
		try (BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8)) {

			// ファイルへの書き込み
			for (int i= 1; i <= 2; i++) {
				bw.write("テキストファイル出力" + String.format("%02d", i));
				bw.newLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
