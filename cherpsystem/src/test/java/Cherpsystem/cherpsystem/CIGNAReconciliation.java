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

public class CIGNAReconciliation {
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
	        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	    	rememberme.click();
	    	driver.findElement(By.id("btn-login")).click();
	    	driver.manage().window().maximize();
	    	
	    	//Click BCBS 
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Reports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
		 	Reports.click(); 
		 	Thread.sleep(3000);
		 	WebElement CignaReports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CIGNA Reports']"))); 
		 	CignaReports.click();
		 	WebElement CignaReconciliationReports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CIGNA Reconciliation Report']"))); 
		 	CignaReconciliationReports.click();
	Thread.sleep(2000);
	
	//UNUM Reconciliation Report by Month

	WebElement Month = driver.findElement(By.id("month"));
	Select Monthselect = new Select(Month);
	Monthselect.selectByVisibleText("January");
	
	WebElement year = driver.findElement(By.id("year"));
	Select yearselect = new Select(year);
	yearselect.selectByVisibleText("2025");
	
	WebElement Company = driver.findElement(By.id("companyCode"));
	Select Companyselect = new Select(Company);
	Companyselect.selectByVisibleText("Triage Holding Inc");
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='savebtn1 clear']")).click();
	Thread.sleep(2000);
	Monthselect.selectByVisibleText("January");
	yearselect.selectByVisibleText("2025");
	Companyselect.selectByVisibleText("Triage Holding Inc");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='savebtn1 excelReport']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@class='savebtn1 excelReport2']")).click();
	    }
  
	@Test (enabled=true)
    public void unumrecon() throws InterruptedException {
        driver.get("http://localhost:8080/CHERPSystem/login");
        driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Dev@9090");
        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
    	rememberme.click();
    	driver.findElement(By.id("btn-login")).click();
    	driver.manage().window().maximize();
    	
    	//Click BCBS 
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Reports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
	 	Reports.click(); 
	 	Thread.sleep(3000);
	 	WebElement CignaReports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CIGNA Reports']"))); 
	 	CignaReports.click();
	 	WebElement CignaReconciliationReports = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CIGNA Reconciliation Report']"))); 
	 	CignaReconciliationReports.click();
Thread.sleep(2000);

//UNUM Reconciliation Report by Period

WebElement startMonth = driver.findElement(By.id("startMonth"));
Select startMonthselect = new Select(startMonth);
startMonthselect.selectByVisibleText("January");

WebElement Startyear = driver.findElement(By.id("startYear"));
Select Startyearselect = new Select(Startyear);
Startyearselect.selectByVisibleText("2025");

WebElement EndMonth = driver.findElement(By.id("endMonth"));
Select EndMonthselect = new Select(EndMonth);
EndMonthselect.selectByVisibleText("January");

WebElement Endyear = driver.findElement(By.id("endYear"));
Select Endyearselect = new Select(Endyear);
Endyearselect.selectByVisibleText("2025");

WebElement Company = driver.findElement(By.id("companyCodePeriod"));
Select Companyselect = new Select(Company);
Companyselect.selectByVisibleText("Triage Holding Inc");

Thread.sleep(2000);
driver.findElement(By.xpath("//button[@class='savebtn1 clear1']")).click();
Thread.sleep(2000);
startMonthselect.selectByVisibleText("January");
Startyearselect.selectByVisibleText("2025");
EndMonthselect.selectByVisibleText("January");
Endyearselect.selectByVisibleText("2025");
Companyselect.selectByVisibleText("Triage Holding Inc");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(text(),'Excel Report Download')]")).click();

Thread.sleep(5000);
driver.findElement(By.xpath("//button[@class='savebtn1 excelReport12']")).click();
	    
	    }
}
