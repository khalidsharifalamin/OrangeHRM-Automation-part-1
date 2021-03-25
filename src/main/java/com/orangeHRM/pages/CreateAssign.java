package com.orangeHRM.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateAssign {

	WebDriver Assigndriver;
	public CreateAssign(WebDriver driver) {
		this.Assigndriver= driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[contains(@name,'txtUsername')]")
	WebElement username;
	
	@FindBy(xpath="//input[contains(@id,'txtPassword')]")
	WebElement password;
	
	@FindBy(xpath="//input[contains(@id,'btnLogin')]")
	WebElement loginbutton;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[3]/a/b")
	WebElement leavebutton;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/ul/li[3]/ul/li[7]/a")
	WebElement assignleave;
	
	@FindBy(xpath="/html/body/div[1]/div[3]/div[1]/div[2]/form/fieldset/ol/li[4]/input")
	WebElement datefrom;
	
	@FindBy(xpath="//select[contains(@class,'ui-datepicker-month')]")
	WebElement datefrommonth;
	
	@FindBy(xpath="//select[contains(@class,'ui-datepicker-year')]")
	WebElement datefromyear;
	
	@FindBy(xpath="/html/body/div[3]/table/tbody/tr[4]/td[4]")
	WebElement datefromdate;
	
	public void userpass(String Username, String Password) {
		username.sendKeys(Username);
		password.sendKeys(Password);
		loginbutton.click();
		
	}
	
    public WebElement leavebutton() {
    	return leavebutton;
    	
    }
	
    public WebElement assignleave() {
    	return assignleave;
    	
    }
	
    public WebElement datefrom() {
    	return datefrom;
    	
    }
    
    public void datefrommonth() {
    	
    	Select list = new Select(datefrommonth);
    	list.selectByValue("3");
    }
    
    public void datefromyear() {
    	
    	Select list = new Select(datefromyear);
    	list.selectByValue("2021");
    }
 
     public WebElement datefromdate() {
 	    return datefromdate;
 	
 }
    
}
