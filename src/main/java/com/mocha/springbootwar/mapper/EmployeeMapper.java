package com.mocha.springbootwar.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mocha.springbootwar.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EmployeeMapper extends BaseMapper<Employee> {

    public List<Employee> getAll();

}
