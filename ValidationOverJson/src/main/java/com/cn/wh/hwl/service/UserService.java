package com.cn.wh.hwl.service;

import java.util.List;

import com.cn.wh.hwl.domain.User;


public interface UserService {
    /**
     * 获取用户信息列表
     *
     * @return
     */
    List<User> findAllUser();

    /**
     * 根据用户 ID,查询用户信息
     *
     * @param id
     * @return
     */
    User findUserById(int id);

    /**
     * 新增用户信息
     *
     * @param user
     * @return
     */
    int saveUser(User u);

    /**
     * 更新用户信息
     *
     * @param user
     * @return
     */
    int updateUser(User u);

    /**
     * 根据用户ID,删除用户信息
     *
     * @param id
     * @return
     */
    int deleteUser(int id);
}
