package abstractfactory.tablefactory;

import java.util.Iterator;

import abstractfactory.factory.Item;
import abstractfactory.factory.Tray;

/**
 * 具体的な部品：TableLinkやTableTrayを集めたクラス<BR>
 * <BR>
 * ConcleteProduct（具体的な製品）の役<BR>
 * ConcleteProduct役はAbstractProduct役のインターフェース（API）を実装する。
 *
 */
public class TableTray extends Tray {


	public TableTray(String caption) {
		super(caption);
	}

	@Override
	public String makeHTML() {
		StringBuilder sb = new StringBuilder();
		sb.append("<td>");
		sb.append("<table width=\"100%\" border=\"1\"><tr>");
		sb.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan=\"" + tray.size() + "\"><b>" + caption + "</b></td>");
		sb.append("</tr>\n");
		sb.append("<tr>\n");
		Iterator<Item> it = tray.iterator();
		while (it.hasNext()) {
			Item item = it.next();
			sb.append(item.makeHTML());
		}
		sb.append("</tr></table>");
		sb.append("</td>");
		return sb.toString();
	}

}
