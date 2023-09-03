package com.sasTestpack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sasPOMpack.HomePOM;
import com.sasPOMpack.LoginPOM;

public class Testbase
{
	WebDriver driver;
	@BeforeMethod
	public void browserlaunch(String browsername)
	{
		 driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abc\\Downloads\\All Driver files\\chromedriver_win32");
	
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		Reporter.log("Browser Maximized");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Reporter.log("wait Applied");
		
		LoginPOM hp = new LoginPOM();
		hp.sendUsername();
		hp.sendPassword();
		hp.clickLoginBtn();
	}
	
	@AfterMethod
	
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	
}
