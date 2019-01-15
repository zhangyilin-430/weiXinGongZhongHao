package com.prj.pojo;

/**
 * @类名称: AccessToken 
 * @类描述: 凭证
 * @author 
 * @创建时间:2017年12月8日上午11:38:11
 */
public class AccessToken {

	/**
	 * 获取到的凭证
	 */
	private String access_token;

	/**
	 * 凭证有效时间
	 */
	private int expires_in;

	public String getAccess_token() {
		return access_token;
	}

	public void setAccess_token(String access_token) {
		this.access_token = access_token;
	}

	public int getExpires_in() {
		return expires_in;
	}

	public void setExpires_in(int expires_in) {
		this.expires_in = expires_in;
	}

}
