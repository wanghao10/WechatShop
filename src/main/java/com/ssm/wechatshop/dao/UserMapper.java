package com.ssm.wechatshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.wechatshop.entities.User;

public interface UserMapper {
	/**
	 * @Description:����id����
	 * @param
	 * @return
	 */
	User findById(String openid);

	/**
	 * @Description:��������������ѯ
	 * @param
	 * @return
	 */
	List<User> findByType(User user);

	/**
	 * @Description:�鿴ȫ��
	 * @param
	 * @return
	 */
	List<User> findAll();

	/**
	 * @Description:��ҳ��ѯ offset�ӵڼ�����ʼ,��ʼ(offset+1)����ѯ������limit
	 * @param
	 * @return
	 */
	List<User> findByPage(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * @Description:����
	 * @param
	 * @return
	 */
	int insert(User user);

	/**
	 * @Description:����id�޸�
	 * @param
	 * @return
	 */
	int update(User user);

	/**
	 * @Description:����idɾ��
	 * @param
	 * @return
	 */
	int delete(String openid);

	/**
	 * @Description:����ɾ��
	 * @param
	 * @return
	 */
	int deleteBatch(List<String> list);

}