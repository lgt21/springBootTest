package com.lgt.springboot.dao;


import com.lgt.springboot.model.SpendCommodity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SpendCommodityDao {

    int insert(SpendCommodity spendCommodity);

    int insertSelective(SpendCommodity spendCommodity);
}