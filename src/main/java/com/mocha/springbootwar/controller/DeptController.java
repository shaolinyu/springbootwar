package com.mocha.springbootwar.controller;

import com.mocha.springbootwar.bean.Department;
import com.mocha.springbootwar.bean.Employee;
import com.mocha.springbootwar.mapper.DepartmentMapper;
import com.mocha.springbootwar.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeptController {

    @Autowired
    DepartmentMapper departmentMapper;


    @Autowired
    EmployeeMapper employeeMapper;

    @GetMapping("/dept/{id}")
    public Department getDepartMent(@PathVariable("id") Integer id){
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }

    @GetMapping("/dept")
    public Department addDept(Department department){
        departmentMapper.addDept(department);
        return  department;
    }

    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.getEmpById(id);
    }



}
