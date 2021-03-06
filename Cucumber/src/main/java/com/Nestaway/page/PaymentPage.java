package com.Nestaway.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Nestaway.generic.BaseClass;

public class PaymentPage extends BaseClass {

	
	@FindBy(id = "cardNumber")
	private WebElement cardnumber;
	@FindBy(id = "cardExpiry")
	private WebElement cardExpiry;
	@FindBy(id = "cardCvv")
	private WebElement cardCvv;
	@FindBy(id = "cardOwnerName")
	private WebElement cardOwnerName;
	@FindBy(xpath = "//span[text()='PROCEED']")
	private WebElement proceed;
	
	public PaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void EnterCardNumber(String cardno)
	{
		cardnumber.sendKeys(cardno);
	}
	public void EnterExpiry(String exp)
	{
		cardExpiry.sendKeys(exp);
	}
	public void EnterCVV(String cvv)
	{
		cardCvv.sendKeys(cvv);
	}
	public void Entername(String name) throws InterruptedException
	{
		cardOwnerName.sendKeys(name);
		waitInSeconds(1);
	}
	public void Proceed() throws InterruptedException
	{
		proceed.click();
		waitInSeconds(2);
		driver.quit();
	}
	
}
