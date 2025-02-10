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

public class Accountmaster {
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
	      driver.get("http://localhost:8080/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Reimbursements
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Reimbursements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reimbursements']")));
	 	Reimbursements.click(); 
	 	Thread.sleep(2000);
	 	WebElement AccountsMaster = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Accounts Master']"))); 
	 	AccountsMaster.click();
	Thread.sleep(2000);
	
	//Add, Edit, Delete and Search
	
	//Add
	driver.findElement(By.id("gpAccountCode")).sendKeys("123");
	driver.findElement(By.id("accountName")).sendKeys("Akil");
	driver.findElement(By.xpath("(//button[normalize-space()='Add New'])[1]")).click();
	Thread.sleep(1000);
	
	//Edit
	driver.findElement(By.xpath("(//td[contains(@class,'edit-control btnCol')])[1]")).click();
	driver.findElement(By.id("gpAccountCode")).clear();
	driver.findElement(By.id("gpAccountCode")).sendKeys("1234");
	driver.findElement(By.id("accountName")).clear();
	driver.findElement(By.id("accountName")).sendKeys("Akilan");
	driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("clearSearch")).click();
	Thread.sleep(1000);
	
	//Search and Clear
	driver.findElement(By.id("gpAccountCode")).sendKeys("123");
	driver.findElement(By.id("newSearch")).click();
	driver.findElement(By.id("clearSearch")).click();
	Thread.sleep(1000);
	driver.findElement(By.id("accountName")).sendKeys("Akilan");
	driver.findElement(By.id("newSearch")).click();
	driver.findElement(By.id("clearSearch")).click();
	Thread.sleep(1000);
	 
	//Delete
	driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[1]")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
	Thread.sleep(1000);
	
	
	//Page Navigation
	 WebElement pagenavigation = driver.findElement(By.name("accountSummaryTable_length"));
     Select select1 = new Select(pagenavigation);
     select1.selectByVisibleText("25");
     Thread.sleep(1500);
     WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountSummaryTable_first")));
     nextpage.click();
     Thread.sleep(1500);
     WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("accountSummaryTable_last")));
     previous.click();
     Thread.sleep(1500);
	  }}