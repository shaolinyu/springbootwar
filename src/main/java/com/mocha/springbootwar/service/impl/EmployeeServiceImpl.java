package com.mocha.springbootwar.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mocha.springbootwar.bean.Employee;
import com.mocha.springbootwar.mapper.EmployeeMapper;
import com.mocha.springbootwar.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService  {

    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> getAll() {
        return employeeMapper.getAll();
    }
}
