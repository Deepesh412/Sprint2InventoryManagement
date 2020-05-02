package com.capgemini.inventorymanagementsystem.exceptions;

public class UnsuccessfulOrderException extends RuntimeException {
	public UnsuccessfulOrderException(String msg){
        super(msg);
    }

    public UnsuccessfulOrderException(String msg,Throwable e){
        super(msg,e);
    }

}
