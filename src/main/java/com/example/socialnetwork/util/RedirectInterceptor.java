package com.example.socialnetwork.util;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RedirectInterceptor extends HandlerInterceptorAdapter {
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        //super.postHandle(request, response, handler, modelAndView);
        if(modelAndView != null) {
            String args = request.getQueryString() != null ? request.getQueryString() : "";
            String url;
            if (!StringUtils.isEmpty(args)) {
                url = request.getRequestURI().toString() + "?" + args;
            } else {
                url = request.getRequestURI().toString();
            }
            response.setHeader("Turbolinks-Location", url );
        }
    }
}
