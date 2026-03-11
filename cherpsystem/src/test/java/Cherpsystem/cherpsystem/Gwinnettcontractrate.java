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

public class Gwinnettcontractrate {
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
	 	WebElement Invoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
	 	Invoice.click(); 
	 	Thread.sleep(2000);
	 	WebElement GwinnettContractpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Contract Rates']"))); 
	 	GwinnettContractpage.click();
	Thread.sleep(2000);
	WebElement GwinnettContractratepage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Contract Rate Details']"))); 
	GwinnettContractratepage.click();
Thread.sleep(2000);

WebElement position = driver.findElement(By.name("position"));
Select selectposition = new Select(position);
selectposition.selectByVisibleText("Administrative Assistant");

driver.findElement(By.id("contractRate")).sendKeys("101.25");


driver.findElement(By.id("startDate")).click();
WebElement StartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
StartDate.click();
StartDate.click();
StartDate.click();
StartDate.click();
StartDate.click();
WebElement StartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1'][data-month='8'][data-year='2025']")));
StartDateselect.click();
driver.findElement(By.id("endDate")).click();
WebElement Enddate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
Enddate.click();
Enddate.click();
Enddate.click();
Enddate.click();
WebElement Enddateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='31'][data-month='9'][data-year='2025']")));
Enddateselect.click();
driver.findElement(By.id("addNewData")).click();

	  }
//Edit and Search


@Test 
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
 	WebElement Invoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
 	Invoice.click(); 
 	Thread.sleep(2000);
 	WebElement GwinnettContractpage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Contract Rates']"))); 
 	GwinnettContractpage.click();
Thread.sleep(2000);
WebElement GwinnettContractratepage = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Gwinnett Contract Rate Details']"))); 
GwinnettContractratepage.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//tr[@id='row_19']//td[contains(@class,'edit-control btnCol')]")).click();
Thread.sleep(2000);
driver.findElement(By.id("addNewData")).click();
Thread.sleep(2000);

driver.findElement(By.id("contractRate")).sendKeys("101.25");
driver.findElement(By.id("startDate")).click();
WebElement StartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
StartDate.click();
StartDate.click();
StartDate.click();
StartDate.click();
StartDate.click();
WebElement StartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1'][data-month='8'][data-year='2025']")));
StartDateselect.click();
driver.findElement(By.id("endDate")).click();
WebElement Enddate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
Enddate.click();
Enddate.click();
Enddate.click();
Enddate.click();
WebElement Enddateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='31'][data-month='9'][data-year='2025']")));
Enddateselect.click();
driver.findElement(By.id("newSearch")).click();
Thread.sleep(2000);
driver.findElement(By.id("clearNewData")).click();

//page navigation
	WebElement pagenavigation = driver.findElement(By.name("gwinnettContractRateDetailsTable_length"));
	Select select1 = new Select(pagenavigation);
	select1.selectByVisibleText("30");
	Thread.sleep(1000);
	WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gwinnettContractRateDetailsTable_next")));
	nextpage.click();
	Thread.sleep(1000);
	WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gwinnettContractRateDetailsTable_previous")));
	previous.click();
	Thread.sleep(1000);


}}