package com.ssm.wechatshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * �����û�Ȩ�޵�ҳ����ת
 */
@Controller
@RequestMapping("/user")
public class UserPagerController {

	@RequestMapping("/index.action")
	public String userindex(){
		System.out.println("11");
		
		/*
		 * ��ȡ΢�ŵ�½����Ϣ
		 */
		
		return "/user/index";
	}
	
}
