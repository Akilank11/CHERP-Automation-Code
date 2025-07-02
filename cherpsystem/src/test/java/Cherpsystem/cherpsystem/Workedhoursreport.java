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

public class Workedhoursreport {
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
	  public void Comparisionreport() throws InterruptedException {
	      driver.get("http://localhost:8080/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@7070");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Worked Hours Report
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Agencystaffing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Agency Staffing']")));
	 	Agencystaffing.click(); 
	 	Thread.sleep(2000);
	 	WebElement Workedhoursreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Worked Hours Report']"))); 
	 	Workedhoursreport.click();
	Thread.sleep(2000);
	
	
//Employee Worked Hours and Budgeted Hours Comparison Report

WebElement Jobfamily = driver.findElement(By.name("ultiproJobFamily"));
Select Jobfamilyselect = new Select(Jobfamily);
Jobfamilyselect.selectByVisibleText("All");

WebElement EmployementStatus = driver.findElement(By.name("employmentStatus"));
Select EmployementStatusselect = new Select(EmployementStatus);
EmployementStatusselect.selectByVisibleText("Active");

WebElement Employeename = driver.findElement(By.name("ultiproEmployeeNumber"));
Select Employeenameselect = new Select(Employeename);
Employeenameselect.selectByVisibleText("All");

driver.findElement(By.id("startDateFilter")).click();
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement fromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[17]")));
fromdate.click();
fromdate.click();
fromdate.click();
fromdate.click();
fromdate.click();
fromdate.click();
WebElement fromdateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1'][data-month='11'][data-year='2024']")));
fromdateselect.click();


driver.findElement(By.id("endDateFilter")).click();
WebElement todate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[23]")));
todate.click();
WebElement todateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='30'][data-month='4'][data-year='2025']")));
todateselect.click();



Thread.sleep(1500);
driver.findElement(By.id("newSearch")).click();
Thread.sleep(3000);
driver.findElement(By.id("clearData")).click();

	  }
	  @Test 
	  public void WorkedHoursVarianceSummaryReport() throws InterruptedException {
	      driver.get("http://localhost:8080/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@7070");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Worked Hours Report
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Agencystaffing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Agency Staffing']")));
	 	Agencystaffing.click(); 
	 	Thread.sleep(2000);
	 	WebElement Workedhoursreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Worked Hours Report']"))); 
	 	Workedhoursreport.click();
	Thread.sleep(2000);
	
	
//Worked Hours Variance Summary Report


WebElement Month = driver.findElement(By.name("fromMonth"));
Select Monthselect = new Select(Month);
Monthselect.selectByVisibleText("January");

WebElement Year = driver.findElement(By.name("fromYear"));
Select Yearselect = new Select(Year);
Yearselect.selectByVisibleText("2025");





Thread.sleep(1500);
driver.findElement(By.xpath("//button[normalize-space()='Worked Hours Variance Summary Report']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@onclick='clearWorkedHoursVarianceSummaryReportValues()']")).click();
	  
}
	  @Test 
	  public void WorkedHoursEmailStatusDetails() throws InterruptedException {
	      driver.get("http://localhost:8080/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@7070");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Worked Hours Report
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Agencystaffing = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Agency Staffing']")));
	 	Agencystaffing.click(); 
	 	Thread.sleep(2000);
	 	WebElement Workedhoursreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Worked Hours Report']"))); 
	 	Workedhoursreport.click();
	Thread.sleep(2000);
	
	
//Worked Hours Email Status Details

	WebElement Facility = driver.findElement(By.name("facilityIdFilter"));
	Select Facilityselect = new Select(Facility);
	Facilityselect.selectByVisibleText("Acadia Parish Jail");

WebElement Month = driver.findElement(By.name("startMonthFilter"));
Select Monthselect = new Select(Month);
Monthselect.selectByVisibleText("January");

WebElement Year = driver.findElement(By.name("startYearFilter"));
Select Yearselect = new Select(Year);
Yearselect.selectByVisibleText("2025");


Thread.sleep(1500);
driver.findElement(By.xpath("//button[normalize-space()='Search']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[@onclick='clearSearchValues()']")).click();	  

//Page navigation
WebElement pagenavigation = driver.findElement(By.name("facilityWorkedHoursEmailStatusTable_length"));
Select select4 = new Select(pagenavigation);
select4.selectByVisibleText("40");
Thread.sleep(3000);
WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facilityWorkedHoursEmailStatusTable_next")));
nextpage.click();
Thread.sleep(5000);
WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facilityWorkedHoursEmailStatusTable_previous")));
previous.click();
Thread.sleep(8000);

	  
	  }
}