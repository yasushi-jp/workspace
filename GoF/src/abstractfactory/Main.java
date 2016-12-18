/**
 *
 */
package abstractfactory;

import abstractfactory.factory.Factory;
import abstractfactory.factory.Link;
import abstractfactory.factory.Page;
import abstractfactory.factory.Tray;

/**
 * 動作テスト用のクラス<BR>
 * <BR>
 * Client（依頼者）の役<BR>
 * Client役はAbstractFactory役とAbstractProduct役のインターフェース（API）だけを使って
 * 仕事を行う役。Client役は具体的な部品や製品や工場については知らない。
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		if (args.length != 1) {
			System.out.println("Usage: java Main class.name.of.ConcreteFactory");
			System.out.println("Example 1: java Main listfactory.ListFactory");
			System.out.println("Example 2: java Main tablefactory.TableFactory");
		}

		Factory factry = Factory.getFactory(args[0]);

		Link asahi = factry.createLink("朝日新聞", "http://www.asahi.com/");
		Link yomiuri = factry.createLink("読売新聞", "http://www.yomiuri.co.jp/");

		Link us_yahoo = factry.createLink("Yahoo!", "http://www.yahoo.com/");
		Link jp_yahoo = factry.createLink("Yahoo! Japan", "http://www.yahoo.co.jp/");

		Link excite = factry.createLink("Excite", "http://www.excite.com/");
		Link google = factry.createLink("Google", "http://www.google.com/");

		Tray traynews = factry.createTray("新聞");
		traynews.add(asahi);
		traynews.add(yomiuri);

		Tray trayyahoo = factry.createTray("Yahoo!");
		trayyahoo.add(us_yahoo);
		trayyahoo.add(jp_yahoo);

		Tray traysearch = factry.createTray("サーチエンジン");
		traysearch.add(trayyahoo);
		traysearch.add(excite);
		traysearch.add(google);

		Page page = factry.createPage("LinkPage", "大塚 泰司");
		page.add(traynews);
		page.add(traysearch);
		page.output();

	}

}
