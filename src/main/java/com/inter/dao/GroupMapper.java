package com.inter.dao;

import com.inter.model.Group;

import java.util.List;
import java.util.Map;

public interface GroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);

    int listAllCount(Map<String,Object> qMap);

    List<Map<String,Object>> listByPage(Map<String,Object> qMap);
}