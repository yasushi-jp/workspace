package test;

import java.text.Normalizer;

public class SampleMan {

	public static void main(String[] args) {

		String str = null;
		str = "あいうえお";
		System.out.println(str + ":" + SurrogatePairChecker.canEncodinf(str, "MS932"));

		str = "１２３４５";
		System.out.println(str + ":" + SurrogatePairChecker.canEncodinf(str, "MS932"));

		str = "１２①４５";
		System.out.println(str + ":" + SurrogatePairChecker.canEncodinf(str, "MS932"));

		str = "１２𩊠４５";
		System.out.println(str + ":" + SurrogatePairChecker.canEncodinf(str, "MS932"));

		// サロゲートペア文字数
		str = "𩊠１1";
		System.out.println(str);
		System.out.println(str.length());							// サロゲートペアを2文字でカウント
		System.out.println(str.codePointCount(0, str.length()));	// サロゲートペアを1文字でカウント
		System.out.println(SurrogatePairChecker.stringLength(str));	// サロゲートペアを1文字でカウント

		// 結合文字
		str = "𩊠か\u3099ある";
		System.out.println(str);
		System.out.println(str.length());							// 結合文字を2文字でカウント
		System.out.println(str.codePointCount(0, str.length()));	// 結合文字を2文字でカウント
		System.out.println(SurrogatePairChecker.stringLength(str));	// 結合文字を1文字でカウント

		// 結合文字（変換）
		str = "𩊠か\u3099ある";
		System.out.println(str);
		str = Normalizer.normalize(str, Normalizer.Form.NFC);		// 結合文字を1文字に変換
		System.out.println(str);
		System.out.println(str.length());							// サロゲートペアを2文字でカウント
		System.out.println(str.codePointCount(0, str.length()));	// 結サロゲートペアを1文字でカウント

	}

}
