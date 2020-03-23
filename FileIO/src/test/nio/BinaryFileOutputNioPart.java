package test.nio;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * バイナリーファイルを書き込む
 */
public class BinaryFileOutputNioPart {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// 書き込みファイルの名前
		Path path = Paths.get("C:/dk", "output.dat");

		// バイナリデータ
		byte[] data1 = { (byte)0xe3, (byte)0x83, (byte)0x86, (byte)0xe3, (byte)0x82, (byte)0xad, (byte)0xe3, (byte)0x82, (byte)0xb9, (byte)0xe3, (byte)0x83, (byte)0x88, (byte)0xe3, (byte)0x83, (byte)0x95, (byte)0xe3, (byte)0x82, (byte)0xa1, (byte)0xe3, (byte)0x82, (byte)0xa4, (byte)0xe3, (byte)0x83, (byte)0xab, (byte)0xe5, (byte)0x87, (byte)0xba, (byte)0xe5, (byte)0x8a, (byte)0x9b, (byte)0x30, (byte)0x31, (byte)0x0d, (byte)0x0a};
		byte[] data2 = { (byte)0xe3, (byte)0x83, (byte)0x86, (byte)0xe3, (byte)0x82, (byte)0xad, (byte)0xe3, (byte)0x82, (byte)0xb9, (byte)0xe3, (byte)0x83, (byte)0x88, (byte)0xe3, (byte)0x83, (byte)0x95, (byte)0xe3, (byte)0x82, (byte)0xa1, (byte)0xe3, (byte)0x82, (byte)0xa4, (byte)0xe3, (byte)0x83, (byte)0xab, (byte)0xe5, (byte)0x87, (byte)0xba, (byte)0xe5, (byte)0x8a, (byte)0x9b, (byte)0x30, (byte)0x32, (byte)0x0d, (byte)0x0a};

		// バイナリデータ書き込み
		try (OutputStream os = Files.newOutputStream(path)) {
			os.write(data1);
			os.write(data2);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
