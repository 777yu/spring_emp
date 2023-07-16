package com.yunying.spring_emp.service;

import com.yunying.spring_emp.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmps();

    List<Employee> getEmpByName(String empName);


    int addEmp(Employee employee);

    int deleteEmp(Integer empId);


    Employee getEmpById(Integer empId);


    int updateEmp(Employee employee);
}
