package com.lgt.springboot.service;


import com.lgt.springboot.model.SpendType;
import org.springframework.stereotype.Service;

public interface SpendTypeService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendType
     * @return
     */
    int insert(SpendType spendType);

    int insertSelective(SpendType spendType);
}