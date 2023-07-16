package com.yunying.spring_emp.controller;


import com.yunying.spring_emp.entity.Department;
import com.yunying.spring_emp.entity.Employee;
import com.yunying.spring_emp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    /**
     * 获取所有的部门
     * @param employee
     * @param model
     * @return
     */
    @RequestMapping("/depts")
    public String getAllDepts(Employee employee, Model model){
        List<Department> departments = departmentService.getAllDepts();
        model.addAttribute("emp",employee);
        departments.forEach(System.out::println);
        model.addAttribute("departments",departments);
        return "emp/add";
    }

}
