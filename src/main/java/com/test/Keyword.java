package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.test.exception.InvalidBrowserNameError;

public class Keyword {

	public RemoteWebDriver driver;

	public void launchBrowser(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
			System.out.println("Launching browser....");

		} else if (browserName.equalsIgnoreCase("firefox")) {

			driver = new FirefoxDriver();
			System.out.println("Launching browser....");

		} else {

			System.err.println("Invalid browser name");
			throw new InvalidBrowserNameError(browserName);
		}
	}

	public void openUrl(String url) {

		driver.get(url);
	}

	public void click(String xpath) {

		driver.findElement(By.xpath(xpath)).click();
	}

	public void enterFirstName(String xpath, String name) {

		driver.findElement(By.xpath(xpath)).sendKeys(name);
	}

	public void enterAddress(String xpath, String address) {

		driver.findElement(By.xpath(xpath)).sendKeys(address);
	}

	public void enterCityName(String xpath, String city) {

		driver.findElement(By.xpath(xpath)).sendKeys(city);
	}

	public void enterStateName(String xpath, String state) {

		driver.findElement(By.xpath(xpath)).sendKeys(state);

	}

	public void enterPinCode(String xpath, String pin) {
		driver.findElement(By.xpath(xpath)).sendKeys(pin);

	}

	public void enterPhoneNo(String xpath, String phoneno) {

		driver.findElement(By.xpath(xpath)).sendKeys(phoneno);

	}

	public void enterSsnNo(String xpath, String ssnno) {

		driver.findElement(By.xpath(xpath)).sendKeys(ssnno);

	}

	public void enterUserName(String xpath, String user) {

		driver.findElement(By.xpath(xpath)).sendKeys(user);

	}

	public void enterPassword(String xpath, String pass) {

		driver.findElement(By.xpath(xpath)).sendKeys(pass);

	}

	public void enterConfirmPass(String xpath, String pass1) {

		driver.findElement(By.xpath(xpath)).sendKeys(pass1);

	}

	public void enterRegisterButton(String xpath) {

		driver.findElement(By.xpath(xpath)).click();

	}

	public String getLastNameerrorMsg(String xpath) {

		return driver.findElement(By.xpath(xpath)).getText();

	}

	// -------------------------------------------------------------------------

	public void enterLoginUserName(String xpath, String username) {

		driver.findElement(By.xpath(xpath)).sendKeys(username);;

	}
	
	public void enterLoginPass(String xpath, String pass2){
		
		driver.findElement(By.xpath(xpath)).sendKeys(pass2);;
	
	}
	
	public void clickLoginButton(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();;

	}
	
	public String getPasswordErrorMsg(String xpath) {

		return driver.findElement(By.xpath(xpath)).getText();
	}
	public String getUsernameErrorMsg(String xpath) {

		return driver.findElement(By.xpath(xpath)).getText();
	}
	
	
}
