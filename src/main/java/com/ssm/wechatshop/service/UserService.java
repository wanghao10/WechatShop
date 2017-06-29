package com.ssm.wechatshop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.wechatshop.dao.UserMapper;
import com.ssm.wechatshop.dao.WareMapper;
import com.ssm.wechatshop.entities.User;
import com.ssm.wechatshop.entities.Ware;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;

	@Autowired
	private WareMapper wareMapper;

	// @Autowired
	// private

	// 通过id查询用户
	public User findUserById(String id) {
		User user = new User();
		user = userMapper.findById(id);
		return user;
	}

	// 通过id查询商品
	public Ware findWareById(int id) {
		Ware ware = new Ware();
		ware = wareMapper.findById(id);

		return ware;
	}

	// 获取商品的前20条记录
	public List<Ware> getWare20() {
		List<Ware> wares = new ArrayList<>();
		// 获取总的记录条数
		int count = 0;

		wares = wareMapper.findByPage(0, 20);
		System.out.println(wares.size());
		Ware ware = wares.get(0);
		System.out.println(wares);

		return wares;

	}

	// 获取商品的前所有记录
	public List<Ware> getWareAll() {
		List<Ware> wares = new ArrayList<>();
		// 获取总的记录条数
		wares = wareMapper.findAll();
		System.out.println("商品总数  ：  " + wares.size());
		return wares;
	}

	// 获取所有零食
	public List<Ware> getWareLingshi(String lingshi) {
		List<Ware> waresLingshi = new ArrayList<>();
		// 获取总的记录条数
		waresLingshi = wareMapper.findByKind(lingshi);
		System.out.println("零食总数  ：  " + waresLingshi.size());
		return waresLingshi;
	}

	// 获取所有零食
	public List<Ware> getWareShuiguo(String shuiguo) {
		List<Ware> waresLingshi = new ArrayList<>();
		// 获取总的记录条数
		waresLingshi = wareMapper.findByKind(shuiguo);
		return waresLingshi;
	}
	
	//查询商品
	public List<Ware> searchWare(String val) {
		List<Ware> waresLingshi = new ArrayList<>();
		// 获取总的记录条数
		waresLingshi = wareMapper.findByName(val);
		return waresLingshi;
	}

}
