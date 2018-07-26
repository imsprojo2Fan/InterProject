package com.inter.service;

import com.inter.model.Type;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:35 2018/7/26
 * @Modified By:
 */
public interface TypeService {
	int deleteByPrimaryKey(Integer id);

	int insert(Type record);

	int insertSelective(Type record);

	Type selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Type record);

	int updateByPrimaryKey(Type record);

	int listAllCount(Map<String,Object> qMap);

	List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}
