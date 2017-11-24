package com.lgt.springboot.service;

import com.lgt.springboot.model.Permission;

import java.util.List;
import java.util.Map;

public interface PermissionService {

    List<Permission> getByMap(Map<String, Object> map);

    Permission getById(Integer id);

    Integer create(Permission permission);

    int update(Permission permission);

    int delete(Integer id);

    List<Permission> getList();

    List<Permission> getByUserId(Integer userId);

}