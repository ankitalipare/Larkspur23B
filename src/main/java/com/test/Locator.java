package com.test;

public interface Locator {

	String REGISTERBUTTONLINK = "//a[contains(text(), 'Register')]";
	String FIRSTNAME = "//input[@id=\"customer.firstName\"]";
	String ADDRESS = "//input[@id=\"customer.address.street\"]";
	String CITY = "//input[@id=\"customer.address.city\"]";
	String STATE = "//input[@id=\"customer.address.state\"]";
	String PINCODE = "//input[@id=\"customer.address.zipCode\"]";
	String PHONENO = "//input[@id=\"customer.phoneNumber\"]";
	String SSNNO = "//input[@id=\"customer.ssn\"]";
	String USERNAME = "//input[@id=\"customer.username\"]";
	String PASSWORD = "//input[@id=\"customer.password\"]";
	String CONFIRMPASS = "//input[@id=\"repeatedPassword\"]";
	String REGISTERBUTTON = "//input[@value=\"Register\"]";
	String LASTNAMEERROR = "//span[@id=\"customer.lastName.errors\"]";
	String LOGINUSERNAME = "//input[@name=\"username\"]";
	String LOGINPASSWORD = "//input[@name=\"password\"]";
	String LOGINBUTTON = "//input[@value=\"Log In\"]";
	String PASSWORDERRORMSG = "//p[@class=\"error\"]";
	String USERNAMEERRORMSG = "//p[@class=\"error\"]";

}
