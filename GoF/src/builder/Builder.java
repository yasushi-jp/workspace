package builder;

/**
 * 文書を構成するためのメソッドを定めた抽象クラス<BR>
 * <BR>
 * Builder（建築者）の役<BR>
 * Builder役はインスタンスを作成するためのインターフェース（API）を定める。
 * Builder役にはインスタンスの各部分を作るためのメソッドが用意される。
 *
 */
public abstract class Builder {
	public abstract void makeTitle(String title);
	public abstract void makeString(String str);
	public abstract void makeItems(String[] items);
	public abstract void close();
}
