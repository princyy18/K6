package com.myglam.pages;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
public class myglam {
final WebDriver driver;
	
	//Constructor, as every page needs a Webdriver to find elements
	public myglam(WebDriver driver){
			this.driver=driver;
		}
	
	
	@FindBy(how = How.XPATH,using="//button[normalize-space()='VOTE NOW']")
	@CacheLookup
	WebElement AddAnother;
	
	
	@FindBy(how = How.XPATH,using="//p[normalize-space()='Priyanka Choudhary']")
	@CacheLookup
	WebElement adc;
	
	@FindBy(how = How.XPATH,using="//p[@class='text-white text-2xl font-bold mt-2 tracking-wide']")
	@CacheLookup
	WebElement aage;

	@FindBy(how = How.XPATH,using="//button[normalize-space()='VOTE NOW']")
	@CacheLookup
	WebElement votew;

	
	public void waitforusertoclick() throws InterruptedException
	{

		driver.navigate().refresh(); 
		WebDriverWait wait = new WebDriverWait(driver , Duration.ofMinutes(60));
		wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='VOTE NOW']"))).click();
		wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='mobile']"))).sendKeys("9737279951");
		wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();
		double x=0;
		for(int i=0;i<=7777;i++)
		{
			wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='w-36 h-36 rounded-full border-3 border-white-500'])[4]"))).click();
			wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='SUBMIT']"))).click();
			x++;
			System.out.print(x);
			for(int j=0;j<2;j++)
			{
				Thread.sleep(500);
				driver.navigate().back();
				Thread.sleep(600);
			}
			driver.navigate().refresh(); 
			
			
			Thread.sleep(300);
			wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='VOTE NOW']"))).click();
			
//			boolean y = votew.isDisplayed();
//			
//			if(y==false)
//			{
//				driver.navigate().back();
//				Thread.sleep(700);
//			}
			
		}
		
	
		
	}	
}

