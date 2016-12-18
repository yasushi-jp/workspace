package abstractfactory.factory;

/**
 * 抽象的な部品：HTMLのリンクを表すクラス<br>
 * <BR>
 * AbstractProduct（抽象的な製品）の役<BR>
 * AbstractProduct役はAbstractFactory役によって作り出される抽象的な部品や製品の
 * インターフェース（API）を定める。
 */
public abstract class Link extends Item {

	protected String url;

	public Link(String caption, String url) {
		super(caption);
		this.url = url;
	}

}
