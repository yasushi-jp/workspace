package abstractfactory.listfactory;

import java.util.Iterator;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

/**
 * 具体的な部品：LinkやTrayを集めたクラス<BR>
 * <BR>
 * ConcleteProduct（具体的な製品）の役<BR>
 * ConcleteProduct役はAbstractProduct役のインターフェース（API）を実装する。
 */
public class ListTray extends Tray {


	public ListTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<li>\n");
		sb.append(caption + "\n");
		sb.append("<ul>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</ul>\n");
		sb.append("</li>\n");
		return sb.toString();

	}

}
