package com.cn.wh.hwl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cn.wh.hwl.domain.User;
import com.cn.wh.hwl.result.GlobalErrorException;
import com.cn.wh.hwl.result.ResultBody;
import com.cn.wh.hwl.result.UserErrorInfoEnum;
import com.cn.wh.hwl.service.UserService;

/**
 * 用户控制层
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
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

}
