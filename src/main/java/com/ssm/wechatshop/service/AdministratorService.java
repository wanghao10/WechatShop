/**
 * 
 */
package com.ssm.wechatshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ssm.wechatshop.dao.AdministratorMapper;
import com.ssm.wechatshop.dao.IndentMapper;
import com.ssm.wechatshop.dao.ManagerMapper;
import com.ssm.wechatshop.dao.WareMapper;
import com.ssm.wechatshop.entities.Administrator;
import com.ssm.wechatshop.entities.Indent;
import com.ssm.wechatshop.entities.Manager;
import com.ssm.wechatshop.entities.Ware;

/**
 * @author 小伟成
 *
 */
public class AdministratorService {

	@Autowired
	private AdministratorMapper administratorMapper;
	@Autowired
	private ManagerMapper managerMapper;
	@Autowired
	private WareMapper wareMapper;
	@Autowired
	private IndentMapper indentMapper;
	
//	验证管理员登录,失败返回null;
	public Administrator identify(String administratorId,String password) {
		Administrator administrator=new Administrator();
		administrator.setAdministratorId(administratorId);
		administrator.setPassword(password);
		List<Administrator>list=administratorMapper.getAdministrator(administrator);
		if(list!=null&&!list.isEmpty())
			return administrator;
		return null;
	}
	
//	修改账号或密码
	public boolean update(Administrator administrator) {
		if(administratorMapper.updateAdministrator(administrator)==1)
			return true;
		return false;
	}
	
//	查询楼长
	public List<Manager> getManagers(Manager manager){
		return managerMapper.findByType(manager);
	}

//	查询商品
	public List<Ware> getWares(Ware ware) {
		return wareMapper.findByType(ware);
	}
//	查询订单
	public List<Indent> getIndents(Indent indent){
		return indentMapper.findByType(indent);
	}
	
}
