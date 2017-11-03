package com.lgt.springboot.service.impl;


import com.lgt.springboot.dao.SpendTypeDao;
import com.lgt.springboot.model.SpendType;
import com.lgt.springboot.service.SpendTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpendTypeServiceImpl implements SpendTypeService {

    @Autowired
    private SpendTypeDao spendTypeDao;

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendType
     * @return
     */
    @Override
    @Transactional
    public int insert(SpendType spendType) {
        return spendTypeDao.insert(spendType);
    }

    public int insertSelective(SpendType spendType) {
        return spendTypeDao.insertSelective(spendType);
    }
}