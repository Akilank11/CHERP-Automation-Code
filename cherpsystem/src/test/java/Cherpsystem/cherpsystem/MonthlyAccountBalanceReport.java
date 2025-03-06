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

public class MonthlyAccountBalanceReport {
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

	  @Test (enabled=true)
	  public void loginTest() throws InterruptedException {
	      driver.get("http://localhost:8090/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Amex statement entry
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Expense = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Expense Cards']")));
	 	Expense.click(); 
	 	Thread.sleep(2000);
	 	WebElement creditlimit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Credit Limit Transaction']"))); 
	 	creditlimit.click();
	Thread.sleep(2000);
	WebElement Monthly = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Monthly Account Balance Report']"))); 
	Monthly.click();
Thread.sleep(2000);
	
//Report Download
WebElement Facility = driver.findElement(By.name("facilityCode"));
Select Facilityselect = new Select(Facility);
Facilityselect.selectByVisibleText("All");

WebElement frommonth = driver.findElement(By.name("startMonth"));
Select frommonthselect = new Select(frommonth);
frommonthselect.selectByVisibleText("May");

WebElement fromYear = driver.findElement(By.name("startYear"));
Select fromYearselect = new Select(fromYear);
fromYearselect.selectByVisibleText("2023");

WebElement tomonth = driver.findElement(By.name("endMonth"));
Select tomonthselect = new Select(tomonth);
tomonthselect.selectByVisibleText("May");

WebElement toYear = driver.findElement(By.name("endYear"));
Select toYearselect = new Select(toYear);
toYearselect.selectByVisibleText("2024");

Thread.sleep(1500);
driver.findElement(By.id("saveData")).click();
Thread.sleep(4000);
driver.findElement(By.id("Clear")).click();

	  }}