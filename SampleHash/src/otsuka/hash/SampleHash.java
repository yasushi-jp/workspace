package otsuka.hash;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ハッシュ値を求めるクラス
 *
 * @author yasushi
 *
 */
public class SampleHash {

	/** MD2アルゴリズム */
	public static final String MD2 = "MD2";
	/** MD5アルゴリズム */
	public static final String MD5 = "MD5";
	/** SHA-1アルゴリズム */
	public static final String SHA_1 = "SHA-1";
	/** SHA-256アルゴリズム */
	public static final String SHA_256 = "SHA-256";
	/** SHA-512アルゴリズム */
	public static final String SHA_512 = "SHA-512";

	/**
	 * ファイルのハッシュ値を返す
	 * @param fileName ファイルパス
	 * @param algorithmName アルゴリズム
	 * @return ハッシュ値
	 */
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

	/**
	 * ファイルのハッシュ値（String）を返す
	 * @param fileName ファイルパス
	 * @param algorithmName アルゴリズム
	 * @return ハッシュ値（String）
	 */
	public static String getfileHashString(String fileName, String algorithmName) {

		return byteArrayToString(getfileHash(fileName, algorithmName));
	}

	/**
	 * 文字列のハッシュ値を返す
	 * @param str 文字列
	 * @param algorithmName アルゴリズム
	 * @return ハッシュ値
	 */
	public static byte[] getHash(String str, String algorithmName) {
		return getHash(str.getBytes(), algorithmName);
	}

	/**
	 * 文字列のハッシュ値（String）を返す
	 * @param str 文字列
	 * @param algorithmName アルゴリズム
	 * @return ハッシュ値（String）
	 */
	public static String getHashString(String str, String algorithmName) {
		return byteArrayToString(getHash(str.getBytes(), algorithmName));
	}

	/**
	 * バイト配列のハッシュ値を返す
	 * @param byteArray バイト配列
	 * @param algorithmName アルゴリズム
	 * @return ハッシュ値
	 */
	public static byte[] getHash(byte[] byteArray, String algorithmName) {
		MessageDigest md = null;
		try {
			md = MessageDigest.getInstance(algorithmName);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		// メッセージダイジェスト更新
		md.update(byteArray);

		// ハッシュ値を格納
		return md.digest();
	}

	/**
	 * バイト配列のハッシュ値（String）を返す
	 * @param byteArray バイト配列
	 * @param algorithmName アルゴリズム
	 * @return ハッシュ値
	 */
	public static String getHashString(byte[] byteArray, String algorithmName) {

		// ハッシュ値を格納
		return byteArrayToString(getHash(byteArray, algorithmName));
	}

	/**
	 * バイト配列をアスキー文字列に変換する。
	 *
	 * @param binArray バイト配列
	 * @return アスキー文字列
	 */
	public static String byteArrayToString(byte[] binArray) {
		StringBuilder sb = new StringBuilder();
		for (byte b : binArray) {
			String hex = String.format("%02x", b);
			sb.append(hex);
		}
		return sb.toString();
	}

	/**
	 * バイト配列をアスキー文字列に変換する。
	 *
	 * @param binArray バイト配列
	 * @return アスキー文字列
	 */
	public static String byteArrayToString2(byte[] binArray) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < binArray.length; i++) {
			String tmpStr = Integer.toHexString(binArray[i] & 0xff);
			if (tmpStr.length() == 1) {
				sb.append('0').append(tmpStr);
			} else {
				sb.append(tmpStr);
			}
		}
		return sb.toString();
	}

}