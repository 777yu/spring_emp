package com.yunying.spring_emp.mapper;

import com.yunying.spring_emp.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

public interface UserMapper {

    User getUser(@Param("userName") String userName, @Param("passWord") String passWord);
}
