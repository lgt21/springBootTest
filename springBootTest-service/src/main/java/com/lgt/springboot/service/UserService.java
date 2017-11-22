package com.lgt.springboot.service;


import com.lgt.springboot.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param user
     * @return
     */
    int insert(User user);

    int insertSelective(User user);

    /**
     * 查询
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param user
     * @return
     */
    List<User> getList(User user);
}