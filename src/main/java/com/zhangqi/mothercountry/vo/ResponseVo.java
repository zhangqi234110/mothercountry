package com.zhangqi.mothercountry.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//@JsonInclude(value = JsonInclude.Include.NON_NULL)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ResponseVo {
    private int code;
    private String messag;
    private Object data;



    /*
    *
    * 全数据返回
    * */
    public static  ResponseVo Success(int code,String message,Object data){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(code);
        responseVo.setMessag(message);
        responseVo.setData(data);
        return responseVo;
    }

    /*
    * 部分数据返回
    * */
    public static  ResponseVo Success(int code,String messag){
        ResponseVo responseVo = new ResponseVo();
        responseVo.setCode(code);
        responseVo.setMessag(messag);
        return  responseVo;

    }



    public ResponseVo() {
        this.code = code;
        this.messag = messag;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessag() {
        return messag;
    }

    public void setMessag(String messag) {
        this.messag = messag;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
