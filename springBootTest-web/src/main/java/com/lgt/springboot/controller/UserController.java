package com.lgt.springboot.controller;

import com.lgt.springboot.model.User;
import com.lgt.springboot.model.response.ResponseModel;
import com.lgt.springboot.service.UserService;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * @author lgt
 * @date 2017年11月2日09:54:59
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    private static final Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public ResponseModel index() {
        return null;
    }

    @RequestMapping(value = "getUsers", method = RequestMethod.GET)
    private List<User> getUsers(@ModelAttribute("user") User user) {
        return userService.getList(user);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public ResponseModel login( String userName, String password, boolean rememberMe) {
        logger.info("==========" + userName + password + rememberMe);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(userName, password);
        token.setRememberMe(rememberMe);
        try {
            subject.login(token);
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return ResponseModel.error("您的账号或密码输入错误");
        }
        return ResponseModel.success("登陆成功");
    }


}