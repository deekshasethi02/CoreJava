package com.yash.docapp.util;

public class NoElementFoundException extends Exception{
	public NoElementFoundException(){
		System.out.println("NoElementFoundException: No element found");
	}
	NoElementFoundException(String errmsg){
		System.out.println("NoElementFoundException: "+errmsg);
	}
}
