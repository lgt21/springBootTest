package com.lgt.springboot.model;

/**
 * @author: lgt
 * @date: 2017/11/2  10:57
 */
public class BaseModel {

    private Integer pageNum;

    private Integer pageCount;

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }
}
