package com.mocha.springbootwar.exception;

public class NumberException extends RuntimeException {

  private static final long serialVersionUID = 1L;

    public NumberException(){
        super("数字处理错误");
    }

    
}
