package com.lgt.springboot.service;


import com.lgt.springboot.model.Permission;
import com.lgt.springboot.model.SpendType;

import java.util.List;
import java.util.Map;

public interface SpendTypeService {

    /**
     * 插入
     * @author lgt
     * @date 2017年11月2日09:22:36
     * @param spendType
     * @return
     */
    int insert(SpendType spendType);

    int insertSelective(SpendType spendType);

    interface PermissionService {

        List<Permission> getByMap(Map<String, Object> map);

        Permission getById(Integer id);

        Integer create(Permission permission);

        int update(Permission permission);

        int delete(Integer id);

        List<Permission> getList();

        List<Permission> getByUserId(Integer userId);

    }
}