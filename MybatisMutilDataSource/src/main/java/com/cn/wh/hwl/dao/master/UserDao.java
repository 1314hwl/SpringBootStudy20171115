package com.cn.wh.hwl.dao.master;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cn.wh.hwl.domain.User;

public interface UserDao {
    /**
     * 获取用户信息列表
     *
     * @return
     */
    List<User> findAllUser();

    /**
     * 根据城市 ID，获取用户信息
     *
     * @param id
     * @return
     */
    User findById(@Param("id") int id);

    int saveUser(User u);

    int updateUser(User u);

    int deleteUser(int id);
}
