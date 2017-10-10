package com.ldcr.rwdb.controller;

import com.ldcr.rwdb.dao.UserMapper;
import com.ldcr.rwdb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: honglong.zhang
 * @Date: 2017/10/10 15:32
 */
@RestController
@RequestMapping("/api")
public class Test {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String save(String name) {
        return userMapper.insert(new User(null, name)) + " ok";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String update(int id, String name) {
        return userMapper.updateByPrimaryKey(new User(id, name)) + " ok";
    }

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String get(int id) {
        return userMapper.selectByPrimaryKey(id).toString();
    }
}
