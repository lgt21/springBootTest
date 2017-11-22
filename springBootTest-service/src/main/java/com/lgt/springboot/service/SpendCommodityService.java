package com.lgt.springboot.service;


import com.lgt.springboot.model.SpendCommodity;
import org.springframework.stereotype.Service;

public interface SpendCommodityService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendCommodity
     * @return
     */
    public int insert(SpendCommodity spendCommodity);

    int insertSelective(SpendCommodity spendCommodity);
}