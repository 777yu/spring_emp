package com.yunying.spring_emp.service;


import com.yunying.spring_emp.entity.Department;
import org.springframework.stereotype.Service;

import java.util.List;

public interface DepartmentService {

    List<Department> getAllDepts();

    Department getDeptById(Integer deptId);
}
