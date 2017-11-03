package com.lgt.springboot.service;

import com.lgt.springboot.model.SpendStore;
import org.springframework.stereotype.Service;

public interface SpendStoreService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendStore
     * @return
     */
    int insert(SpendStore spendStore);

    int insertSelective(SpendStore spendStore);
}