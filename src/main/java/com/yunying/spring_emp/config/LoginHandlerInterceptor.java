package com.yunying.spring_emp.config;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginHandlerInterceptor implements HandlerInterceptor {

    // 判断用户是否登陆过了
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        Object userSession = request.getSession().getAttribute("userSession");
//        return true;
        if (userSession == null){
            request.setAttribute("msg","请先登陆");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        } else {
            return true;
        }

    }
}
