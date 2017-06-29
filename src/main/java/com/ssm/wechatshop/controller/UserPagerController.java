package com.ssm.wechatshop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.jdbc.PreparedStatement;
import com.ssm.wechatshop.entities.Ware;
import com.ssm.wechatshop.service.UserService;

import sun.print.resources.serviceui;

/*
 * 王浩
 * 用于用户权限的页面跳转
 */
@Controller
@RequestMapping("/user")
public class UserPagerController {

	@Autowired
	private UserService userService;

	// 商城主页
	@RequestMapping("/index.action")
	public ModelAndView userindex() {
		// 主页面主要显示20条商品信息，获取登陆信息存入数据库
		System.out.println(userService.findUserById("用户1"));
		Map<String, List<Ware>> goods = new HashMap<String, List<Ware>>();
		List<Ware> wares = userService.getWare20();
		goods.put("wares", wares);
		/*
		 * 获取微信登陆的信息存入数据库
		 */
		return new ModelAndView("/user/index", goods);
	}

	// 商品详情
	@RequestMapping("/xiangxixinxi.action")
	public ModelAndView userdetail(@Param("id") int id, Map<String, Object> map) {
		/*
		 * 通过id查询出商品 存入map中
		 */
		Ware ware = new Ware();
		ware = userService.findWareById(id);
		map.put("ware", ware);

		return new ModelAndView("/user/detail", map);
	}

	// 用户主页
	@RequestMapping("/userindex.action")
	public String bodyindex() {

		return "/user/userindex";
	}

	// 所有商品页面
	@RequestMapping("/usermoregoods.action")
	public ModelAndView moregoods(@Param("leixing") String leixing, Map<String, Object> map) {
		/*
		 * 查询所有商品，存入map
		 */
		List<Ware> allwares = userService.getWareAll();
		map.put("allwares", allwares);

		return new ModelAndView("/user/moregoods", map);
	}

	// 所有零食页面
	@RequestMapping("/userlingshi.action")
	public ModelAndView morelingshi(@Param("leixing") String leixing, Map<String, Object> map) {
		/*
		 * 查询所有商品，存入map
		 */
		leixing = "零食";
		
		System.out.println("零食");
		
		List<Ware> allwares = userService.getWareLingshi(leixing);
		System.out.println((Ware) allwares.get(0));
		map.put("wares", allwares);

		return new ModelAndView("/user/userlingshi", map);
	}

	// 所有水果页面
	@RequestMapping("/usershuiguo.action")
	public ModelAndView moreShuiguo(@Param("leixing") String leixing, Map<String, Object> map) {
		/*
		 * 查询所有商品，存入map
		 */
		leixing = "水果";
		List<Ware> allwares = userService.getWareLingshi(leixing);
		map.put("allwares", allwares);

		return new ModelAndView("/user/usershuiguo", map);
	}

	// 商品查询
	@RequestMapping("/search.action")
	public ModelAndView searchware(@Param("val") String val, Map<String, Object> map) {
		List<Ware> wares = new ArrayList<Ware>();
		if(!(val == null ||"".equals(val.toString())  || val.length() == 0))
			wares = userService.searchWare(val);
		map.put("allwares", wares);
		return new ModelAndView("/user/moregoods", map);
	}

	// 购物车
	@RequestMapping("/usergwc.action")
	public String usergwc() {

		return "/user/usergwc";
	}

	// 所有其他
	@RequestMapping("/userqita.action")
	public String userqita() {

		return "/user/userqita";
	}

	// 个人主页
	@RequestMapping("/usermain.action")
	public String usermain() {

		return "/user/usermain";
	}

}
