package com.lgt.springboot.service;


import com.lgt.springboot.model.UserSendEmail;
import org.springframework.stereotype.Service;

public interface UserSendEmailService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param userSendEmail
     * @return
     */
    int insert(UserSendEmail userSendEmail);

    int insertSelective(UserSendEmail userSendEmail);
}