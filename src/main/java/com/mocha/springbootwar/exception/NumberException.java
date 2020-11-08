package com.mocha.springbootwar.exception;

public class NumberException extends RuntimeException {

    public NumberException(){
        super("数字处理错误");
    }

}
