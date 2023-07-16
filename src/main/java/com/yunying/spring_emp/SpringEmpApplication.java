package com.yunying.spring_emp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
// 扫描注册mapper
@MapperScan("com.yunying.spring_emp.mapper")
public class SpringEmpApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEmpApplication.class, args);
    }

}
