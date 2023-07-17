package com.yunying.spring_emp.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yunying.spring_emp.entity.Employee;
import com.yunying.spring_emp.mapper.EmployeeMapper;
import com.yunying.spring_emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getAllEmps() {
        return employeeMapper.getAllEmps();
    }

    @Override
    public PageInfo<Employee> getEmpByName(String empName) {
        PageHelper.startPage(1,4);
        List<Employee> emps = employeeMapper.getEmpByName(empName);
        PageInfo<Employee> pageInfo = new PageInfo<>(emps, 5);
        return pageInfo;
    }

    @Override
    public int addEmp(Employee employee) {
        return employeeMapper.addEmp(employee);
    }

    @Override
    public int deleteEmp(Integer empId) {
        return employeeMapper.deleteEmp(empId);
    }

    @Override
    public Employee getEmpById(Integer empId) {
        return employeeMapper.getEmpById(empId);
    }

    @Override
    public int updateEmp(Employee employee) {
        return employeeMapper.updateEmp(employee);
    }

    @Override
    public PageInfo<Employee> getEmpPage(Integer pageNum) {
        PageHelper.startPage(pageNum,4);
        List<Employee> allEmps = employeeMapper.getAllEmps();
        PageInfo<Employee> pageInfo = new PageInfo<>(allEmps, 5);
        return pageInfo;
    }
}
