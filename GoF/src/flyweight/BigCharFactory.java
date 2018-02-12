package flyweight;

import java.util.HashMap;

/**
 * BigCharのインスタンスを共有しながら生成するクラス<BR>
 * FlyweightFactory（フライ級の工場）の役<BR>
 * <PRE>
 * Flyweight役を作る工場の役。
 * この工場を使ってFlyweight役を作ると、インスタンスが共有される。
 * </PRE>
 */
public class BigCharFactory {

	// すでに作ったBigCharのインスタンスを管理
	private HashMap<String, BigChar> pool = new HashMap<>();
	// Singletonパターン
	private static BigCharFactory singleton = new BigCharFactory();
	// コンストラクタ
	private BigCharFactory() {
	}
	// 唯一のインスタンスを得る
	public static BigCharFactory getInstance() {
		return singleton;
	}
	// BigCharのインスタンス生成（共有）
	public synchronized BigChar getBigChar(char charname) {
		BigChar bc = pool.get("" + charname);
		if (bc == null) {
			bc = new BigChar(charname);
			pool.put("" + charname, bc);
		}
		return bc;
	}
}
