package com.ssm.wechatshop.dao;

import java.util.List;
import java.util.Map;

import com.ssm.wechatshop.entities.User;

public interface UserDao {
	
	/*
	 * 插入用户
	 */
	public int insert(Map<String, Object> map);

	/*
	 * 更新用户
	 */
	public int update(Map<String, Object> map);

	/*
	 * 更新id和姓名
	 */
	public int uparea(Map<String, Object> map);

	public int upstatus(Map<String, Object> map);

	public int upmbertime(Map<String, Object> map);

	public List<User> list(User user);

	public int count(User user);

	public List<User> listById(User user);

	public int isMember(User user);

}
