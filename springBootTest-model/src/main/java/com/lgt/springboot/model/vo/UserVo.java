package com.lgt.springboot.model.vo;

import com.lgt.springboot.model.Role;
import com.lgt.springboot.model.User;
import com.lgt.springboot.model.base.BaseModel;

import java.util.Date;
import java.util.List;

public class UserVo extends User {
    private List<Role> roles;

    public List<Role> getRoles() {
        return roles;
    }

    public void setRoles(List<Role> roles) {
        this.roles = roles;
    }
}