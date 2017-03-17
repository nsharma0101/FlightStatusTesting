package com.delta.flightstatus.DeltaFlightStatus;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import bsh.org.objectweb.asm.Constants;

public class CreateKeyWords {

	
	WebDriver driver = null;
	ExtentTest test = null; 
	Properties prop  = null;
	
	public CreateKeyWords(ExtentTest test) throws FileNotFoundException {
		this.test = test;
		prop = new Properties();
		FileInputStream fs = new FileInputStream("C:\\temp\\DeltaFlightStatus\\src\\test\\resource\\project.properties");
		try {
			prop.load(fs);
		} catch (IOException e) {
		 
			e.printStackTrace();
		}
		
	}
	
	public  void openBrowser(String browser1) {
	
		String browser = prop.getProperty(browser1);
		
		System.out.println(browser);
	
		try {
			if (browser.equals("ie")){
				System.setProperty("webdriver.ie.driver", "C:\\Drivers\\IEDriverServer.exe" );
				driver = new InternetExplorerDriver();	
			} else if(browser.equals("cd")) {  
				System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if(browser.equals("ff")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
				driver = new FirefoxDriver();
			}
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
		} catch (Exception e) {
			test.log(LogStatus.INFO, "Browser does not opened");
			e.printStackTrace();
		} 
			
	}	
	
	/*public void goToURL(String urlkey){
		System.out.println();
		driver.get();
		
	}
		
	public void clickFunction(String locatorkey) {
		
	
		if (locatorkey.endsWith("_id")) {
		driver.findElement(By.id(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("class")) {
		driver.findElement(By.className(prop.getProperty(locatorkey))).click();
		} else if (locatorkey.endsWith("xpath")) {
		driver.findElement(By.xpath(prop.getProperty(locatorkey))).click();
		} 
		
	}
		
	public void clearFunction(String locatorkey){
		if (locatorkey.endsWith("id")) {
		driver.findElement(By.id(locatorkey)).clear();
		} else if (locatorkey.endsWith("class")){
		driver.findElement(By.className(locatorkey)).clear();
		} else if (locatorkey.endsWith("xpath")){
		driver.findElement(By.xpath(locatorkey)).clear();
		}
	
	}	
	
	
	public void sendKeysFunction(String locatorkey, String input){
		if (locatorkey.endsWith("id")) {
		driver.findElement(By.id(locatorkey)).sendKeys(input);
		} else if (locatorkey.endsWith("class")){
		driver.findElement(By.className(locatorkey)).sendKeys(input);
		} else if (locatorkey.endsWith("xpath")){
		driver.findElement(By.xpath(locatorkey)).sendKeys(input);
		}
		
	}	

*/
}



