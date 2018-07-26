package com.inter.service;

import com.inter.dao.ContentMapper;
import com.inter.model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:49 2018/7/26
 * @Modified By:
 */
@Service
public class ContentServiceImpl implements ContentService {

	@Autowired
	private ContentMapper mapper;

	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Content record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(Content record) {
		return mapper.insertSelective(record);
	}

	@Override
	public Content selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Content record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(Content record) {
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
