package com.yunying.spring_emp.controller;

import com.github.pagehelper.PageInfo;
import com.yunying.spring_emp.entity.Department;
import com.yunying.spring_emp.entity.Employee;
import com.yunying.spring_emp.service.DepartmentService;
import com.yunying.spring_emp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class EmpController {

    @Autowired
    EmployeeService employeeService;

    @Autowired
    DepartmentService departmentService;
    /**
     * 或取所有的用户
     * @param model
     * @return
     */
    @RequestMapping("/emps")
    public String getEmps(Model model){
//        List<Employee> emps = employeeService.getAllEmps();
////        emps.forEach( t -> System.out.println(t.getDepartment().getDeptName()));
//        model.addAttribute("emps",emps);
        return "redirect:/emps/page/1";
    }

    /**
     * 根据用户名查询用户
     * @param empName
     * @param model
     * @return
     */
    @RequestMapping("/emps/search")
    public String getEmpByName(@RequestParam("empName") String empName,Model model){

        PageInfo<Employee> pageInfo = employeeService.getEmpByName(empName);
        model.addAttribute("page",pageInfo);
        return "emp/list";
    }

    /**
     * 添加用户
     * @param employee
     * @param deptId
     * @return
     */
    @RequestMapping(value = "/emps/add",method = RequestMethod.POST)
    public String addEmp(Employee employee,Integer deptId){
        Department dept = departmentService.getDeptById(deptId);
        employee.setDepartment(dept);
        System.out.println(employee);
        int result = employeeService.addEmp(employee);
        return "redirect:/emps";
    }

    /**
     * 删除
     * @param empId
     * @return
     */
    @RequestMapping("/emps/delete/{id}")
    public String deleteEmp(@PathVariable("id") Integer empId){
        int result = employeeService.deleteEmp(empId);
        return "redirect:/emps";
    }

    @RequestMapping("/emps/{id}")
    public String getEmpById(@PathVariable("id") Integer empId,Model model){
        Employee employee = employeeService.getEmpById(empId);
        List<Department> allDepts = departmentService.getAllDepts();
        model.addAttribute("emp",employee);
        model.addAttribute("departments",allDepts);
//        System.out.println(employee);
        return "emp/update";
    }
    @RequestMapping("/emps/update")
    public String updateEmp(Employee employee,@RequestParam("deptId") Integer deptId){
        // 获取完整的部门
        Department dept = departmentService.getDeptById(deptId);
        employee.setDepartment(dept);
        int result = employeeService.updateEmp(employee);
        return "redirect:/emps";
    }

    /**
     * 分页获取员工
     * @param pageNum
     * @param model
     * @return
     */
    @RequestMapping("/emps/page/{pageNum}")
    public String getEmpPage(@PathVariable("pageNum") Integer pageNum,Model model){
        PageInfo<Employee> page =  employeeService.getEmpPage(pageNum);
        model.addAttribute("page",page);
        return "emp/list";
    }

}
