package com.lgt.springboot.service.impl;

import com.lgt.springboot.dao.UserSpendDao;
import com.lgt.springboot.model.UserSpend;
import com.lgt.springboot.service.UserSpendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSpendServiceImpl implements UserSpendService {

    @Autowired
    private UserSpendDao userSpendDao;

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param userSpend
     * @return
     */
    @Override
    @Transactional
    public int insert(UserSpend userSpend) {
        return userSpendDao.insert(userSpend);
    }

    public int insertSelective(UserSpend userSpend) {
        return userSpendDao.insertSelective(userSpend);
    }
}