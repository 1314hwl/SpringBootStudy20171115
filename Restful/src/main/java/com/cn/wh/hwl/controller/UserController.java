package com.cn.wh.hwl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.wh.hwl.domain.User;
import com.cn.wh.hwl.service.UserService;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public User findOneUser(@PathVariable("id") int id) {
        return userService.findUserById(id);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public List<User> findAllUser() {
        return userService.findAllUser();
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public void createUser(@RequestBody User u) {
        userService.saveUser(u);
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.PUT)
    public void modifyUser(@RequestBody User u) {
        userService.updateUser(u);
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
    public void modifyUser(@PathVariable("id") int id) {
        userService.deleteUser(id);
    }
}
