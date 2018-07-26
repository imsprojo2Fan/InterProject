package com.inter.dao;

import com.inter.model.Type;

import java.util.List;
import java.util.Map;

public interface TypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Type record);

    int insertSelective(Type record);

    Type selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    int listAllCount(Map<String,Object> qMap);

    List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}