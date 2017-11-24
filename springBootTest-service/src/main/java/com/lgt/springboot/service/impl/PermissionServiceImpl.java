package com.lgt.springboot.service.impl;


import com.lgt.springboot.dao.PermissionDao;
import com.lgt.springboot.model.Permission;
import com.lgt.springboot.service.PermissionService;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

public class PermissionServiceImpl implements PermissionService {

    @Resource
    private PermissionDao permissionDao;

    public List<Permission> getByMap(Map<String, Object> map) {
        return permissionDao.getByMap(map);
    }

    public Permission getById(Integer id) {
        return permissionDao.getById(id);
    }

    public Integer create(Permission permission) {
        return permissionDao.create(permission);
    }

    public int update(Permission permission) {
        return permissionDao.update(permission);
    }

    public int delete(Integer id) {
        return permissionDao.delete(id);
    }

    public List<Permission> getList() {
        return permissionDao.getList();
    }

    public List<Permission> getByUserId(Integer userId) {
        return permissionDao.getByUserId(userId);
    }

}