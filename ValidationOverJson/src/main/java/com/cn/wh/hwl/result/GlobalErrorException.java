package com.cn.wh.hwl.result;

public class GlobalErrorException extends Exception {
    private ErrorInfoInterface errorInfo;

    public GlobalErrorException(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ErrorInfoInterface getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorInfoInterface errorInfo) {
        this.errorInfo = errorInfo;
    }
}
