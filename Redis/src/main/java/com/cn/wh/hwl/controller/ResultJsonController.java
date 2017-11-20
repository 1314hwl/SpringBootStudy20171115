package com.cn.wh.hwl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.wh.hwl.domain.User;
import com.cn.wh.hwl.result.GlobalErrorException;
import com.cn.wh.hwl.result.GlobalErrorInfoEnum;
import com.cn.wh.hwl.result.ResultBody;
import com.cn.wh.hwl.result.UserErrorInfoEnum;
import com.cn.wh.hwl.service.UserService;

/**
 * 错误码案例
 *
 * Created by bysocket on 16/4/26.
 */
@RestController
public class ResultJsonController {

    /**
     * 获取城市接口
     *
     * @param cityName
     * @return
     * @throws GlobalErrorException
     */
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.GET)
    public ResultBody findOneUser(@PathVariable("id") int id) throws GlobalErrorException {
        // 入参为空
        // if (StringUtils.isEmpty(cityName)) {
        // throw new GlobalErrorException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        // }
        User u = userService.findUserById(id);
        if (null == u) {
            throw new GlobalErrorException(UserErrorInfoEnum.CITY_NOT_EXIT);
        }
        return new ResultBody(u);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public ResultBody findAllUser() throws GlobalErrorException {
        List<User> users = userService.findAllUser();
        return new ResultBody(users);
    }

    @RequestMapping(value = "/api/user", method = RequestMethod.POST)
    public ResultBody createUser(@RequestBody User u) throws GlobalErrorException {
        int ret = userService.saveUser(u);
        if (ret == 0) {
            throw new GlobalErrorException(UserErrorInfoEnum.CITY_NOT_EXIT);
        } else {
            throw new GlobalErrorException(GlobalErrorInfoEnum.SUCCESS);
        }
    }

    @RequestMapping(value = "/api/users", method = RequestMethod.PUT)
    public ResultBody modifyUser(@RequestBody User u) throws GlobalErrorException {
        int ret = userService.updateUser(u);
        if (ret == 0) {
            throw new GlobalErrorException(UserErrorInfoEnum.CITY_NOT_EXIT);
        } else {
            throw new GlobalErrorException(GlobalErrorInfoEnum.SUCCESS);
        }
    }

    @RequestMapping(value = "/api/user/{id}", method = RequestMethod.DELETE)
    public ResultBody modifyUser(@PathVariable("id") int id) throws GlobalErrorException {
        int ret = userService.deleteUser(id);
        if (ret == 0) {
            throw new GlobalErrorException(UserErrorInfoEnum.CITY_NOT_EXIT);
        } else {
            throw new GlobalErrorException(GlobalErrorInfoEnum.SUCCESS);
        }
    }
}