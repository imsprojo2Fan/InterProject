package com.inter.dao;

import com.inter.model.Interactive;

import java.util.List;
import java.util.Map;

public interface InteractiveMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Interactive record);

    int insertSelective(Interactive record);

    Interactive selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Interactive record);

    int updateByPrimaryKey(Interactive record);

    int listAllCount(Map<String,Object> qMap);

    List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}