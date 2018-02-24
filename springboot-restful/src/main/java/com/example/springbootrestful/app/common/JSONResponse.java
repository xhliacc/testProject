package com.example.springbootrestful.app.common;

import java.io.Serializable;

public class JSONResponse implements Serializable{

    private static final long serialVersionUID = -32354487404258732L;

    private Object object;
    private String code;
    private String retMsg;

    public JSONResponse(){

    }

    public JSONResponse(Object object, String code, String retMsg) {
        this.object = object;
        this.code = code;
        this.retMsg = retMsg;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
