package com.TestRails.Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditTestcases {
	final WebDriver driver; 
	
	//Constructor, as every page needs a Webdriver to find elements
	public EditTestcases(WebDriver driver){
			this.driver=driver;
		}
	
	    //Locating elements
		@FindBy(how = How.XPATH,using="//*[text()='Fair Fish']") //add project name here
		@CacheLookup
		WebElement projectName;
		
		@FindBy(how = How.XPATH,using="//a[text()='Functional Test Cases']")
		@CacheLookup
		WebElement TestCaseType;
		
		@FindBy(how = How.XPATH,using=("//a[@class='toolbar-button toolbar-button-last content-header-button button-responsive button-edit button-notext'])[1]"))
		@CacheLookup
		WebElement clickonedit;
		
		@FindBy(how = How.XPATH,using="//a[@id='sidebar-suites-viewall']")
		@CacheLookup
		WebElement showmore;
		
		@FindBy(how = How.XPATH,using="//li[@id='section_id_chzn_o_1']") // add number of sub section here
		@CacheLookup
		WebElement selectPassportTemplate;
		
		@FindBy(how = How.XPATH,using="//div[@id='type_id_chzn']")
		@CacheLookup
		WebElement selectTypeDropdown;
		
		@FindBy(how = How.XPATH,using="//li[@id='type_id_chzn_o_5']") // add number of type - for ex 5 for functional here
		@CacheLookup
		WebElement selectType;
		
		@FindBy(how = How.XPATH,using="//a[normalize-space()='Add another']")
		@CacheLookup
		WebElement AddAnother;
		
		@FindBy(how = How.XPATH,using="//a[@class='addStep']")
		@CacheLookup
		WebElement as;
		
		@FindBy(how = How.XPATH,using="//button[@id='accept']")
		@CacheLookup
		WebElement addTextCaseButton;
		
		@FindBy(how = How.XPATH,using="//div[@id='custom_preconds_display']")
		@CacheLookup
		WebElement addprecondition;
		
		@FindBy(how = How.XPATH,using="//input[@id='title']")
		@CacheLookup
		WebElement savechanges;
		
		@FindBy(how = How.XPATH,using="//*[@placeholder='Step Description']")
		@CacheLookup
		WebElement addsteps1;
		
		@FindBy(how = How.XPATH,using="//div[@id='template_id_chzn']//a[@class='chzn-single']")
		@CacheLookup
		WebElement selectSectionDropdown;
		
		@FindBy(how = How.XPATH,using="//button[@id='accept']")
		@CacheLookup
		WebElement save; 
		
		@FindBy(how = How.XPATH,using="//li[@id='template_id_chzn_o_1']")
		@CacheLookup
		WebElement selectsteps;
		
	//Opening Project
	public void OpenProjectAndTestCase() throws InterruptedException
	{
		projectName.click();		
		showmore.click();
		Thread.sleep(1000);
	}
	
	//Selecting type of Testcases you want to add ---> for ex - click on Functional testcases
	public void OpenTestCase() throws InterruptedException
	{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",TestCaseType);
		TestCaseType.click();
	}		
	
	public void waitforusertochoose() throws InterruptedException
	{
	WebDriverWait wait = new WebDriverWait(driver , Duration.ofMinutes(45));
	wait.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(savechanges)).click();
	
	Thread.sleep(1000);
	selectSectionDropdown.click();
	new WebDriverWait(driver, Duration.ofSeconds(1)).until(ExpectedConditions.presenceOfElementLocated(By.id("template_id_chzn_o_1")));
	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",selectPassportTemplate);
	selectsteps.click();
	Thread.sleep(1000);
	
	
	WebDriverWait waitz = new WebDriverWait(driver , Duration.ofMinutes(45));
	waitz.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(addsteps1)).sendKeys("1.Go to my Account\n"
				+ "2.Click on Profile\n"
				+ "3.Click on Edit button\n"
				+ "4.Click on Teams from side menu\n");			
	}
	
	public void waitforusertoclick() throws InterruptedException
	{
			
		WebDriverWait wait1 = new WebDriverWait(driver , Duration.ofMinutes(45));
		wait1.pollingEvery(Duration.ofSeconds(1)).until(ExpectedConditions.elementToBeClickable(save));
		save.click();

		for(int j=0;j<=3;j++)
		{
			driver.navigate().back();
			Thread.sleep(1000);
		}
	}
}
