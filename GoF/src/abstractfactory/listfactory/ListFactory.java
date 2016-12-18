package abstractfactory.listfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * 具体的な工場を表すクラス（ListLink, ListTray, ListPageを作る）<BR>
 * <BR>
 * ConcleteFactory（具体的な工場）の役<BR>
 * ConcleteFactory役はAbstractFactory役のインターフェース（API）を実装する。
 */
public class ListFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new ListLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return  new ListTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new ListPage(title, author);
	}

}
