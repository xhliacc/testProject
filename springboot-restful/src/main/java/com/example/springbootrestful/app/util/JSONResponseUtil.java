package com.example.springbootrestful.app.util;

import com.example.springbootrestful.app.common.JSONResponse;

public class JSONResponseUtil {
    public static JSONResponse setSuccess(String code,String msg,Object data){
        JSONResponse jsonResponse = new JSONResponse(data,code,msg);
        return jsonResponse;
    }

    public static JSONResponse setSuccess(Object data){
        JSONResponse jsonResponse = new JSONResponse();
        jsonResponse.setCode("0000");
        jsonResponse.setRetMsg("success");
        jsonResponse.setObject(data);
        return jsonResponse;
    }

    public static JSONResponse setSuccess(){
        return setSuccess("");
    }

    public static JSONResponse setError(String msg){
        JSONResponse jsonResponse = new JSONResponse();
        jsonResponse.setCode("9999");
        jsonResponse.setRetMsg(msg);
        return jsonResponse;
    }
}
