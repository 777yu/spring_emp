package com.yunying.spring_emp.service.impl;

import com.yunying.spring_emp.entity.User;
import com.yunying.spring_emp.mapper.UserMapper;
import com.yunying.spring_emp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;
    @Override
    public User getUser(String userName,String passWord) {
        return userMapper.getUser(userName,passWord);
    }
}
