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

public class DrugComparisonReport {
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

	    @Test 
	    public void loginTest() throws InterruptedException {
	        driver.get("http://localhost:8080/CHERPSystem/login");
	        driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Dev@8080");
	        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	    	rememberme.click();
	    	driver.findElement(By.id("btn-login")).click();
	    	driver.manage().window().maximize();
	    	
	    	//Click Invoices  
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Reports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
		 	Reports.click(); 
		 	Thread.sleep(3000);
		 	WebElement Pharmacyreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Pharmacy Reports']"))); 
		 	Pharmacyreport.click();
		 	WebElement DrugComparisonReport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Drug Comparison Report']"))); 
		 	DrugComparisonReport.click();
	Thread.sleep(2000);
	

	
	driver.findElement(By.id("dateFrom")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement InvoiceFromDate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
    InvoiceFromDate.click();
    InvoiceFromDate.click();
    WebElement InvoiceFromDateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='1'][data-year='2025']")));
    InvoiceFromDateselect.click();
    Thread.sleep(2000);
    
    driver.findElement(By.id("dateTo")).click();
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement InvoiceToDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
    InvoiceToDate.click();
    WebElement InvoiceToDateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='2'][data-year='2025']")));
    InvoiceToDateselect.click();
    Thread.sleep(3000);
    
    WebElement Facility = driver.findElement(By.id("facilityID"));
	Select Facilityselect = new Select(Facility);
	Facilityselect.selectByVisibleText("All");
	
    WebElement DrugCategory = driver.findElement(By.id("category"));
	Select DrugCategoryselect = new Select(DrugCategory);
	DrugCategoryselect.selectByVisibleText("All");
	
	
	

	
	 driver.findElement(By.xpath("//button[normalize-space()='Excel Report Download']")).click();
	 Thread.sleep(1000);
	
	driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
	
	    }}