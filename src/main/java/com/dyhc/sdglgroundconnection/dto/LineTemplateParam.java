package com.dyhc.sdglgroundconnection.dto;

import com.dyhc.sdglgroundconnection.pojo.Linetemplate;

public class LineTemplateParam extends Linetemplate {
    private Integer page; // 当前页码
    private Integer limit; // 每页记录数

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
