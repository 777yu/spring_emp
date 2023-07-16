package com.yunying.spring_emp.mapper;

import com.yunying.spring_emp.entity.Department;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DepartmentMapper {

    List<Department> getAllDepts();

    Department getDeptById(@Param("deptId") Integer deptId);
}
