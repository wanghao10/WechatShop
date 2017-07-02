/**
 * 管理员操作类
 */
package com.ssm.wechatshop.manager.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.wechatshop.entities.Manager;
import com.ssm.wechatshop.entities.Ware;
import com.ssm.wechatshop.manager.service.ManagerService;

/**
 * @author 小伟成
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerPagerController {
	
	@Autowired
	private ManagerService managerService;
	
//	管理员登录
//		通过手机号和密码查询管理员账号,若为空则账号错误或密码错误,
	@RequestMapping("/managerLogin.action")
	public ModelAndView login(@Param("phone")String phone,@Param("password")String password){
		Manager manager;
		manager=managerService.findByType(phone, password);
		return new ModelAndView("/manager/index","manager",manager);
	}
//	查询自家商品
	@RequestMapping("/managerGetWares")
	public ModelAndView getWares(Manager manager,Ware ware) {
		List<Ware> wares;
		wares=managerService.getAllWare(manager,ware);
		return new ModelAndView("/manager/wares","wares",wares);
	}
//	
//	@RequestMapping("/manager")
//	public 
}
