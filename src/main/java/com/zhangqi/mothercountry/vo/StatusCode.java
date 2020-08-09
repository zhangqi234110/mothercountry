package com.zhangqi.mothercountry.vo;

public enum StatusCode {
    LOGIN_SUCCESS(1,"登录成功"),
    LOGIN_ERROR(2,"登录失败"),
    LOGIN_TIP(3,"您未登录，请前往登录"),
    REGISTER_SUCCESS(4,"注册成功！"),
    REGISTER_TIP(5,"未检测到帐号，请前往注册！"),
    MESSAGE_TIP(6,"短信获取成功！"),
    OPERATION_SUCCESS(7,"操作成功"),
    BY_SUCCESS(9,"购买成功");

    private int code;
    private String message;

    StatusCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
