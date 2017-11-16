package com.cn.wh.hwl.result;

/**
 * @Description 错误码接口
 * @author Hero
 * @date 2017年11月14日 下午10:12:10
 */
public interface ErrorInfoInterface {
    int getCode();

    String getMessage();

    Object getData();
}
