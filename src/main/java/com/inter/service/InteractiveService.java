package com.inter.service;

import com.inter.model.Interactive;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:44 2018/7/26
 * @Modified By:
 */
public interface InteractiveService {
	int deleteByPrimaryKey(Integer id);

	int insert(Interactive record);

	int insertSelective(Interactive record);

	Interactive selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Interactive record);

	int updateByPrimaryKey(Interactive record);

	int listAllCount(Map<String,Object> qMap);

	List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}
