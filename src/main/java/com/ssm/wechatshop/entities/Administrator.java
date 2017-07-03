/**
 * 
 */
package com.ssm.wechatshop.entities;

/**
 * @author 小伟成
 * 存储管理员口令
 */
public class Administrator {
	
	private String administratorId;
	private String password;

	/**
	 * @return administratorId
	 */
	public String getAdministratorId() {
		return administratorId;
	}

	/**
	 * @param administratorId 要设置的 administratorId
	 */
	public void setAdministratorId(String administratorId) {
		this.administratorId = administratorId;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password 要设置的 password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* （非 Javadoc）
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Administrator [administratorId=" + administratorId + ", password=" + password + "]";
	}
	
}
