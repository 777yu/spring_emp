package com.yunying.spring_emp.service;

import com.github.pagehelper.PageInfo;
import com.yunying.spring_emp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmps();

    PageInfo<Employee> getEmpByName(String empName);


    int addEmp(Employee employee);

    int deleteEmp(Integer empId);


    Employee getEmpById(Integer empId);


    int updateEmp(Employee employee);

    PageInfo<Employee> getEmpPage(Integer pageNum);
}
