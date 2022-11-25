package com.myglam.testcases;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.TestRails.Pages.Login;
import com.myglam.pages.myglam;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mainclassshere {
	
	@Test
	public void AutomatingTestRails() throws InterruptedException, IOException, AWTException
	{
		
	
	WebDriver driver =  WebDriverManager.firefoxdriver().create();
		driver.get("https://www.myglamm.com/bigg-boss");
		
		myglam loginTestRails = PageFactory.initElements(driver, myglam.class); 
		
		
		
			loginTestRails.waitforusertoclick();
		
		
		
		
	}		
}
