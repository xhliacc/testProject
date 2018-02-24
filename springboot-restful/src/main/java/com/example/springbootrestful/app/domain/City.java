package com.example.springbootrestful.app.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(value="city",description="对象city")
public class City implements Serializable{
    private static final long serialVersionUID = -2492950959098387425L;
    @ApiModelProperty(value = "序号",name = "id")
    private Integer id;
    @ApiModelProperty(value = "城市id",name = "provinceId")
    private Integer provinceId;
    @ApiModelProperty(value = "城市名",name = "cityName")
    private String cityName;
    @ApiModelProperty(value = "描述",name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}