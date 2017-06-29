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

	// ͨ��id��ѯ�û�
	public User findUserById(String id) {
		User user = new User();
		user = userMapper.findById(id);
		return user;
	}

	// ͨ��id��ѯ��Ʒ
	public Ware findWareById(int id) {
		Ware ware = new Ware();
		ware = wareMapper.findById(id);

		return ware;
	}

	// ��ȡ��Ʒ��ǰ20����¼
	public List<Ware> getWare20() {
		List<Ware> wares = new ArrayList<>();
		// ��ȡ�ܵļ�¼����
		int count = 0;

		wares = wareMapper.findByPage(0, 20);
		System.out.println(wares.size());
		Ware ware = wares.get(0);
		System.out.println(wares);

		return wares;

	}

	// ��ȡ��Ʒ��ǰ���м�¼
	public List<Ware> getWareAll() {
		List<Ware> wares = new ArrayList<>();
		// ��ȡ�ܵļ�¼����
		wares = wareMapper.findAll();
		System.out.println("��Ʒ����  ��  " + wares.size());
		return wares;
	}

	// ��ȡ������ʳ
	public List<Ware> getWareLingshi(String lingshi) {
		List<Ware> waresLingshi = new ArrayList<>();
		// ��ȡ�ܵļ�¼����
		waresLingshi = wareMapper.findByKind(lingshi);
		System.out.println("��ʳ����  ��  " + waresLingshi.size());
		return waresLingshi;
	}

	// ��ȡ������ʳ
	public List<Ware> getWareShuiguo(String shuiguo) {
		List<Ware> waresLingshi = new ArrayList<>();
		// ��ȡ�ܵļ�¼����
		waresLingshi = wareMapper.findByKind(shuiguo);
		return waresLingshi;
	}
	
	//��ѯ��Ʒ
	public List<Ware> searchWare(String val) {
		List<Ware> waresLingshi = new ArrayList<>();
		// ��ȡ�ܵļ�¼����
		waresLingshi = wareMapper.findByName(val);
		return waresLingshi;
	}

}
