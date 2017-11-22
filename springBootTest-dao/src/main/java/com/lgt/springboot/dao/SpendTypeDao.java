package com.lgt.springboot.dao;


import com.lgt.springboot.model.SpendType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface SpendTypeDao {

    int insert(SpendType spendType);

    int insertSelective(SpendType spendType);
}