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

public class AccountBalanceDetails {
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
	WebElement balance = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Account Balance Details']"))); 
	balance.click();
Thread.sleep(2000);
	
//Report Download
WebElement Facility = driver.findElement(By.name("facilityCodeFilter"));
Select Facilityselect = new Select(Facility);
Facilityselect.selectByVisibleText("Acadia Parish Jail");

WebElement month = driver.findElement(By.name("monthFilter"));
Select monthselect = new Select(month);
monthselect.selectByVisibleText("May");

WebElement year = driver.findElement(By.name("yearFilter"));
Select yearselect = new Select(year);
yearselect.selectByVisibleText("2023");


Thread.sleep(1500);
driver.findElement(By.id("newSearch")).click();
Thread.sleep(3000);
driver.findElement(By.id("clearData")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//td[@class=' edit-control btnCol'])[1]")).click();
Thread.sleep(2500);
driver.findElement(By.xpath("(//img[@data-placement='right'])[1]")).click();

Thread.sleep(2500);


driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();

Thread.sleep(2500);

//page navigation
WebElement pagenavigation = driver.findElement(By.name("expenseSummaryTable_length"));
Select select1 = new Select(pagenavigation);
select1.selectByVisibleText("75");
Thread.sleep(3000);
WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("expenseSummaryTable_next")));
nextpage.click();
Thread.sleep(5000);
WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("expenseSummaryTable_previous")));
previous.click();
Thread.sleep(5000);

	  }}
