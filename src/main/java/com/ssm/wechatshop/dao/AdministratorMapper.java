/**
 * 
 */
package com.ssm.wechatshop.dao;

import java.util.List;

import com.ssm.wechatshop.entities.Administrator;

/**
 * @author 小伟成
 *
 */
public interface AdministratorMapper {

//	获取密码
	public List<Administrator> getAdministrator(Administrator administrator);
	
//	修改密码
	public int updateAdministrator(Administrator administrator);
}
