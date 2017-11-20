package com.cn.wh.hwl.service.impl;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import com.cn.wh.hwl.dao.UserDao;
import com.cn.wh.hwl.domain.User;
import com.cn.wh.hwl.service.UserService;

@Service
public class UserSeriveImpl implements UserService {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserSeriveImpl.class);

    @Autowired
    UserDao userDao;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public List<User> findAllUser() {
        return userDao.findAllUser();
    }

    @Override
    public User findUserById(int id) {
        // 从缓存中获取城市信息
        String key = "user_" + id;
        ValueOperations<String, User> operations = redisTemplate.opsForValue();

        // 缓存存在
        boolean hasKey = redisTemplate.hasKey(key);
        if (hasKey) {
            User user = operations.get(key);

            LOGGER.info("从缓存中获取了用户 >> " + user.toString());
            return user;
        }
        // 从 DB 中获取城市信息
        User user = userDao.findById(id);
        // 插入缓存
        operations.set(key, user, 10, TimeUnit.SECONDS);
        LOGGER.info("插入缓存 >> " + user.toString());
        return user;
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
