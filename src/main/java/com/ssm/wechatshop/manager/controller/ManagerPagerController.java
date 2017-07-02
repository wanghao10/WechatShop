/**
 * ����Ա������
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
 * @author Сΰ��
 *
 */
@Controller
@RequestMapping("/manager")
public class ManagerPagerController {
	
	@Autowired
	private ManagerService managerService;
	
//	����Ա��¼
//		ͨ���ֻ��ź������ѯ����Ա�˺�,��Ϊ�����˺Ŵ�����������,
	@RequestMapping("/managerLogin.action")
	public ModelAndView login(@Param("phone")String phone,@Param("password")String password){
		Manager manager;
		manager=managerService.findByType(phone, password);
		return new ModelAndView("/manager/index","manager",manager);
	}
//	��ѯ�Լ���Ʒ
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
