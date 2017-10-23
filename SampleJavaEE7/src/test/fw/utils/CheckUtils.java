package test.fw.utils;

public class CheckUtils {

	/**
	 * 文字列が「半角英数字」のみか？
	 */
	private static final String P_ALPHA_DIGIT_ONLY = "^[0-9A-Za-z]+$";

	/**
	 * 全て半角英数字か？
	 *
	 * @param str
	 *            チェック対象文字列
	 * @return はい：true いいえ：false
	 */
	public static boolean checkAlphanum(String str, boolean requiredFlg) {
		if (str == null || str.length() == 0) {
			return requiredFlg;
		}
		return str.matches(P_ALPHA_DIGIT_ONLY);
	}

}
