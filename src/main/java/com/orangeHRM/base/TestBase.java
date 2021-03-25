package com.orangeHRM.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {

	
	public static WebDriver driver;

    public static WebDriver browser() {
   	 System.setProperty("webdriver.chrome.driver", 
   			 "C:\\Users\\alami\\Desktop\\selenium\\chromedriver.exe");
        return new ChromeDriver();
    }
	
}
