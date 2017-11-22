package com.lgt.springboot.service;


import com.lgt.springboot.model.UserSpendDetail;
import org.springframework.stereotype.Service;

public interface UserSpendDetailService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param userSpendDetail
     * @return
     */
    int insert(UserSpendDetail userSpendDetail);

    int insertSelective(UserSpendDetail userSpendDetail);
}