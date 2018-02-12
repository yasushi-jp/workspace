package flyweight;

/**
 * BigCharを集めて作った「大きな文字列」を表すクラス<BR>
 * Client（依頼者）の役<BR>
 * <PRE>
 * FlyweightFactory役を使ってFlyweight役を作り出し、それを利用する役。
 * </PRE>
 */
public class BigString {

	// 「大きな文字」の配列
	private BigChar[] bigchars;

	// コンストラクタ
	public BigString(String string) {
		bigchars= new BigChar[string.length()];
		BigCharFactory factory = BigCharFactory.getInstance();
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i] = factory.getBigChar(string.charAt(i));
		}
	}

	// 表示
	public void print() {
		for (int i = 0; i < bigchars.length; i++) {
			bigchars[i].print();
		}
	}
}
