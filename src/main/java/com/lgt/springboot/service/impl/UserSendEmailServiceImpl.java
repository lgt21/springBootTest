package com.lgt.springboot.service.impl;


import com.lgt.springboot.dao.UserSendEmailDao;
import com.lgt.springboot.model.UserSendEmail;
import com.lgt.springboot.service.UserSendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSendEmailServiceImpl implements UserSendEmailService {

    @Autowired
    private UserSendEmailDao userSendEmailDao;


    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param userSendEmail
     * @return
     */
    @Override
    @Transactional
    public int insert(UserSendEmail userSendEmail) {
        return userSendEmailDao.insert(userSendEmail);
    }

    public int insertSelective(UserSendEmail userSendEmail) {
        return userSendEmailDao.insertSelective(userSendEmail);
    }
}