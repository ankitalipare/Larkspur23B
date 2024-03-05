package com.testcase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.test.Config;
import com.test.Keyword;
import com.test.Locator;

public class BankTestCase {
	
	@Test
	public void verifyLoginButtonClickable() {

		Keyword key = new Keyword();
		key.launchBrowser("chrome");
		key.openUrl(Config.APPURL);
		key.enterLoginUserName(Locator.LOGINUSERNAME,"ankita");
		key.enterLoginPass(Locator.LOGINPASSWORD, "ankita");
		key.clickLoginButton(Locator.LOGINBUTTON);
	}
	
	@Test
	public void verifyPasswordFieldRequired() {

		Keyword key = new Keyword();
		key.launchBrowser("chrome");
		key.openUrl(Config.APPURL);
		key.enterLoginUserName(Locator.LOGINUSERNAME, "ankita");
		key.clickLoginButton(Locator.LOGINBUTTON);
		String passError = key.getPasswordErrorMsg(Locator.PASSWORDERRORMSG);
		String actualPasswordMsg = "Please enter a username and password.";
		Assert.assertEquals(actualPasswordMsg, passError);
	}
	
	@Test
	public void verifyUsernameFieldRequired() {

		Keyword key = new Keyword();
		key.launchBrowser("chrome");
		key.openUrl(Config.APPURL);
		key.enterLoginPass(Locator.LOGINPASSWORD, "ankita");
		key.clickLoginButton(Locator.LOGINBUTTON);
		String userError = key.getUsernameErrorMsg(Locator.USERNAMEERRORMSG);
		String actualuserMsg = "Please enter a username and password.";
		Assert.assertEquals(actualuserMsg, userError);
		
	}

	@Test
	public void verifyLastNameFieldRequird() {

		Keyword key = new Keyword();
		key.launchBrowser("chrome");
		key.openUrl(Config.APPURL);
		key.click(Locator.REGISTERBUTTONLINK);
		key.enterFirstName(Locator.FIRSTNAME,"Ankita");
		key.enterAddress(Locator.ADDRESS, "Pimpri chinchwad");
		key.enterCityName(Locator.CITY, "Pune");
		key.enterStateName(Locator.STATE, "Maharashtra");
		key.enterPinCode(Locator.PINCODE, "411018");
		key.enterPhoneNo(Locator.PHONENO, "4789632147");
		key.enterSsnNo(Locator.SSNNO,"45786");
		key.enterUserName(Locator.USERNAME, "Ankita@12");
		key.enterPassword(Locator.PASSWORD, "Ankita@12");
		key.enterConfirmPass(Locator.CONFIRMPASS, "Ankita@12");
		key.enterRegisterButton(Locator.REGISTERBUTTON);
		String actualMsg = "Last name is required.";
		String errorMsg = key.getLastNameerrorMsg(Locator.LASTNAMEERROR);
		Assert.assertEquals(actualMsg, errorMsg);
	}
	
	
}

