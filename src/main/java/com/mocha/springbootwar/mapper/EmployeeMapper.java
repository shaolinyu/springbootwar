package com.mocha.springbootwar.mapper;

import com.mocha.springbootwar.bean.Employee;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface EmployeeMapper {

    public int addEmployee(Employee employee);

    public Employee getEmpById(Integer id);

}
