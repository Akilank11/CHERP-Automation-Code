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

public class HolidayHealthWeekAccountsBalance {
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
	WebElement Holiday = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Holiday/Health Week Accounts Balance Report']"))); 
	Holiday.click();
Thread.sleep(2000);
	
//Report Download
WebElement Facility = driver.findElement(By.name("facilityCode"));
Select Facilityselect = new Select(Facility);
Facilityselect.selectByVisibleText("All");

WebElement Account = driver.findElement(By.name("accountType"));
Select Accountselect = new Select(Account);
Accountselect.selectByVisibleText("Holiday");

WebElement Year = driver.findElement(By.name("year"));
Select Yearselect = new Select(Year);
Yearselect.selectByVisibleText("2023");
Thread.sleep(2000);
driver.findElement(By.id("newSearch")).click();
Thread.sleep(4000);
driver.findElement(By.id("Clear")).click();

	  }}