package com.example.zuulgateway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.zuul.filters.ProxyRequestHelper;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

import java.net.MalformedURLException;
import java.net.URL;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;

@Component
public class HttpRoutingFilter extends ZuulFilter {
    @Value("${zuul.routes.web-app.url}")
    private String authHost;
    @Autowired
    private ProxyRequestHelper helper;

    @Override
    public String filterType() {
        return ROUTE_TYPE;
    }

    @Override
    public int filterOrder() {
        return SIMPLE_HOST_ROUTING_FILTER_ORDER - 1;
    }

    @Override
    public boolean shouldFilter() {
        return RequestContext.getCurrentContext().getRouteHost() != null
                && RequestContext.getCurrentContext().sendZuulResponse();
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        System.out.println(request.getRequestURL());
        /**
         * todo 此处模拟获取token后未能验证，将请求导向验证服务
         */
        try {
            ctx.setRouteHost(new URL(authHost));
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}