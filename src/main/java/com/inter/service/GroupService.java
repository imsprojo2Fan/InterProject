package com.inter.service;

import com.inter.model.Group;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:46 2018/7/26
 * @Modified By:
 */
public interface GroupService {
	int deleteByPrimaryKey(Integer id);

	int insert(Group record);

	int insertSelective(Group record);

	Group selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(Group record);

	int updateByPrimaryKey(Group record);

	int listAllCount(Map<String,Object> qMap);

	List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}
