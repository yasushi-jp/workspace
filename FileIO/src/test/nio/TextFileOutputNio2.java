package test.nio;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * テキストファイルへの書き込み
 */
public class TextFileOutputNio2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込みファイルの名前
		Path path = Paths.get("C:/dk", "test.txt");

		try (
			// 出力ストリームの生成
			BufferedWriter bw = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
			PrintWriter pw = new PrintWriter(bw);
		){
			// ファイルへの書き込み
			for (int i= 1; i <= 2; i++) {
				pw.println("テキストファイル出力" + String.format("%02d", i));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
