package com.Nestaway.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Nestaway.generic.BaseClass;

public class LoginPage extends BaseClass{
	@FindBy(xpath = "//*[text()='Menu']")
	private WebElement Menubar;
	@FindBy(xpath = "(//div[@class='Button PrimeButton'])[1]")
	private WebElement Menu_Login;
	@FindBy(name = "username")
	private WebElement username_textBox;
	@FindBy (xpath = "(//div[@class='Button PrimeButton'])[1]") 
	private WebElement Continue_button;
	@FindBy (id = "password")
	private WebElement password_textBox;
	@FindBy (xpath = "//div[@class='Button PrimeButton'][1]")
	private WebElement Login_button;
	
	public LoginPage(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
	}
	public void ClickMenu()
	{
		WebDriverWait w=new WebDriverWait(driver, ETO);
		w.until(ExpectedConditions.visibilityOf(Menubar));
		waitFor(Menubar);
		
	}
	public void ClickMenuLogin() throws InterruptedException
	{
	
		waitFor(Menu_Login);
		
	}
	public void EnterUsername(String enterusername)
	{
		username_textBox.sendKeys(enterusername);
	}
	public void ClickContinue()
	{
		waitFor(Continue_button);
		
		
	}
	public void EnterPassword(String enterpassword)
	{
	
		password_textBox.sendKeys(enterpassword);
	}
	public void ClickLogin() throws InterruptedException
	{
		waitFor(Login_button);
	    waitInSeconds(3);
		
	}
}
