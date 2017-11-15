package com.cn.wh.hwl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cn.wh.hwl.dao.UserDao;
import com.cn.wh.hwl.domain.User;
import com.cn.wh.hwl.service.UserService;

@Service
public class UserSeriveImpl implements UserService {
    
    
    @Autowired
    UserDao userDao;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserById(int id) {
        return userDao.findById(id);
    }

    @Override
    public int saveUser(User u) {
        return userDao.saveUser(u);
    }

    @Override
    public int updateUser(User u) {
        return userDao.updateUser(u);
    }

    @Override
    public int deleteUser(int id) {
        return userDao.deleteUser(id);
    }

}
