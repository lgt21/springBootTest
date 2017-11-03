package com.lgt.springboot.dao;


import com.lgt.springboot.model.UserSpend;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

public interface UserSpendDao {

    int insert(UserSpend userSpend);

    int insertSelective(UserSpend userSpend);
}