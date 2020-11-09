package com.mocha.springbootwar.mapper;

import java.util.List;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mocha.springbootwar.bean.Employee;

public interface EmployeeMapper extends BaseMapper<Employee> {

    public List<Employee> getAll();

}
