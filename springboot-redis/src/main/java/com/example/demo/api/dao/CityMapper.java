package com.example.demo.api.dao;

import com.example.demo.api.domain.City;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CityMapper {
    int deleteByPrimaryKey(@Param("id")Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(@Param("id") Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);
}