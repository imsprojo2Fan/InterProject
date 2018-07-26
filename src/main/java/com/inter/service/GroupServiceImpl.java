package com.inter.service;

import com.inter.dao.GroupMapper;
import com.inter.model.Group;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:47 2018/7/26
 * @Modified By:
 */
@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Group record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Group record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Group selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Group record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Group record) {
		return mapper.updateByPrimaryKey(record);
	}

	@Override
	public int listAllCount(Map<String, Object> qMap) {
		return mapper.listAllCount(qMap);
	}

	@Override
	public List<Map<String, Object>> listByPage(Map<String, Object> qMap) {
		return mapper.listByPage(qMap);
	}
}
