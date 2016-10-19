/**
 *
 */
package test.dao.vo;

/**
 * ユーザー情報
 */
public class UserVo {

	/** ユーザーID */
	private Integer userId;

	/** ユーザー名称 */
	private String userName;

	/** 性別コード */
	private String sexCd;

	/** 性別名称 */
	private String sexName;

	/** 生年月日 */
	private String birthDay;

	/** 最終更新タイムスタンプ */
	private String lastTimestamp;

	/**
	 * @return userId
	 */
	public Integer getUserId() {
		return userId;
	}

	/**
	 * @param userId セットする userId
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	/**
	 * @return userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName セットする userName
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return sexCd
	 */
	public String getSexCd() {
		return sexCd;
	}

	/**
	 * @param sexCd セットする sexCd
	 */
	public void setSexCd(String sexCd) {
		this.sexCd = sexCd;
	}

	/**
	 * @return sexName
	 */
	public String getSexName() {
		return sexName;
	}

	/**
	 * @param sexName セットする sexName
	 */
	public void setSexName(String sexName) {
		this.sexName = sexName;
	}

	/**
	 * @return birthDay
	 */
	public String getBirthDay() {
		return birthDay;
	}

	/**
	 * @param birthDay セットする birthDay
	 */
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	/**
	 * @return lastTimestamp
	 */
	public String getLastTimestamp() {
		return lastTimestamp;
	}

	/**
	 * @param lastTimestamp セットする lastTimestamp
	 */
	public void setLastTimestamp(String lastTimestamp) {
		this.lastTimestamp = lastTimestamp;
	}


}
