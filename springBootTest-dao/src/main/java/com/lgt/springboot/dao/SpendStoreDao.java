package com.lgt.springboot.dao;

import com.lgt.springboot.model.SpendStore;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface SpendStoreDao {

    int insert(SpendStore spendStore);

    int insertSelective(SpendStore spendStore);
}