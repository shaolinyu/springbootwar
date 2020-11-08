package com.mocha.springbootwar.controller;

import com.mocha.springbootwar.bean.Employee;
import com.mocha.springbootwar.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class DeptController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/emp")
    public  List<Employee> getEmp(){
        List<Employee> list = employeeService.getAll();
        log.debug("list msg:{}", list);
        return list;
    }




}
