package test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * テキストファイルへの書き込み（文字コード指定）
 */
public class TextFileOutputCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込みファイルの名前
		String outputFileName = "C:/dk/test.txt";

		// ファイルオブジェクトの生成
		File outputFile = new File(outputFileName);

		try (
			// 出力ストリームの生成
			FileOutputStream fos = new FileOutputStream(outputFile);

			// ISO-2022-JP or ISO2022JP : JISコード（ISO-2022-JP）
			// Shift_JIS   or SJIS      : シフトJISコード（Shift_JIS）
			// EUC-JP      or EUC_JP    : 日本語EUCコード（EUC-JP）
			// UTF-8                    : Unicode（UTF-8）
			// UTF-16                   : Unicode（UTF-16）
			// JISAutoDetect            : 文字コードの自動判定（Readerクラスのみ利用可）
			OutputStreamWriter osw = new OutputStreamWriter(fos, "SJIS");
			PrintWriter pw = new PrintWriter(osw);
		){
			// ファイルへの書き込み
			pw.println("テキストファイル出力01（SJIS）");
			pw.println("テキストファイル出力02（SJIS）");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
