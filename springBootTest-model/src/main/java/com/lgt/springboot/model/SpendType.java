package com.lgt.springboot.model;

import com.lgt.springboot.model.base.BaseModel;

public class SpendType extends BaseModel {
    private Integer id;

    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc == null ? null : desc.trim();
    }
}