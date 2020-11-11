package com.mocha.springbootwar.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mocha.springbootwar.bean.Employee;
import com.mocha.springbootwar.bean.OutauthBaseInfo;
import com.mocha.springbootwar.mapper.OutauthBaseMapper;
import com.mocha.springbootwar.service.EmployeeService;
import com.mocha.springbootwar.service.OutauthBaseService;
import com.mocha.springbootwar.util.ExcelUtils;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import cn.afterturn.easypoi.excel.entity.result.ExcelImportResult;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class DeptController {

    @Autowired
    EmployeeService employeeService;
    
    @Autowired
    OutauthBaseService outauthBaseService;
    
    @Autowired
    private OutauthBaseMapper mapper;
    
    @ResponseBody
    @GetMapping("/page/{pages}")
    public Object page(@PathVariable("pages") Long pages) {
        Page<OutauthBaseInfo> page = new Page<>(pages, 10);
        Page<OutauthBaseInfo> selectPage = mapper.selectPage(page, 
                new QueryWrapper<OutauthBaseInfo>().like("user_name", "宫"));
        return selectPage.getRecords();
    }
    
    @RequestMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) {
      List<OutauthBaseInfo> list = outauthBaseService.getAllList();
      log.debug("outauth list:{}", list);
      ExcelUtils.exportExcel(list,"easypoi导出功能", "导出sheet1", 
          OutauthBaseInfo.class, "测试user.xls", response);
    }
    
    @ResponseBody
    @RequestMapping(value = "/importExcel", method = RequestMethod.POST)
    public String importExcel(@RequestParam("file") MultipartFile file) {
      ImportParams importParams = new ImportParams();
      // 数据处理
      importParams.setHeadRows(1);  //去除表头
      importParams.setTitleRows(1); //去除标题
      // 需要验证
      importParams.setNeedVerify(false);
      try {
          ExcelImportResult<OutauthBaseInfo> resultList = ExcelImportUtil.importExcelMore(file.getInputStream(), 
                                                     OutauthBaseInfo.class, importParams);
          List<OutauthBaseInfo> list = resultList.getList();
          outauthBaseService.saveBatch(list);
          log.debug("一共导入 {} 条数据", list.size());
          return "导入成功";
      } catch (Exception e) {
          log.error("导入失败：{}", e.getMessage());
          return "导入失败";
      }
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @ResponseBody
    @GetMapping("/emp")
    public  List<Employee> getEmp(){
        List<Employee> list = employeeService.getAll();
        log.debug("list msg:{}", list);
        return list;
    }

    @ResponseBody
    @RequestMapping("/addEmp")
    public Employee addEmp(Employee employee) {
        employeeService.save(employee);
        return employee;
    }



}
