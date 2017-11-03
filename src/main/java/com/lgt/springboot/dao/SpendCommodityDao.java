package com.lgt.springboot.dao;


import com.lgt.springboot.model.SpendCommodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface SpendCommodityDao {

    int insert(SpendCommodity spendCommodity);

    int insertSelective(SpendCommodity spendCommodity);
}