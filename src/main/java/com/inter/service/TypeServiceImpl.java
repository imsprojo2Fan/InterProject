package com.inter.service;

import com.inter.dao.TypeMapper;
import com.inter.model.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:36 2018/7/26
 * @Modified By:
 */
@Service
public class TypeServiceImpl implements TypeService {

	@Autowired
	private TypeMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Type record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Type record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Type selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Type record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Type record) {
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
