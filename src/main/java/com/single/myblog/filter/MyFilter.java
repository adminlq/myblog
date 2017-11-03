package com.single.myblog.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {

    @Override
    public void destroy() {
        System.out.println("销毁过滤器~~");

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        httpResponse.setHeader("Access-Control-Allow-Origin", "*");
        httpResponse.setHeader("Access-Control-Allow-Methods", "POST,GET");
        httpResponse.setHeader("Access-Control-Max-Age", "3600");
        httpResponse.setHeader("Access-Control-Allow-Headers", "x-requested-with, Content-Type");
        httpResponse.setHeader("Access-Control-Allow-Credentials", "true");
        if ("POST".equals(httpRequest.getMethod()) || "GET".equals(httpRequest.getMethod())) {
            chain.doFilter(httpRequest, httpResponse);
        }

    }

    @Override
    public void init(FilterConfig arg0) throws ServletException {
        System.out.println("初始化过滤器~~");

    }

}
