package com.lgt.springboot.dao;


import com.lgt.springboot.model.UserSpendDetail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserSpendDetailDao {

    int insert(UserSpendDetail userSpendDetail);

    int insertSelective(UserSpendDetail userSpendDetail);
}