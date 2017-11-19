package com.cn.wh.hwl.result;

/**
 * 返回体
 * 
 * @Description
 * @author Hero
 * @date 2017年11月14日 下午10:17:06
 */
public class ResultBody {
    /**
     * 响应代码
     */
    private int code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object data;

    public ResultBody(ErrorInfoInterface errorInfo, Object data) {
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
        this.data = data;
    }

    public ResultBody(ErrorInfoInterface errorInfo) {
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
    }

    public ResultBody(Object data) {
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.message = GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.data = data;
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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
