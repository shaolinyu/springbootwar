package com.mocha.springbootwar.controller;

import com.mocha.springbootwar.exception.NumberException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.server.Session;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller
@Slf4j
public class MyController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/index")
    public String index(){
        log.debug("hello max,{}", Session.SessionTrackingMode.COOKIE);
        return "index";
    }

    @ResponseBody
    @GetMapping("/hello")
    public Object hello(){
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        return maps;
    }
}
