/**
 * 
 */
package com.ssm.wechatshop.manager.service;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.wechatshop.dao.AddressMapper;
import com.ssm.wechatshop.dao.IndentMapper;
import com.ssm.wechatshop.dao.ManagerMapper;
import com.ssm.wechatshop.dao.WareMapper;
import com.ssm.wechatshop.entities.Indent;
import com.ssm.wechatshop.entities.Manager;
import com.ssm.wechatshop.entities.Ware;

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
	@Autowired
	private IndentMapper indentMapper;
	
	public Manager findByType(String phone,String password) {
		Manager manager=new Manager();
		manager.setPhone(phone);
		manager.setPassword(password);
		List<Manager> managers=managerMapper.findByType(manager);
		if(managers.size()!=1)
			return null;
		return managers.get(0);
	}
	public List<Ware>getAllWare(Manager manager,Ware ware){
		ware.setManagerid(String.valueOf(manager.getManagerId()));
		List<Ware> wares=wareMapper.findByType(ware);
		return wares;
	}
	public boolean deleteWares(List<Ware> wares) {
		return false;
	}
	public List<Indent> getIndents(Manager manager,Indent indent) {
		return null;
	}
}
