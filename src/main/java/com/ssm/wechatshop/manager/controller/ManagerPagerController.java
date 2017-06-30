/**
 * ����Ա������
 */
package com.ssm.wechatshop.manager.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.wechatshop.entities.Manager;
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
	@RequestMapping("/login.action")
	public ModelAndView login(@Param("phone")String phone,@Param("password")String password){
//		ͨ���ֻ��ź������ѯ����Ա�˺�,��Ϊ�����˺Ŵ�����������,
		Manager manager;
		manager=managerService.findByType(phone, password);
		return new ModelAndView("/manager/index","manager",manager);
	}
	
}
