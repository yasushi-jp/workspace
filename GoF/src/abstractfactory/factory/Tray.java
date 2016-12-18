package abstractfactory.factory;

import java.util.ArrayList;

/**
 * 抽象的な部品；LinkやTrayを集めたクラス<BR>
 * <BR>
 * AbstractProduct（抽象的な製品）の役<BR>
 * AbstractProduct役はAbstractFactory役によって作り出される抽象的な部品や製品の
 * インターフェース（API）を定める。
 */
public abstract class Tray extends Item {

	protected ArrayList<Item> tray = new ArrayList<Item>();

	public Tray(String caption) {
		super(caption);
	}

	public void add(Item item) {
		tray.add(item);
	}
}
