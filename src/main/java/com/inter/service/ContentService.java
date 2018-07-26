package com.inter.service;

import com.inter.model.Content;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:49 2018/7/26
 * @Modified By:
 */
public interface ContentService {
	int deleteByPrimaryKey(Integer id);

	int insert(Content record);

	int insertSelective(Content record);

	Content selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Content record);

	int updateByPrimaryKey(Content record);

	int listAllCount(Map<String,Object> qMap);

	List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}
