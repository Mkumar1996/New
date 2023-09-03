package com.sasTestpack;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class TC_001_VerifyLoginFunctionality extends Testbase
{


	
	@Test
	public void verifylogin()
	{
		Reporter.log("verify login");
		String expectedTitle = "Swag Labs" ;
		String actualTitle = driver.getTitle();
		
		
	Assert.assertEquals(actualTitle, expectedTitle);	
		
		
//	UtilityClass1.screenshotMethod(driver, "TC01_Homepage_pageScreenshot ");
//	log.info("screenshot taken");
	}

	
	
	
}
