package flyweight;

/**
 * 動作テスト用のクラス
 */
public class Main {
	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Usage: java Main digits");
			System.out.println("Exsample: java Main 1212123");
			System.exit(0);
		}

//		BigString bs = new BigString(args[0]);
		BigString bs = new BigString("1121123");
		bs.print();
	}
}
