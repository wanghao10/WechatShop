/**
 * 
 */
package com.ssm.wechatshop.dao;

import java.util.List;

import com.ssm.wechatshop.entities.Administrator;

/**
 * @author Сΰ��
 *
 */
public interface AdministratorMapper {

//	��ȡ����
	public List<Administrator> getAdministrator(Administrator administrator);
	
//	�޸�����
	public int updateAdministrator(Administrator administrator);
}
