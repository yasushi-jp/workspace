package abstractfactory.factory;

/**
 * 抽象的な工場を表すクラス（Link, Tray, Page を作る）<BR>
 * <BR>
 * AbstractFactory（抽象的な工場）の役<BR>
 * AbstractFactory役はAbstractProduct役のインスタンスを作り出すための
 * インターフェース（API）を定める。
 */
public abstract class Factory {

	public static Factory getFactory(String classname) {
		Factory factory = null;
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		return factory;
	}

	public abstract Link createLink(String caption, String url);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title, String author);

}
