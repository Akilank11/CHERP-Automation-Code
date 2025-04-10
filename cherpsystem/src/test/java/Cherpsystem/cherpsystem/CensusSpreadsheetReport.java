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

public class CensusSpreadsheetReport {
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
		        driver.get("http://localhost:8090/CHERPSystem/login");
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
			 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(text(),'Invoices')])[13]")));
			 	Invoices.click(); 
			 	Thread.sleep(3000);
			 	WebElement CensusSpreadsheetReport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Census Spreadsheet Report']"))); 
			 	CensusSpreadsheetReport.click();
		Thread.sleep(2000);
		
		WebElement Facility = driver.findElement(By.id("facilityID"));
		Select Facilityselect = new Select(Facility);
		Facilityselect.selectByVisibleText("Acadia Parish Jail (182)");
		
		WebElement Year = driver.findElement(By.id("fromyear"));
		Select Yearselect = new Select(Year);
		Yearselect.selectByVisibleText("2024");
		
		driver.findElement(By.xpath("//button[normalize-space()='Excel Report Download']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
		
		
		
		    }}