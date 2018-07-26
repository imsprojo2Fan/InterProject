package com.inter.service;

import com.inter.dao.WXInfoMapper;
import com.inter.model.WXInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Author: imsprojo2Fan
 * @Description:
 * @Date: Created in 15:33 2018/7/26
 * @Modified By:
 */
@Service
public class WXInfoServiceImpl implements  WXInfoService {

	@Autowired
	private WXInfoMapper mapper;
	@Override
	public int deleteByPrimaryKey(Integer id) {
		return mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(WXInfo record) {
		return mapper.insert(record);
	}

	@Override
	public int insertSelective(WXInfo record) {
		return mapper.insertSelective(record);
	}

	@Override
	public WXInfo selectByPrimaryKey(Integer id) {
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(WXInfo record) {
		return mapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(WXInfo record) {
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
