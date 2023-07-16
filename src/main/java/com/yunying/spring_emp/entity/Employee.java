package com.yunying.spring_emp.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
    private Integer empId;
    private String empName;
    private Integer age;
    private String gender;
    private Department department;
}
