package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class jobwisepayrolldata {
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
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Reimbursements
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Report= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
		Report.click(); 
	 	WebElement PayrollReport= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Payroll Reports']")));
	 	PayrollReport.click(); 
	 	Thread.sleep(2000);
	 	WebElement jobwisePayrollDataReport= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Jobwise Payroll Data']"))); 
	 	jobwisePayrollDataReport.click();
	Thread.sleep(2000);
	
	//Generate Report
	
	WebElement FacilityStatus = driver.findElement(By.id("facilityStatus"));
    Select FacilityStatusselect = new Select(FacilityStatus);
    FacilityStatusselect.selectByVisibleText("Active");
    
    WebElement Facility = driver.findElement(By.id("facilityAbbr"));
    Select Facilityselect = new Select(Facility);
    Facilityselect.selectByVisibleText("Acadia Parish Jail");
    
    WebElement jobCode = driver.findElement(By.id("jobCode"));
    Select jobCodeselect = new Select(jobCode);
    jobCodeselect.selectByVisibleText("Acadia Parish Jail");
    
  //Move All
    //WebElement moveall= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='>>']")));
    //moveall.click();
    //Thread.sleep(500);
    
    //Move Limited
    Actions act = new Actions(driver);
  WebElement ele = driver.findElement(By.xpath("(//option[@value='234'])[1]")); 
  act.doubleClick(ele).perform();
  
    
  WebElement ele1 = driver.findElement(By.xpath("(//option[@value='235'])[1]")); 
  act.doubleClick(ele1).perform();
  
  WebElement ele2 = driver.findElement(By.xpath("(//option[@value='236'])[1]")); 
  act.doubleClick(ele2).perform();
  
  WebElement ele3 = driver.findElement(By.xpath("(//option[@value='194'])[1]")); 
  act.doubleClick(ele3).perform();
  
  WebElement ele4 = driver.findElement(By.xpath("(//option[@value='195'])[1]")); 
  act.doubleClick(ele4).perform();
  
  WebElement ele5 = driver.findElement(By.xpath("(//option[@value='198'])[1]")); 
  act.doubleClick(ele5).perform();
  
  WebElement ele6 = driver.findElement(By.xpath("(//option[@value='200'])[1]")); 
  act.doubleClick(ele6).perform();
  
  WebElement ele7 = driver.findElement(By.xpath("(//option[@value='201'])[1]")); 
  act.doubleClick(ele7).perform();
  
  WebElement ele8 = driver.findElement(By.xpath("(//option[@value='203'])[1]")); 
  act.doubleClick(ele8).perform();
  
  WebElement ele9 = driver.findElement(By.xpath("(//option[@value='236'])[1]")); 
  act.doubleClick(ele9).perform();
  
  WebElement ele10 = driver.findElement(By.xpath("(//option[@value='204'])[1]")); 
  act.doubleClick(ele10).perform();
  
  WebElement ele11 = driver.findElement(By.xpath("(//option[@value='106'])[1]")); 
  act.doubleClick(ele11).perform();
  
  
    //driver.findElement(By.id("newSearch")).click();
  Thread.sleep(3000);
driver.findElement(By.xpath("//button[normalize-space()='Clear']")).click();
   
	  }}