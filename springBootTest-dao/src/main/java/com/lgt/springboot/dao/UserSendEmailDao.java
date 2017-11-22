package com.lgt.springboot.dao;


import com.lgt.springboot.model.UserSendEmail;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserSendEmailDao {

    int insert(UserSendEmail userSendEmail);

    int insertSelective(UserSendEmail userSendEmail);
}