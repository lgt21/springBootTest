package com.lgt.springboot.model;

public class UserSpendDetail extends  BaseModel {
    private Integer id;

    private Integer spendId;

    private Integer commodityId;

    private Float price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpendId() {
        return spendId;
    }

    public void setSpendId(Integer spendId) {
        this.spendId = spendId;
    }

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}