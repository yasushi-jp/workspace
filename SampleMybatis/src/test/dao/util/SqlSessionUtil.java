package test.dao.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionUtil {

	/** MyBatisの設定ファイル */
	private static final String DB_RESORCE = "mybatis-config.xml";

	/**
	 * シングルトン
	 */
	private SqlSessionUtil() {
	}

	/**
	 * SqlSessionを返す
	 * @return sqlSession
	 */
	public static SqlSession createSession() {

		SqlSession sqlSession = null;

		try (InputStream inputStream = Resources.getResourceAsStream(DB_RESORCE)) {

			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			sqlSession = sqlSessionFactory.openSession(false);

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sqlSession;
	}

}
