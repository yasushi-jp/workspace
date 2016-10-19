package test.util;

import java.io.IOException;
import java.io.InputStream;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

@ApplicationScoped
public class SqlSessionUtil {

	/** MyBatisの設定ファイル */
	private static final String DB_RESORCE = "mybatis-config.xml";

	SqlSession sqlSession = null;

	/**
	 * SqlSessionを返す
	 * @return sqlSession
	 */
	@Produces
	public SqlSession createSession() {

		if (sqlSession == null) {
			try (InputStream inputStream = Resources.getResourceAsStream(DB_RESORCE)) {

				SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
				sqlSession = sqlSessionFactory.openSession(false);

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return sqlSession;
	}

}
