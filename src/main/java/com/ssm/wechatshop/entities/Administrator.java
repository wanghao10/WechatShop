/**
 * 
 */
package com.ssm.wechatshop.entities;

/**
 * @author Сΰ��
 * �洢����Ա����
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
	 * @param administratorId Ҫ���õ� administratorId
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
	 * @param password Ҫ���õ� password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/* ���� Javadoc��
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Administrator [administratorId=" + administratorId + ", password=" + password + "]";
	}
	
}
