package com.lgt.springboot.service.impl;


import com.lgt.springboot.dao.UserDao;
import com.lgt.springboot.model.User;
import com.lgt.springboot.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param user
     * @return
     */
    @Override
    @Transactional
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    @Transactional
    public int insertSelective(User user) {
        return userDao.insertSelective(user);
    }

    /**
     * 查询
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param user
     * @return
     */
    public List<User> getList(User user) {
//        PageHelper.startPage(user.getPageNum(), user.getPageCount());
        List<User> list = userDao.getList(user);
        return list;
    }
}