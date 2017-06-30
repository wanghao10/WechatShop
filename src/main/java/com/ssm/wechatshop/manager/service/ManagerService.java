/**
 * 
 */
package com.ssm.wechatshop.manager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.wechatshop.dao.AddressMapper;
import com.ssm.wechatshop.dao.ManagerMapper;
import com.ssm.wechatshop.dao.WareMapper;
import com.ssm.wechatshop.entities.Manager;

/**
 * @author Ð¡Î°³É
 *
 */
@Service
public class ManagerService {
	 
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private WareMapper wareMapper;
	@Autowired
	private AddressMapper addressMapper;
	
	public Manager findByType(String phone,String password) {
		Manager manager=new Manager();
		manager.setPhone(phone);
		manager.setPassword(password);
		List<Manager> managers=managerMapper.findByType(manager);
		if(managers.size()!=1)
			return null;
		return managers.get(0);
	}
}
