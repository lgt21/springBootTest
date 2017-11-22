package com.lgt.springboot.service.impl;

import com.lgt.springboot.dao.UserSpendDetailDao;
import com.lgt.springboot.model.UserSpendDetail;
import com.lgt.springboot.service.UserSpendDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserSpendDetailServiceImpl implements UserSpendDetailService {

    @Autowired
    private UserSpendDetailDao userSpendDetailDao;

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param userSpendDetail
     * @return
     */
    @Override
    @Transactional
    public int insert(UserSpendDetail userSpendDetail) {
        return userSpendDetailDao.insert(userSpendDetail);
    }

    public int insertSelective(UserSpendDetail userSpendDetail) {
        return userSpendDetailDao.insertSelective(userSpendDetail);
    }
}