/**
 * ����Ա������
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
 * @author Сΰ��
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerPagerController {
	
	@Autowired
	private ManagerService managerService;
	
//	¥����¼
//	ͨ���ֻ��ź������ѯ����Ա�˺�,��Ϊ�����˺Ŵ�����������,
	@RequestMapping("/managerLogin.action")
	public ModelAndView login(@Param("phone")String phone,@Param("password")String password){
		Manager manager;
		manager=managerService.indentify(phone, password);
		return new ModelAndView("/manager/index","manager",manager);
	}
//	��ѯ�Լ���Ʒ
	@RequestMapping("/managerGetWares.action")
	public ModelAndView getWares(Manager manager,Ware ware) {
		List<Ware> wares;
		wares=managerService.getWares(manager,ware);
		return new ModelAndView("/manager/wares","wares",wares);
	}
//	�����Ʒ
	@RequestMapping("/managerInsertWare.action")
	public ModelAndView insert(Ware ware){
		int count=managerService.insertWare(ware);
		return new ModelAndView("/manager/insert","count",count);
	}
//	ɾ����Ʒ
	@RequestMapping("/managerDeleteWare.action")
	public ModelAndView deleteWare(Ware ware) {
		int count=managerService.deleteWare(ware);
		return new ModelAndView("/manager/delete","count",count);
	}
//	����ɾ����Ʒ
	@RequestMapping("/managerDeleteWares.action")
	public ModelAndView deleteWares(List<Integer> wares){
		int count=managerService.deleteWares(wares);
		return new ModelAndView("/manager/delete","count",count);
	}
//	��ȡ����
//	@RequestMapping("/managerGetIntents.action")
//	public ModelAndView getIndents(Manager manager,Indent indent){
//		indent.setManagerPhone(manager.getPhone());
//		List<Indent> indents=managerService.getIndents(manager, indent);
//		return new ModelAndView("/manager/indents","indents",indents);
//	}
//	¥����ҳ
	@RequestMapping("/managerIndex.action")
	public String managerIndex(){
		return "/manager/index";
	}
//	��Ʒҳ��
	@RequestMapping("/managerWares.action")
	public String managerWares(){
		return "/manager/wares";
	}
//	�����Ʒҳ��
	@RequestMapping("/managerInsert.action")
	public String managerInsert(){
		return "/manager/insert";
	}
//	ɾ����Ʒҳ��
	@RequestMapping("/managerDelete.action")
	public String managerDelete(){
		return "/manager/delete";
	}
//	����ҳ��
	@RequestMapping("/managerIndents.action")
	public String managerIndents(){
		return "/manager/Indents";
	}
}
