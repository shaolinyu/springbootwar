package com.mocha.springbootwar.exception;

public class UnKnowException extends RuntimeException{

  private static final long serialVersionUID = 1L;

  public UnKnowException(){
    super();
  }
  
  public UnKnowException(String message) {
    super(message);
  }
  
  public UnKnowException(String message, Throwable throwable){
    super(message, throwable);
  }
  
  
}
