package test;

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

	}

}
