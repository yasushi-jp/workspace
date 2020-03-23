package test.nio;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * テキストファイルの読み込み
 */
public class TextFileInputNio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		Path path = Paths.get("C:/dk", "input.txt");

		try {

			// テキストファイルを一括読み込み
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);

			// 読み込んだテキストファイルを標準出力に出力
			lines.forEach(line -> System.out.println(line));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
