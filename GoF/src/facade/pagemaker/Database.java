package facade.pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * メールアドレスからユーザ名を取得するクラス<BR>
 * <BR>
 * システムを構成しているその他おおぜいの役<BR>
 * <PRE>
 * その他おおぜいの役は、それぞれの仕事を行うが、Facade役のことは意識しない。
 * Facade役から呼び出されて仕事を行うが、その他おおぜいの役からFacade役を呼び出すことはない。
 * </PRE>
 */
public class Database {

	private Database() {	// newでインスタンス生成させないためにprivate宣言
	}

	/**
	 * データベースからPropertiesを得る
	 * @param dbname データベース
	 * @return Properties
	 */
	public static Properties getProperties(String dbname) {

		String filename = dbname + ".txt";
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream(filename));
		} catch (IOException e) {
			System.out.println("Warning: " + filename + " is not found.");
		}
		return prop;
	}
 }
