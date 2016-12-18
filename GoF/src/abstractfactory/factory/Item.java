package abstractfactory.factory;

/**
 * Link と Tray を統一的に扱うためのクラス
 */
public abstract class Item {

	protected String caption;

	public Item(String caption) {
		this.caption = caption;
	}

	public abstract String makeHTML();

}
