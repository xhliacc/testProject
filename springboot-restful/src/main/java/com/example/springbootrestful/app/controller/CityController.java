package com.example.springbootrestful.app.controller;

import com.example.springbootrestful.app.domain.City;
import com.example.springbootrestful.app.service.CityService;
import com.example.springbootrestful.app.util.JSONResponseUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityService cityService;

    @ApiOperation(value = "新增城市列表",notes = "")
    @PostMapping("/insert")
    public Object insert(@RequestBody @ApiParam(name = "city",value = "上班城市详细信息",required = true)City city){
        int i = cityService.insert(city);
        if(i==0){
            return JSONResponseUtil.setError("faile");
        }
        return JSONResponseUtil.setSuccess();
    }

    @GetMapping("queryCityById")
    public Object queryCityById(int id){
        City city = cityService.selectByPrimaryKey(id);
        return JSONResponseUtil.setSuccess(city);
    }

    @DeleteMapping("delCity/{id}")
    public Object delCity(@PathVariable int id){
        int i = cityService.deleteByPrimaryKey(id);
        if(i==0){
            return JSONResponseUtil.setError("faile");
        }
        return JSONResponseUtil.setSuccess();
    }

    @ApiOperation(value="获取城市列表", notes="")
    @GetMapping("/queryAllCity")
    public Object queryAllCity(){
        List<City> cityList = cityService.queryAllCity();
        return JSONResponseUtil.setSuccess(cityList);
    }
}
