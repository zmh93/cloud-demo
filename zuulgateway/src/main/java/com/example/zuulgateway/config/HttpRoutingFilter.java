package com.example.zuulgateway.config;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.net.URL;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.ROUTE_TYPE;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SIMPLE_HOST_ROUTING_FILTER_ORDER;

/**
 * Title: HttpRoutingFilter
 * Description: 使用zuul实现登陆拦截
 *
 * @author zmhzhaomenghui@gmail.com
 * @createDate 2018/7/5
 */
@Component
public class HttpRoutingFilter extends ZuulFilter {
    @Value("${zuul.routes.user-module.url}")
    private String authHost;

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
        RequestContext     ctx     = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();

        /**
         * todo 如果从redis不能查到该token,则转发到登陆页面
         */
        String token = request.getParameter("token");
        if (StringUtils.isEmpty(token)) {
            try {
                System.out.println(request.getRequestURL());
                System.out.println(request.getServletPath());
                System.out.println(request.getServletPath().split("/")[2].equals("login"));
                if (!request.getServletPath().split("/")[2].equals("login")) {
                    ctx.getResponse().sendRedirect(authHost);
                } else {
                    ctx.setRouteHost(new URL(authHost));
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}