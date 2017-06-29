package com.ssm.wechatshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 * 用于用户权限的页面跳转
 */
@Controller
@RequestMapping("/user")
public class UserPagerController {

	@RequestMapping("/index.action")
	public String userindex(){
		System.out.println("11");
		
		/*
		 * 获取微信登陆的信息
		 */
		
		return "/user/index";
	}
	
}
