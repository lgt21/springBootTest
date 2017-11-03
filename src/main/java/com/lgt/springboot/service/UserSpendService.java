package com.lgt.springboot.service;

import com.lgt.springboot.model.UserSpend;
import org.springframework.stereotype.Service;

public interface UserSpendService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param userSpend
     * @return
     */
    int insert(UserSpend userSpend);

    int insertSelective(UserSpend userSpend);
}