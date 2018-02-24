package com.example.demo.api.service;

import com.example.demo.api.domain.City;

import java.util.List;

public interface CityService {
    int deleteByPrimaryKey(Integer id);

    int insert(City record);

    int insertSelective(City record);

    City selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(City record);

    int updateByPrimaryKey(City record);

    List<City> queryCityList();
}
