package com.opensource.jiangbiao.apigetway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.ZuulFilterResult;

public class AccessFilter extends ZuulFilter{


    @Override
    public boolean isFilterDisabled() {
        return super.isFilterDisabled();
    }

    @Override
    public ZuulFilterResult runFilter() {
        return super.runFilter();
    }

    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
