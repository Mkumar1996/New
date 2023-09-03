package com.sasPOMpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePOM 
{

	WebDriver driver;
	
	@FindBy(xpath="//div[text()='Sauce Labs Backpack']")
	private WebElement bagProd;
	
	public void clickBag()
	{
		bagProd.click();
		
	}
	
	@FindBy(xpath="//button[text()='ADD TO CART']")
	private WebElement cartBtn;
	
	public void clickcart()
	{
		cartBtn.click();
		
	}
	
	
	
}
