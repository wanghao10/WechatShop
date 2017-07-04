package com.ssm.wechatshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.wechatshop.entities.Indent;

public interface IndentMapper {
	/**
	 * @Description:����id����
	 * @param
	 * @return
	 */
	Indent findById(Integer indentid);

	/**
	 * @Description:��������������ѯ
	 * @param
	 * @return
	 */
	List<Indent> findByType(Indent indent);

	/**
	 * @Description:�鿴ȫ��
	 * @param
	 * @return
	 */
	List<Indent> findAll();

	/**
	 * @Description:��ҳ��ѯ offset�ӵڼ�����ʼ,��ʼ(offset+1)����ѯ������limit
	 * @param
	 * @return
	 */
	List<Indent> findByPage(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * @Description:����
	 * @param
	 * @return
	 */
	int insert(Indent indent);

	/**
	 * @Description:����id�޸�
	 * @param
	 * @return
	 */
	int update(Indent indent);

	/**
	 * @Description:����idɾ��
	 * @param
	 * @return
	 */
	int delete(Integer indentId);

	/**
	 * @Description:����ɾ��
	 * @param
	 * @return
	 */
	int deleteBatch(List<Integer> list);
		
}