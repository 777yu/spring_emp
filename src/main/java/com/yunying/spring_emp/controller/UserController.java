package com.yunying.spring_emp.controller;


import com.yunying.spring_emp.entity.User;
import com.yunying.spring_emp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {

    @Autowired
    UserService userService;
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    public String Login(@RequestParam("username") String userName, @RequestParam("password") String passWord, Model model, HttpSession session){
//        System.out.println(userName);
//        System.out.println(passWord);
        User user = userService.getUser(userName, passWord);
        System.out.printf("user", user);
        if (user != null){
            System.out.println("登陆的用户名是："+ user.getUserName());
            session.setAttribute("userSession",user.getUserName());
            // 重定向到新的后端请求
            return "redirect:/emps";
        } else {
            model.addAttribute("msg","用户名或密码错误请重新登陆！！！");
            // 返回到前端页面
            return "index";
        }
    }

}
