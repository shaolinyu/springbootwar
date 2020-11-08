package com.mocha.springbootwar.controller;

import com.mocha.springbootwar.exception.NumberException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandle {

//    @ResponseBody
//    @ExceptionHandler(NumberException.class)
//    public Object handleException(Exception e){
//        Map<String, String> map = new HashMap<>();
//        map.put("code","500");
//        map.put("msg","500错误");
//        return  map;
//    }


    @ExceptionHandler(NumberException.class)
    public String handleException(Exception e, HttpServletRequest request){
        //Integer statusCode = (Integer)request.getAttribute("javax.servlet.error.status_code");
        Map<String, String> map = new HashMap<>();
        request.setAttribute("javax.servlet.error.status_code",500);
        map.put("code","500");
        map.put("msg",e.getMessage());
        return  "forward:/error";
    }

}

