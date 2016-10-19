package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 文字コードを指定してテキストファイルを読み込む
 */
public class TextFileInputCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 読み込みファイルの名前
		String inputFileName = "C:/dk/test.txt";

		// ファイルオブジェクトの生成
		File inputFile = new File(inputFileName);

		try (
			// 入力ストリームの生成
			FileInputStream fis = new FileInputStream(inputFile);

			// ISO-2022-JP or ISO2022JP : JISコード（ISO-2022-JP）
			// Shift_JIS   or SJIS      : シフトJISコード（Shift_JIS）
			// EUC-JP      or EUC_JP    : 日本語EUCコード（EUC-JP）
			// UTF-8                    : Unicode（UTF-8）
			// UTF-16                   : Unicode（UTF-16）
			// JISAutoDetect            : 文字コードの自動判定（Readerクラスのみ利用可）
			InputStreamReader isr = new InputStreamReader(fis, "SJIS");
			BufferedReader br = new BufferedReader(isr);
		){
			// テキストファイルからの読み込み
			String msg;
			while ((msg = br.readLine()) != null) {
				System.out.println(msg);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
