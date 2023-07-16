package com.yunying.spring_emp.service;

import com.yunying.spring_emp.entity.User;

public interface UserService {
    User getUser(String userName,String passWord);
}
