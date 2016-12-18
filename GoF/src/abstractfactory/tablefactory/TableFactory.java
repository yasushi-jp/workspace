package abstractfactory.tablefactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * 具体的な工場を表すクラス（TableLink, TableTray, TablePageを作る）<BR>
 * <BR>
 * ConcleteFactory（具体的な工場）の役<BR>
 * ConcleteFactory役はAbstractFactory役のインターフェース（API）を実装する。
 */
public class TableFactory extends Factory {

	@Override
	public Link createLink(String caption, String url) {
		return new TableLink(caption, url);
	}

	@Override
	public Tray createTray(String caption) {
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		return new TablePage(title, author);
	}

}
