package com.ssm.wechatshop.dao;

import com.ssm.wechatshop.entities.Manager;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ManagerMapper {
	/**
	 * @Description:����id����
	 * @param
	 * @return
	 */
	Manager findById(Integer managerid);

	/**
	 * @Description:��������������ѯ
	 * @param
	 * @return
	 */
	List<Manager> findByType(Manager manager);

	/**
	 * @Description:�鿴ȫ��
	 * @param
	 * @return
	 */
	List<Manager> findAll();

	/**
	 * @Description:��ҳ��ѯ offset�ӵڼ�����ʼ,��ʼ(offset+1)����ѯ������limit
	 * @param
	 * @return
	 */
	List<Manager> findByPage(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * @Description:����
	 * @param
	 * @return
	 */
	int insert(Manager manager);

	/**
	 * @Description:����id�޸�
	 * @param
	 * @return
	 */
	int update(Manager manager);

	/**
	 * @Description:����idɾ��
	 * @param
	 * @return
	 */
	int delete(Integer managerid);

	/**
	 * @Description:����ɾ��
	 * @param
	 * @return
	 */
	int deleteBatch(List<Integer> list);

}