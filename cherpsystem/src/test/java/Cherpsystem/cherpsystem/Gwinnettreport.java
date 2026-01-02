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

public class Gwinnettreport {
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

	// Grid 2 Testing
	  @Test (enabled = false)
	  public void loginTest() throws InterruptedException {
	      driver.get("http://localhost:8090/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9093");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Gwinnett Weekly Summary Hours Report


	  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Gwinnett = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
	 	Gwinnett.click(); 
	 	Thread.sleep(2000);
	 	WebElement Gwinnettpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Weekly Worked Hours Report']"))); 
	 	Gwinnettpage.click();
	Thread.sleep(2000);
	WebElement Reportpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Worked Hours Summary']"))); 
	Reportpage.click();
Thread.sleep(2000);

driver.findElement(By.id("startDateStr1")).click();
WebElement StartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[23]")));
StartDate.click();
StartDate.click();
WebElement StartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='23'][data-month='10'][data-year='2025']")));
StartDateselect.click();
driver.findElement(By.xpath("//button[normalize-space()='Gwinnett Weekly Summary Hours Report']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
Thread.sleep(1000);

//Download
driver.findElement(By.xpath("//tr[@id='row_126']//img[@class='download-control4 fileDownloadBtn']")).click();
Thread.sleep(1000);

//Delete
driver.findElement(By.xpath("//tr[@id='row_126']//td[contains(@class,'delete-control fileDeleteBtn2')]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();
Thread.sleep(1000);
 
//Email
driver.findElement(By.xpath("//tr[@id='row_126']//input[@id='miInvoiceCheck']")).click();
Thread.sleep(1000);
driver.findElement(By.id("SendGwinnetReportMail")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
Thread.sleep(1000);

//page navigation
WebElement pagenavigation = driver.findElement(By.name("gwinnettSummaryHoursTable_length"));
Select select1 = new Select(pagenavigation);
select1.selectByVisibleText("25");
Thread.sleep(1000);
WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gwinnettSummaryHoursTable_next")));
nextpage.click();
Thread.sleep(1000);
WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gwinnettSummaryHoursTable_previous")));
previous.click();
Thread.sleep(1000);
	  }
	  
	// Grid 3 Testing
		  @Test 
		  public void Grid3() throws InterruptedException {
		      driver.get("http://localhost:8090/CHERPSystem/login");
		      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		      driver.findElement(By.id("password")).sendKeys("Dev@9093");
		      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		  	// rememberme.click();
		  	driver.findElement(By.id("btn-login")).click();
		  	driver.manage().window().maximize();
		  	
		  //Click Gwinnett Weekly Worked Hours Report

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Gwinnett = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
		 	Gwinnett.click(); 
		 	Thread.sleep(2000);
		 	WebElement Gwinnettpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Weekly Worked Hours Report']"))); 
		 	Gwinnettpage.click();
		Thread.sleep(2000);
		WebElement Reportpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Worked Hours Summary']"))); 
		Reportpage.click();
	Thread.sleep(2000);
		
	// Date
	driver.findElement(By.id("dateCheck")).click();
	driver.findElement(By.id("startDateStr")).click();
	WebElement StartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[35]")));
	StartDate.click();
	StartDate.click();
	WebElement StartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='23'][data-month='10'][data-year='2025']")));
	StartDateselect.click();
	driver.findElement(By.id("endDateStr")).click();
	WebElement Enddate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[41]")));
	Enddate.click();
	WebElement Enddateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='23'][data-month='11'][data-year='2025']")));
	Enddateselect.click();
	driver.findElement(By.xpath("//button[@onclick='callGenerateGwinnettWeeklyWorkedHoursReport();']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Gwinnett Time Sheet and Summary of Hours by Dept R')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[normalize-space()='Gwinnett Staffing and Budget Report']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Clear'])[3]")).click();
	Thread.sleep(1000);

	// Pay Period
	driver.findElement(By.id("payPeriodCheck")).click();
	WebElement Year = driver.findElement(By.id("payPeriodYear"));
    Select YearSelect = new Select(Year);
    YearSelect.selectByVisibleText("2025");
    Thread.sleep(1000);

    WebElement Payperiod = driver.findElement(By.id("payPeriodStr"));
    Select PayperiodSelect = new Select(Payperiod);
    PayperiodSelect.selectByValue("236");
    
    driver.findElement(By.xpath("//button[@onclick='callGenerateGwinnettWeeklyWorkedHoursReport();']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(text(),'Gwinnett Time Sheet and Summary of Hours by Dept R')]")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//button[normalize-space()='Gwinnett Staffing and Budget Report']")).click();
	//Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@type='button'][normalize-space()='Clear'])[3]")).click();
	Thread.sleep(1000);
	  }
		// Grid 1 Testing
		  @Test (enabled = false)
		  public void Download() throws InterruptedException {
		      driver.get("http://localhost:8090/CHERPSystem/login");
		      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
		      driver.findElement(By.id("password")).sendKeys("Dev@9093");
		      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
		  	// rememberme.click();
		  	driver.findElement(By.id("btn-login")).click();
		  	driver.manage().window().maximize();
		  	
		  //Click Gwinnett Weekly Worked Hours Report

		  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Gwinnett = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
		 	Gwinnett.click(); 
		 	Thread.sleep(2000);
		 	WebElement Gwinnettpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Weekly Worked Hours Report']"))); 
		 	Gwinnettpage.click();
		Thread.sleep(2000);
		WebElement Reportpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Worked Hours Summary']"))); 
		Reportpage.click();
	Thread.sleep(2000);

	driver.findElement(By.id("startDate")).click();
	WebElement StartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
	StartDate.click();
	StartDate.click();
	WebElement StartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='01'][data-month='10'][data-year='2025']")));
	StartDateselect.click();
	
	driver.findElement(By.id("endDate")).click();
	WebElement Enddate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[17]")));
	Enddate.click();
	WebElement Enddateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='23'][data-month='11'][data-year='2025']")));
	Enddateselect.click();
	
	driver.findElement(By.id("btnDownloadWFMDBData")).click();
	Thread.sleep(2000);

	driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	Thread.sleep(1000);

    //Delete
	driver.findElement(By.xpath("//tr[@id='row_53']//td[@class=' delete-control fileDeleteBtn']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();
	Thread.sleep(1000);
	 
	
	//page navigation
	WebElement pagenavigation = driver.findElement(By.name("gwinnettWorkedHoursSummaryTable_length"));
	Select select1 = new Select(pagenavigation);
	select1.selectByVisibleText("25");
	Thread.sleep(1000);
	WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gwinnettWorkedHoursSummaryTable_next")));
	nextpage.click();
	Thread.sleep(1000);
	WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gwinnettWorkedHoursSummaryTable_previous")));
	previous.click();
	Thread.sleep(1000);
		  }	  
}
