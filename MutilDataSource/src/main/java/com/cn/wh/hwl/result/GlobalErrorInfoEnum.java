package com.cn.wh.hwl.result;

public enum GlobalErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS(0, "success", new Object()), NOT_FOUND(102, "service not found", new Object());

    private int code;

    private String message;

    private Object data;

    GlobalErrorInfoEnum(int code, String message, Object data) {
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

    @Override
    public Object getData() {
        return data;
    }

}
