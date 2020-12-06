package com.selenium.selenium_testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SampleSelTest {
	WebDriver driver;
	
	@Test
	public void TestMethod() {
		 //Launch firefox browser 
		System.setProperty("webdriver.gecko.driver", "/Usr/local/bin/geckodriver");
		driver = new FirefoxDriver();  
	    
	    //maximize the browser
	    driver.manage().window().maximize();
	    
	    //Implicit wait, wait for at least some time (10 sec) to identify an element, //if can't find the element with in 10 
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
	 
	    //open the url or AUT 
	    driver.get("http://newtours.demoaut.com/");
	 
	    //Click on the register link: 
	    WebElement lnk_register = driver.findElement(By.linkText("REGISTER")); 
	    lnk_register.click();
	 
	    //Enter details on the provided text boxes by using sendkeys method. 
	    WebElement txtBox_firstname = driver.findElement(By.name("firstName")); 
	    txtBox_firstname.sendKeys("John"); 
	    
	    //or directly we can identify element and act on that in one line 
	    driver.findElement(By.name("lastName")).sendKeys("Clark"); 
	    driver.findElement(By.name("phone")).sendKeys("2342342341"); 
	    driver.findElement(By.name("userName")).sendKeys("himanshu3894@gmail.com"); 
	}
}
