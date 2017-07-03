/**
 * 管理员操作类
 */
package com.ssm.wechatshop.manager.controller;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.wechatshop.entities.Indent;
import com.ssm.wechatshop.entities.Manager;
import com.ssm.wechatshop.entities.Ware;
import com.ssm.wechatshop.service.ManagerService;

import sun.net.www.content.text.plain;

/**
 * @author 小伟成
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerPagerController {
	
	@Autowired
	private ManagerService managerService;
	
//	楼长登录
//	通过手机号和密码查询管理员账号,若为空则账号错误或密码错误,
	@RequestMapping("/managerLogin.action")
	public ModelAndView login(@Param("phone")String phone,@Param("password")String password){
		Manager manager;
		manager=managerService.indentify(phone, password);
		return new ModelAndView("/manager/index","manager",manager);
	}
//	查询自家商品
	@RequestMapping("/managerGetWares.action")
	public ModelAndView getWares(Manager manager,Ware ware) {
		List<Ware> wares;
		wares=managerService.getWares(manager,ware);
		return new ModelAndView("/manager/wares","wares",wares);
	}
//	添加商品
	@RequestMapping("/managerInsertWare.action")
	public ModelAndView insert(Ware ware){
		int count=managerService.insertWare(ware);
		return new ModelAndView("/manager/insert","count",count);
	}
//	删除商品
	@RequestMapping("/managerDeleteWare.action")
	public ModelAndView deleteWare(Ware ware) {
		int count=managerService.deleteWare(ware);
		return new ModelAndView("/manager/delete","count",count);
	}
//	批量删除商品
	@RequestMapping("/managerDeleteWares.action")
	public ModelAndView deleteWares(List<Integer> wares){
		int count=managerService.deleteWares(wares);
		return new ModelAndView("/manager/delete","count",count);
	}
//	获取订单
//	@RequestMapping("/managerGetIntents.action")
//	public ModelAndView getIndents(Manager manager,Indent indent){
//		indent.setManagerPhone(manager.getPhone());
//		List<Indent> indents=managerService.getIndents(manager, indent);
//		return new ModelAndView("/manager/indents","indents",indents);
//	}
//	楼长主页
	@RequestMapping("/managerIndex.action")
	public String managerIndex(){
		return "/manager/index";
	}
//	商品页面
	@RequestMapping("/managerWares.action")
	public String managerWares(){
		return "/manager/wares";
	}
//	添加商品页面
	@RequestMapping("/managerInsert.action")
	public String managerInsert(){
		return "/manager/insert";
	}
//	删除商品页面
	@RequestMapping("/managerDelete.action")
	public String managerDelete(){
		return "/manager/delete";
	}
//	订单页面
	@RequestMapping("/managerIndents.action")
	public String managerIndents(){
		return "/manager/Indents";
	}
}
