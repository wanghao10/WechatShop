/**
 * 
 */
package com.ssm.wechatshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
	private IndentMapper indentMapper;
	
	public Manager indentify(String phone,String password) {
		Manager manager=new Manager();
		manager.setPhone(phone);
		manager.setPassword(password);
		List<Manager> managers=managerMapper.findByType(manager);
		if(managers==null||managers.size()!=1)
			return null;
		return managers.get(0);
	}
	public int insertWare(Ware ware){
		return wareMapper.insert(ware);
	}
	public List<Ware>getWares(Manager manager,Ware ware){
		ware.setManagerid(String.valueOf(manager.getManagerId()));
		return wareMapper.findByType(ware);
	}
	public int deleteWare(Ware ware){
		return wareMapper.delete(ware);
	}
	public int deleteWares(List<Integer> waresID) {
		return wareMapper.deleteBatch(waresID);
	}
	public List<Indent> getIndents(Manager manager,Indent indent) {
		indent.setManagerPhone(manager.getPhone());
		return indentMapper.findByType(indent);
	}
}
