package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver Logindriver;
	public LoginPage(WebDriver driver) {
		this.Logindriver= driver;
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(xpath="//input[contains(@name,'txtUsername')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@id,'txtPassword')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@id,'btnLogin')]")
	WebElement loginbutton;
	

	
	public void username(String Username) {
		username.sendKeys(Username);
		
	}
	
	public void password(String Password) {
		password.sendKeys(Password);
	}
	
	
	public WebElement loginbutton() {
		return loginbutton;
		
	}
	
	
}
