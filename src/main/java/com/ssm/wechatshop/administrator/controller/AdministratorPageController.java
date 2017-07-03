/**
 * 超级管理员操作
 */
package com.ssm.wechatshop.administrator.controller;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.wechatshop.entities.Administrator;
import com.ssm.wechatshop.entities.Indent;
import com.ssm.wechatshop.entities.Manager;
import com.ssm.wechatshop.entities.Ware;
import com.ssm.wechatshop.service.AdministratorService;

/**
 * @author 小伟成
 *
 */
@Controller
@RequestMapping("/admin")
public class AdministratorPageController {
	
	@Autowired
	private AdministratorService administratorService;
	
//	超级管理员登录
	@RequestMapping("/adminLogin.action")
	public ModelAndView login(@Param("adminId")String adminId,@Param("password")String password){
		Administrator admin=administratorService.identify(adminId, password);
		return new ModelAndView("/admin/index","admin",admin);
	}
	
//	修改账户名或密码
	@RequestMapping("adminUpdate.action")
	public ModelAndView update(Administrator admin){
		if(administratorService.update(admin))
			return new ModelAndView("/admin/update","result",true);
		return new ModelAndView("/admin/update","result",false);
	}
	
//	查看楼长
	@RequestMapping("/adminGetManagers.action")
	public ModelAndView getManagers(Manager manager){
		List<Manager>managers;
		managers=administratorService.getManagers(manager);
		return new ModelAndView("/admin/managers", "managers", managers);
	}

//	查看商品
	@RequestMapping("/adminGetWares.action")
	public ModelAndView getWares(Ware ware){
		List<Ware> wares;
		wares=administratorService.getWares(ware);
		return new  ModelAndView("/admin/wares","wares",wares);
	}
	
//	查看订单
	@RequestMapping("/adminGetIndents.action")
	public ModelAndView getIndents(Indent indent){
		List<Indent>indents;
		indents=administratorService.getIndents(indent);
		return new ModelAndView("/adin/indents","indents",indents);
	}
	
//	超级管理员主页
	@RequestMapping("/adminIndex.action")
	public String adminIndex(){
		return "/admin/index";
	}
	
//	显示楼长页面
	@RequestMapping("/adminManagers.action")
	public String adminManagers(){
		return "/admin/managers";
	}
	
//	显示商品页面
	@RequestMapping("/adminWares.action")
	public String adminWares(){
		return "/admin/wares";
	}
	
//	显示订单页面
	@RequestMapping("/adminIndents.action")
	public String adminIndents(){
		return "/admin/indents";
	}
}
