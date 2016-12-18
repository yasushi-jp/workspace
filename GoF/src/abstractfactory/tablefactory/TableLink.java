package abstractfactory.tablefactory;

import abstractfactory.factory.Link;

/**
 * 具体的な部品：HTMLのリンクを表すクラス<BR>
 * <BR>
 * ConcleteProduct（具体的な製品）の役<BR>
 * ConcleteProduct役はAbstractProduct役のインターフェース（API）を実装する。
 *
 */
public class TableLink extends Link {


	public TableLink(String caption, String url) {
		super(caption, url);
	}

	@Override
	public String makeHTML() {
		return "<td><a href=\"" + url + "\">" +caption + "</a></td>\n";
	}

}
