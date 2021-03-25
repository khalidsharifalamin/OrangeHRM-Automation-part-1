package com.orangeHRM.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.orangeHRM.base.TestBase;
import com.orangeHRM.pages.CreateAssign;


public class CreateAssignTest {

	WebDriver driver;
	@Test
	public void assignRun() throws InterruptedException {
		
		driver=TestBase.browser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		CreateAssign assign = new CreateAssign(driver);
		assign.userpass("Admin", "admin123");
		assign.leavebutton().click();
		assign.assignleave().click();
		assign.datefrom().click();
		assign.datefrommonth();
		assign.datefromyear();
		assign.datefromdate().click();
		
	}
	
	
}
