package com.mocha.springbootwar.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.mocha.springbootwar.bean.Employee;

import java.util.List;

public interface EmployeeService extends IService<Employee> {

    public List<Employee> getAll();

}
