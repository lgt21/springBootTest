package com.lgt.springboot.service.impl;

import com.lgt.springboot.dao.SpendCommodityDao;
import com.lgt.springboot.model.SpendCommodity;
import com.lgt.springboot.service.SpendCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
public class SpendCommodityServiceImpl implements SpendCommodityService {

    @Resource
    private SpendCommodityDao spendCommodityDao;

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendCommodity
     * @return
     */
    @Override
    @Transactional
    public int insert(SpendCommodity spendCommodity) {
        return spendCommodityDao.insert(spendCommodity);
    }

    @Override
    @Transactional
    public int insertSelective(SpendCommodity spendCommodity) {
        return spendCommodityDao.insertSelective(spendCommodity);
    }
}