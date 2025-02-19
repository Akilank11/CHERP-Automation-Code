package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Chathamreport {
	WebDriver driver = new ChromeDriver();
	//FirefoxOptions firefoxoptions = new FirefoxOptions();
	//ChromeOptions chromeoptions = new ChromeOptions();
	//EdgeOptions edgeoptions = new EdgeOptions();

	//@Parameters("browser")
	//@BeforeTest

	//public void initialize(String browser) 

	//{
		 //if (browser.equalsIgnoreCase("chrome")) {
	        
	          //driver = new ChromeDriver();
	      //} else if (browser.equalsIgnoreCase("firefox")) {
	          
	          //driver = new FirefoxDriver();
	      //} else if (browser.equalsIgnoreCase("edge")) {
	         
	         // driver = new EdgeDriver();
	      //}
	      //driver.manage().window().maximize();
	  //}

	  @Test (enabled=false)
	  public void loginTest() throws InterruptedException {
	      driver.get("http://localhost:8080/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Chatham Quarterly Reports

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Invoices= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
		Invoices.click(); 
	 	WebElement ChathamQuarterlyreport= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Chatham Quarterly Reports']"))); 
	 	ChathamQuarterlyreport.click();
	Thread.sleep(2000);
	
	//Search and Generate
	
	WebElement Facility = driver.findElement(By.id("facilityId"));
    Select Facilityselect = new Select(Facility);
    Facilityselect.selectByVisibleText("Chatham County Detention Center");
    
    WebElement Year = driver.findElement(By.id("year"));
    Select Yearselect = new Select(Year);
    Yearselect.selectByVisibleText("2023");
    
    WebElement Quarter = driver.findElement(By.id("quarter"));
    Select Quarterselect = new Select(Quarter);
    Quarterselect.selectByVisibleText("January to March Paydates (Q1)");
    
    driver.findElement(By.id("newSearch")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("clearButtonId")).click();
    Thread.sleep(2000);
	
    Facilityselect.selectByVisibleText("Chatham County Detention Center");
    Yearselect.selectByVisibleText("2023");
    Quarterselect.selectByVisibleText("January to March Paydates (Q1)");
    Thread.sleep(1000);
    driver.findElement(By.id("downloadCherpPayrollData1")).click();
    Thread.sleep(2500);
    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("generateQuareterlyReports1")).click();
    
	  }
	 
			  @Test 
			  public void chathamtablefuction() throws InterruptedException {
			      driver.get("http://localhost:8080/CHERPSystem/login");
			      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
			      driver.findElement(By.id("password")).sendKeys("Dev@9090");
			      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
			  	// rememberme.click();
			  	driver.findElement(By.id("btn-login")).click();
			  	driver.manage().window().maximize();
			  	
			  //Click Chatham Quarterly Reports

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement Invoices= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
				Invoices.click(); 
			 	WebElement ChathamQuarterlyreport= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Chatham Quarterly Reports']"))); 
			 	ChathamQuarterlyreport.click();
			Thread.sleep(2000);	  
			
			//Download , Delete and Page Navigation
			
			driver.findElement(By.xpath("(//img[@class='download-control1 fileDownloadBtn'])[1]")).click();
			Thread.sleep(1000);	
			
			driver.findElement(By.xpath("(//img[@class='download-control3 fileDownloadBtn'])[1]")).click();
			Thread.sleep(1000);	
			
			driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[1]")).click();
			Thread.sleep(1000);	
			driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
			Thread.sleep(500);	
			driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
			Thread.sleep(1000);	
			
			//Page Navigation
			 WebElement pagenavigation = driver.findElement(By.name("quarterlySummaryTable_length"));
			    Select select4 = new Select(pagenavigation);
			    select4.selectByVisibleText("20");
			    Thread.sleep(1000);
			    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quarterlySummaryTable_next")));
			    nextpage.click();
			    Thread.sleep(1500);
			    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("quarterlySummaryTable_next")));
			    previous.click();
			    Thread.sleep(1500);
}}