package com.ssm.wechatshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.wechatshop.entities.User;
import com.ssm.wechatshop.entities.Ware;

public interface WareMapper {

	/**
	 * @Description:����id����
	 * @param
	 * @return
	 */
	Ware findById(int openid);

	/**
	 * @Description:��������������ѯ
	 * @param
	 * @return
	 */
	List<Ware> findByType(Ware ware);

	/**
	 * @Description:�鿴ȫ��
	 * @param
	 * @return
	 */
	List<Ware> findAll();

	/**
	 * @Description:��ҳ��ѯ offset�ӵڼ�����ʼ,��ʼ(offset+1)����ѯ������limit
	 * @param
	 * @return
	 */
	List<Ware> findByPage(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * @Description:������ѯ
	 * @author ����
	 * @param String kind
	 * @return List<Ware>
	 */
	List<Ware> findByKind(@Param("kind") String kind);
	
	/**
	 * @Description:������ѯ
	 * @author ����
	 * @param String kind
	 * @return List<Ware>
	 */
	List<Ware> findByName(@Param("val") String val);

}