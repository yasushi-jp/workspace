package test.nio;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * テキストファイルの読み込み
 */
public class TextFileInputNioPart1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		Path path = Paths.get("C:/dk", "input.txt");

		// BufferedReaderの生成
		try (BufferedReader br = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {

			String msg;

			// テキストファイルからの読み込み
			while ((msg = br.readLine()) != null) {

				// 標準出力に出力
				System.out.println(msg);

			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
