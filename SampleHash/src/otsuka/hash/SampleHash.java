package otsuka.hash;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SampleHash {

	public static final String MD2 = "MD2";
	public static final String MD5 = "MD5";
	public static final String SHA_1 = "SHA-1";
	public static final String SHA_256 = "SHA-256";
	public static final String SHA_512 = "SHA-512";

	public static byte[] getfileHash(String fileName, String algorithmName) {

		byte[] digest = null;

		// 入力ストリームの生成
		try {
			MessageDigest md = MessageDigest.getInstance(algorithmName);
			DigestInputStream dis = new DigestInputStream(new BufferedInputStream(new FileInputStream(fileName)), md);

			// ファイルの読み込み
			while (dis.read() != -1) {
			}

			// ハッシュ値の計算
			digest = md.digest();

			dis.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO 自動生成された catch ブロック
			e.printStackTrace();
		}

		return digest;
	}

	public static String byteArrayToString(byte[] binArray) {
		StringBuilder sb = new StringBuilder();
		for (byte b : binArray) {
	        String hex = String.format("%02x", b);
	        sb.append(hex);
	    }
		return sb.toString();
	}
}