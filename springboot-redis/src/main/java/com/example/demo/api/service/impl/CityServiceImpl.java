package com.example.demo.api.service.impl;

import com.example.demo.api.dao.CityMapper;
import com.example.demo.api.domain.City;
import com.example.demo.api.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.TimeUnit;

@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityMapper cityMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(City record) {
        return 0;
    }

    @Override
    public int insertSelective(City record) {
        return 0;
    }

    @Override
    public City selectByPrimaryKey(Integer id) {
        //缓存获取
        String key = "city_"+id;
        ValueOperations<String,City> valueOperations = redisTemplate.opsForValue();
        boolean hasKey = redisTemplate.hasKey(key);
        if(hasKey){
            City city = valueOperations.get(key);
            return city;
        }
        //db获取
        City city = cityMapper.selectByPrimaryKey(id);
        //缓存起来
        valueOperations.set(key,city,10, TimeUnit.SECONDS);
        return city;

    }

    @Override
    public int updateByPrimaryKeySelective(City record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(City record) {
        return 0;
    }

    @Override
    public List<City> queryCityList() {
        return null;
    }
}
