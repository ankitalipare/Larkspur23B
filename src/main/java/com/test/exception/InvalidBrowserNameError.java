package com.test.exception;

public class InvalidBrowserNameError extends Error {

	String msg;
	
	//constructor
	public InvalidBrowserNameError(String browserName) {
		
		 msg = "Invalid browser name:"+ browserName;
	}
	
	
	public String toString() {
		
		return msg;
	}
}
