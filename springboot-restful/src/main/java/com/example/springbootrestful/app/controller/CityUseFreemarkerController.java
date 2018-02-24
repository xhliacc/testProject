package com.example.springbootrestful.app.controller;

import com.example.springbootrestful.app.domain.City;
import com.example.springbootrestful.app.service.CityService;
import com.example.springbootrestful.app.util.JSONResponseUtil;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/freemarkerCity")
public class CityUseFreemarkerController {
    @Autowired
    private CityService cityService;

    @PostMapping("/insert")
    public Object insert(City city){
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

    @GetMapping("/queryAllCity")
    public String queryAllCity(Model model){
        List<City> cityList = cityService.queryAllCity();
        model.addAttribute("cityList",cityList);
        return "cityList";
    }
}
