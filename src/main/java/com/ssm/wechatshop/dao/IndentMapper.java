package com.ssm.wechatshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssm.wechatshop.entities.Indent;

public interface IndentMapper {
	/**
	 * @Description:按照id查找
	 * @param
	 * @return
	 */
	Indent findById(Integer indentid);

	/**
	 * @Description:按照其他条件查询
	 * @param
	 * @return
	 */
	List<Indent> findByType(Indent indent);

	/**
	 * @Description:查看全部
	 * @param
	 * @return
	 */
	List<Indent> findAll();

	/**
	 * @Description:分页查询 offset从第几条开始,开始(offset+1)，查询多少条limit
	 * @param
	 * @return
	 */
	List<Indent> findByPage(@Param("offset") int offset, @Param("limit") int limit);

	/**
	 * @Description:插入
	 * @param
	 * @return
	 */
	int insert(Indent indent);

	/**
	 * @Description:按照id修改
	 * @param
	 * @return
	 */
	int update(Indent indent);

	/**
	 * @Description:按照id删除
	 * @param
	 * @return
	 */
	int delete(Integer indentId);

	/**
	 * @Description:批量删除
	 * @param
	 * @return
	 */
	int deleteBatch(List<Integer> list);
		
}