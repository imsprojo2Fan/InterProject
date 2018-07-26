package com.inter.service;

import com.inter.dao.InteractiveMapper;
import com.inter.model.Interactive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:44 2018/7/26
 * @Modified By:
 */
@Service
public class InteractiveServiceImpl implements InteractiveService {

	@Autowired
	private InteractiveMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Interactive record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Interactive record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Interactive selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Interactive record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Interactive record) {
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
