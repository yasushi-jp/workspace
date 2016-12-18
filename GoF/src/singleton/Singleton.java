package singleton;

/**
 * インスタンスが1つしか存在しないクラス<BR>
 * <BR>
 * Singletonの役<BR>
 * Singletonの役は唯一のインスタンスを得るためのstaticメソッドを持っている。
 * このメソッドはいつも同じインスタンスを返す。
 */
public class Singleton {

	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("インスタンスを生成しました。");
	}

	public static Singleton getInstance() {
		return singleton;
	}
}
