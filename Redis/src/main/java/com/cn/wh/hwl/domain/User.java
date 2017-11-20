package com.cn.wh.hwl.domain;

import java.io.Serializable;

/**
 * 实体类
 * 
 * @Description
 * @author Hero
 * @date 2017年11月13日 下午10:17:32
 */
public class User implements Serializable {
    // 这里User必须序列化implements Serializable 否则：java.lang.IllegalArgumentException:
    // DefaultSerializer requires a Serializable payload but received an object
    // of type

    private int userId;

    private String userName;

    private String userAddress;

    private int userAge;

    private String userSex;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

}
