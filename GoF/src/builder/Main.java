package builder;

/**
 * 動作テスト用のクラス<BR>
 * <BR>
 * Client（依頼人）の役<BR>
 * Builderパターンを利用する役。
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			usage();
			System.exit(0);
		}

		if (args[0].equals("plain")) {
			TextBuilder textbuilder = new TextBuilder();
			Director director = new Director(textbuilder);
			director.construct();
			String result = textbuilder.getResult();
			System.out.println(result);
		} else if (args[0].equals("html")) {
			HTMLBuilder htmlbuilder = new HTMLBuilder();
			Director director = new Director(htmlbuilder);
			director.construct();
			String filename = htmlbuilder.getRsult();
			System.out.println(filename + "が作成されました。");
		} else {
			usage();
			System.exit(0);
		}
	}

	public static void usage() {
		System.out.println("Usage: Java Main plain プレーンテキストで文書作成");
		System.out.println("Usage: Java Main html  HTMLファイルで文書作成");
	}
}
