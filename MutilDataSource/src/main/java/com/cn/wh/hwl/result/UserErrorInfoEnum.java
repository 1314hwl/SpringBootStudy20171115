package com.cn.wh.hwl.result;

/**
 * 业务错误码 案例
 *
 * Created by bysocket on 14/03/2017.
 */
public enum UserErrorInfoEnum implements ErrorInfoInterface {
    PARAMS_NO_COMPLETE(101, "请正确填写参数", new Object()), CITY_NOT_EXIT(100, "用户不存在", new Object());

    private int code;

    private String message;

    private Object data;

    UserErrorInfoEnum(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
