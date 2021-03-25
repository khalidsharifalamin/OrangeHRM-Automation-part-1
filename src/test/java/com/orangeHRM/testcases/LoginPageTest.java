package com.orangeHRM.testcases;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.orangeHRM.base.TestBase;
import com.orangeHRM.pages.LoginPage;


public class LoginPageTest {

	
	WebDriver driver;
	
	@Test
		public void loginRun() {
		
		driver=TestBase.browser();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().window().maximize();
		LoginPage login = new LoginPage(driver);
		login.username("Admin");
		login.password("admin123");
		login.loginbutton().click();
		
		
	}
			
}
