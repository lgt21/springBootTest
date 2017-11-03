package com.lgt.springboot.controller;

import com.lgt.springboot.model.User;
import com.lgt.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lgt
 * @date 2017年11月2日09:54:59
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    private List<User> getUsers(@ModelAttribute("user") User user) {
        return userService.getList(user);
    }

}