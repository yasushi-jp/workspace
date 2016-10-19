/**
 *
 */
package test.logic;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import test.dao.mapper.TestMapper;
import test.dao.util.SqlSessionUtil;
import test.dao.vo.UserCondition;
import test.dao.vo.UserVo;

/**
 * @author yasushi
 *
 */
public class SampleMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		SqlSession sqlSession = SqlSessionUtil.createSession();

		System.out.println("********************************************************");
		TestMapper mapper = sqlSession.getMapper(TestMapper.class);
		UserCondition cond = new UserCondition();
		cond.setStrSql("AND T.USER_NAME = #{userName}");
		cond.setUserName("大塚　泰司");
		List<UserVo> userVoList = mapper.selectUserInfo(cond);

		for (UserVo userVo: userVoList) {
			System.out.println("ユーザーID: " + userVo.getUserId());
			System.out.println("ユーザー名称: " + userVo.getUserName());
			System.out.println("性別CD: " + userVo.getSexCd());
			System.out.println("性別: " + userVo.getSexName());
			System.out.println("誕生日: " + userVo.getBirthDay());
			System.out.println("最終更新タイムスタンプ: " + userVo.getLastTimestamp());
			System.out.println("********************************************************");
		}

		cond.setStrSql("AND T.SEX_CD = #{sexCd}");
		cond.setSexCd("2");
		userVoList = mapper.selectUserInfo(cond);

		for (UserVo userVo: userVoList) {
			System.out.println("ユーザーID: " + userVo.getUserId());
			System.out.println("ユーザー名称: " + userVo.getUserName());
			System.out.println("性別CD: " + userVo.getSexCd());
			System.out.println("性別: " + userVo.getSexName());
			System.out.println("誕生日: " + userVo.getBirthDay());
			System.out.println("最終更新タイムスタンプ: " + userVo.getLastTimestamp());
			System.out.println("********************************************************");
		}


		sqlSession.close();
	}
}
