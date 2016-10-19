package test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * バイナリーデータをファイルに書き込む
 */
public class BinaryFileOutput {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込むデータ
		 byte[] data = { 0x41, 0x42, 0x43, 0x0d, 0x0a };

		// 書き込みファイルの名前
		String outputFileName = "C:/dk/test.dat";

		// ファイルオブジェクトの生成
		File outputFile = new File(outputFileName);

		try (
			// 出力ストリームの生成
			FileOutputStream fos = new FileOutputStream(outputFile);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
		){
			// 出力ストリームへの書き込み（ファイルへの書き込み）
			bos.write(data);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
