package com.yunying.spring_emp.mapper;

import com.yunying.spring_emp.entity.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmployeeMapper {


    List<Employee> getAllEmps();

    List<Employee> getEmpByName(@Param("empName") String empName);


    int addEmp(Employee employee);

    int deleteEmp(Integer empId);

    Employee getEmpById(Integer empId);

    int updateEmp(Employee employee);
}
