package com.example.demo.api.controller;

import com.example.demo.api.domain.City;
import com.example.demo.api.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @GetMapping("/queryCityById/{id}")
    public City queryCityById(@PathVariable("id") int id){
        long begin = System.currentTimeMillis();
        System.err.println("开始时间："+begin);
        City city = cityService.selectByPrimaryKey(id);
        long end = System.currentTimeMillis();
        System.err.println("结束时间："+end+",共耗时："+(end-begin)+"ms");
        return city;
    }
}
