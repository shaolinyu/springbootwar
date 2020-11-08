package com.mocha.springbootwar.mapper;

import com.mocha.springbootwar.bean.Department;
import org.apache.ibatis.annotations.*;

@Mapper
public interface DepartmentMapper {

    @Select("select * from department where id=#{id}")
    Department getDeptById(Integer id );


    @Delete("delete from department where id=#{id}")
    int deleteDeptById(Integer id );

    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(department_Name) values (#{departmentName})")
    int addDept(Department department);


    @Update("update department set department_Name = #{departmentName} where id = #{id}")
    int updateDept(Department department);

}
