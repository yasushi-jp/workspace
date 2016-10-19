package test.dao.mapper;

import java.util.List;

import test.dao.vo.UserCondition;
import test.dao.vo.UserVo;

/**
 * Mapperインターフェース
 */
public interface TestMapper {

	/**
	 * ユーザー情報取得
	*/
//	public UserVo selectUserInfo(@Param(value = "userId") Integer userId);

	/**
	 * ユーザー一覧取得（全件）
	*/
	public List<UserVo> selectUserListAll();

	/**
	 * ユーザー情報取得
	*/
	public List<UserVo> selectUserInfo(UserCondition cond);

	/**
	 * ユーザー一覧取得（1項目検索）
	*/
//	public List<UserVo> selectUserListSearch1(String birthDay);

	/**
	 * ユーザー一覧取得（2項目検索）
	*/
//	public List<UserVo> selectUserListSearch2(@Param(value = "birthDay") String birthDay,
//												@Param(value = "sexCd") String sexCd);

	/**
	 * ユーザ登録
	*/
//	public int insertUser(UserVo userVo);

	/**
	 * ユーザ更新
	*/
//	public int updateUser(UserVo userVo);

	/**
	 * ユーザー削除
	*/
//	public int deleteUser(String userId);

}
