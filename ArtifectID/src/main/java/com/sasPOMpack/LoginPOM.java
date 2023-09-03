package com.sasPOMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM 
{

	WebDriver driver; 
	
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement username;
	
	public void sendUsername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(xpath="//input[@id='password']")
	private WebElement password;
	
	public void sendPassword()
	{
		password.sendKeys("secret_sauce");
		
	}
	
	@FindBy(xpath="//input [@id='login-button']")
	private WebElement loginBtn;
	
	public void clickLoginBtn()
	{
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
}
