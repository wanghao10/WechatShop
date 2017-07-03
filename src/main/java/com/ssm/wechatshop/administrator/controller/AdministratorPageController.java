/**
 * ��������Ա����
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
 * @author Сΰ��
 *
 */
@Controller
@RequestMapping("/admin")
public class AdministratorPageController {
	
	@Autowired
	private AdministratorService administratorService;
	
//	��������Ա��¼
	@RequestMapping("/adminLogin.action")
	public ModelAndView login(@Param("adminId")String adminId,@Param("password")String password){
		Administrator admin=administratorService.identify(adminId, password);
		return new ModelAndView("/admin/index","admin",admin);
	}
	
//	�޸��˻���������
	@RequestMapping("adminUpdate.action")
	public ModelAndView update(Administrator admin){
		if(administratorService.update(admin))
			return new ModelAndView("/admin/update","result",true);
		return new ModelAndView("/admin/update","result",false);
	}
	
//	�鿴¥��
	@RequestMapping("/adminGetManagers.action")
	public ModelAndView getManagers(Manager manager){
		List<Manager>managers;
		managers=administratorService.getManagers(manager);
		return new ModelAndView("/admin/managers", "managers", managers);
	}

//	�鿴��Ʒ
	@RequestMapping("/adminGetWares.action")
	public ModelAndView getWares(Ware ware){
		List<Ware> wares;
		wares=administratorService.getWares(ware);
		return new  ModelAndView("/admin/wares","wares",wares);
	}
	
//	�鿴����
	@RequestMapping("/adminGetIndents.action")
	public ModelAndView getIndents(Indent indent){
		List<Indent>indents;
		indents=administratorService.getIndents(indent);
		return new ModelAndView("/adin/indents","indents",indents);
	}
	
//	��������Ա��ҳ
	@RequestMapping("/adminIndex.action")
	public String adminIndex(){
		return "/admin/index";
	}
	
//	��ʾ¥��ҳ��
	@RequestMapping("/adminManagers.action")
	public String adminManagers(){
		return "/admin/managers";
	}
	
//	��ʾ��Ʒҳ��
	@RequestMapping("/adminWares.action")
	public String adminWares(){
		return "/admin/wares";
	}
	
//	��ʾ����ҳ��
	@RequestMapping("/adminIndents.action")
	public String adminIndents(){
		return "/admin/indents";
	}
}
