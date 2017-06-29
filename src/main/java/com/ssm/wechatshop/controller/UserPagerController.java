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
 * ����
 * �����û�Ȩ�޵�ҳ����ת
 */
@Controller
@RequestMapping("/user")
public class UserPagerController {

	@Autowired
	private UserService userService;

	// �̳���ҳ
	@RequestMapping("/index.action")
	public ModelAndView userindex() {
		// ��ҳ����Ҫ��ʾ20����Ʒ��Ϣ����ȡ��½��Ϣ�������ݿ�
		System.out.println(userService.findUserById("�û�1"));
		Map<String, List<Ware>> goods = new HashMap<String, List<Ware>>();
		List<Ware> wares = userService.getWare20();
		goods.put("wares", wares);
		/*
		 * ��ȡ΢�ŵ�½����Ϣ�������ݿ�
		 */
		return new ModelAndView("/user/index", goods);
	}

	// ��Ʒ����
	@RequestMapping("/xiangxixinxi.action")
	public ModelAndView userdetail(@Param("id") int id, Map<String, Object> map) {
		/*
		 * ͨ��id��ѯ����Ʒ ����map��
		 */
		Ware ware = new Ware();
		ware = userService.findWareById(id);
		map.put("ware", ware);

		return new ModelAndView("/user/detail", map);
	}

	// �û���ҳ
	@RequestMapping("/userindex.action")
	public String bodyindex() {

		return "/user/userindex";
	}

	// ������Ʒҳ��
	@RequestMapping("/usermoregoods.action")
	public ModelAndView moregoods(@Param("leixing") String leixing, Map<String, Object> map) {
		/*
		 * ��ѯ������Ʒ������map
		 */
		List<Ware> allwares = userService.getWareAll();
		map.put("allwares", allwares);

		return new ModelAndView("/user/moregoods", map);
	}

	// ������ʳҳ��
	@RequestMapping("/userlingshi.action")
	public ModelAndView morelingshi(@Param("leixing") String leixing, Map<String, Object> map) {
		/*
		 * ��ѯ������Ʒ������map
		 */
		leixing = "��ʳ";
		
		System.out.println("��ʳ");
		
		List<Ware> allwares = userService.getWareLingshi(leixing);
		System.out.println((Ware) allwares.get(0));
		map.put("wares", allwares);

		return new ModelAndView("/user/userlingshi", map);
	}

	// ����ˮ��ҳ��
	@RequestMapping("/usershuiguo.action")
	public ModelAndView moreShuiguo(@Param("leixing") String leixing, Map<String, Object> map) {
		/*
		 * ��ѯ������Ʒ������map
		 */
		leixing = "ˮ��";
		List<Ware> allwares = userService.getWareLingshi(leixing);
		map.put("allwares", allwares);

		return new ModelAndView("/user/usershuiguo", map);
	}

	// ��Ʒ��ѯ
	@RequestMapping("/search.action")
	public ModelAndView searchware(@Param("val") String val, Map<String, Object> map) {
		List<Ware> wares = new ArrayList<Ware>();
		if(!(val == null ||"".equals(val.toString())  || val.length() == 0))
			wares = userService.searchWare(val);
		map.put("allwares", wares);
		return new ModelAndView("/user/moregoods", map);
	}

	// ���ﳵ
	@RequestMapping("/usergwc.action")
	public String usergwc() {

		return "/user/usergwc";
	}

	// ��������
	@RequestMapping("/userqita.action")
	public String userqita() {

		return "/user/userqita";
	}

	// ������ҳ
	@RequestMapping("/usermain.action")
	public String usermain() {

		return "/user/usermain";
	}

}
