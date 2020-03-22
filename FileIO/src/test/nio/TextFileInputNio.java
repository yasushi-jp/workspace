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
		Path path = Paths.get("C:/dk", "test.txt");

		// ファイルオブジェクトの生成
		try {
			List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
			lines.forEach(line -> System.out.println(line));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
