package com.lgt.springboot.service.impl;

import com.lgt.springboot.dao.SpendStoreDao;
import com.lgt.springboot.model.SpendStore;
import com.lgt.springboot.service.SpendStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SpendStoreServiceImpl implements SpendStoreService {

    @Autowired
    private SpendStoreDao spendStoreDao;

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendStore
     * @return
     */
    @Override
    @Transactional
    public int insert(SpendStore spendStore) {
        return spendStoreDao.insert(spendStore);
    }

    public int insertSelective(SpendStore spendStore) {
        return spendStoreDao.insertSelective(spendStore);
    }
}