package com.Nestaway.page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.Nestaway.generic.BaseClass;

public class SelectedHouse extends BaseClass {
	@FindBy(xpath = "//div[@id='hdp']/div[2]/div[2]/div/div/div/div[2]/div/div[2]")
	private WebElement Book;	
	@FindBy(xpath = "//*[text()='PAY TOKEN AMOUNT']")
	private WebElement PayTokenAmount;
	@FindBy(xpath = "(//button[text()='Select this bed'])[1]")
	private WebElement SelectthisBed;
	@FindBy(xpath = "//div[@class='booking-move-in__date-box']")
	private WebElement MoveinDate;
	@FindBy(xpath = "//div[@aria-label='Thu Jul 23 2020']")
	private WebElement SelectDate;
	@FindBy(xpath = "//*[@class='checkmark'][1]")
	private WebElement CheckBox;
	@FindBy(xpath = "//div[text()='DEBIT CARD']")
	private WebElement DebitCardOption;
	@FindBy(xpath = "//*[@class='pay-payment-button']")
	private WebElement PayPaymentButton;
	
	public SelectedHouse(WebDriver driver)
	{
		 PageFactory.initElements(driver, this);
		
		}
		
		public void Book() throws InterruptedException
		{ 
			Set<String> whs = driver.getWindowHandles();
			Iterator<String> it = whs.iterator();
			String homeBrowser = it.next();
			String childbrowser = it.next();
			driver.switchTo().window(childbrowser);
			waitFor(Book);
			
		}
		public void PayTokenAmount()
		{
			waitFor(PayTokenAmount);
			
		}
		public void SelectthisBed() throws InterruptedException
		{
			waitFor(SelectthisBed);
			waitInSeconds(2);
			
		}
		public void MoveinDate()
		{
			waitFor(MoveinDate);
			
		}
		public void SelectDate()
		{
			waitFor(SelectDate);
		}
		public void CheckBox() throws InterruptedException
		{
			waitFor(CheckBox);
		    waitInSeconds(2);
			
		}
		public void DebitCardOption() throws InterruptedException
		{
			waitFor(DebitCardOption);
			waitInSeconds(2);
			
		}
		public void PayPaymentButton()
		{

			waitFor(PayPaymentButton);
			
		}
		public void ScrollBy()
		{
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("scrollBy(0,500)");
		}
		
}
