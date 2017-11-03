package com.lgt.springboot.dao;


import com.lgt.springboot.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

public interface UserDao {

    int insert(User user);

    int insertSelective(User user);

    List<User> getList(User user);
}