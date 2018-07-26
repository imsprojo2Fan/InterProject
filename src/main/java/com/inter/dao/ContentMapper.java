package com.inter.dao;

import com.inter.model.Content;

import java.util.List;
import java.util.Map;

public interface ContentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Content record);

    int insertSelective(Content record);

    Content selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Content record);

    int updateByPrimaryKey(Content record);

    int listAllCount(Map<String,Object> qMap);

    List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}