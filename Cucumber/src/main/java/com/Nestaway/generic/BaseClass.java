package com.Nestaway.generic;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 
 * @author Binath
 * 
 */

public class BaseClass implements IAutoconst{
	

		public static WebDriver driver;
	
		public static void setproperty() throws InterruptedException
		{
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter in which browser to open ? GC/FF");
			String browser=scn.next();
			if(browser.equalsIgnoreCase("GC"))
			{
			System.setProperty(CHROME_KEY,CHROME_VALUE);
			driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("FF"))
			{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			driver=new FirefoxDriver();	
			}
			else {
				System.out.println("Please Enter GC or FF");
				setproperty();
				
			}
			scn.close();
		}
		
		public static void OpenApp() throws InterruptedException
		{	
			driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(ETO, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get(NESTAWAY_URL);
		}
		
		public void waitInSeconds(int i) throws InterruptedException {
			Thread.sleep(i * 1000);
		}
		
		public void waitFor(WebElement element) {
			WebDriverWait wait = new WebDriverWait(driver, ETO);
			wait.until(ExpectedConditions.elementToBeClickable(element)).click();
		}
		
		/**
		 * This method is used to get the Data from Excel Sheet
		 * @param path
		 * @param sheet_name
		 * @param row
		 * @param cell
		 */
		static Workbook wk;
		static FileInputStream fis;
		public static String getXLData(String path,String Sheet_name,int row,int cell)
		{
			String data="";
			try
			{
				fis=new FileInputStream(path);
				wk=WorkbookFactory.create(fis);
				data=wk.getSheet(Sheet_name).getRow(row).getCell(cell).toString();
			}catch (Exception e) {
				e.printStackTrace();
			}
			return data;
			
		}
				
		}
				
		
	

