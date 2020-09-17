package com.Nestaway.page;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Nestaway.generic.BaseClass;

public class HomePage extends  BaseClass{
	@FindBy(id = "mainSearchBox")
	private WebElement MainSearchBox;
	@FindBy(xpath = "//*[text()='hsr layout']")
	private WebElement Hsr_Layout;
	@FindBy(xpath = "//*[@title='Komala Nest 301']")
	private WebElement Housepicker;
	

	public HomePage(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
	}
	
	public void ClickMainSearchBox() throws InterruptedException 
	{
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click()", MainSearchBox);
			
	}
	public void ClickHsr_Layout()
	{
		waitFor(Hsr_Layout);
	
	}
	public void ScrollBy() throws InterruptedException
	{
		waitInSeconds(10);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("scrollBy(0,700)");
	}
	
	public void Housepicker()
	{
		waitFor(Housepicker);
	}
	
	
}
