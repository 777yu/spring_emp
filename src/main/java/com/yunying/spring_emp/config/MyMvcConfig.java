package com.yunying.spring_emp.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

    @Bean
    public HandlerInterceptor MyHandlerInterceptor(){
        return new LoginHandlerInterceptor();
    }

//    设置解析
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }


    // 设置拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(MyHandlerInterceptor())
                .addPathPatterns("/**")  //拦截所有请求
                .excludePathPatterns("/index.html","/","/user/login","/css/**","/js/**","/img/**","/emps","/emps/page/1","/mian.html"); //放行的地址
    }
}
