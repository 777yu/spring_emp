package com.yunying.spring_emp.service.impl;

import com.yunying.spring_emp.entity.Department;
import com.yunying.spring_emp.mapper.DepartmentMapper;
import com.yunying.spring_emp.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;
    @Override
    public List<Department> getAllDepts() {
        return departmentMapper.getAllDepts();
    }

    @Override
    public Department getDeptById(Integer deptId) {
        return departmentMapper.getDeptById(deptId);
    }
}
