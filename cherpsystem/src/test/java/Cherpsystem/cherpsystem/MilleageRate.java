package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MilleageRate {
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
	 	WebElement MileageRate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Mileage Rate']"))); 
	 	MileageRate.click();
	Thread.sleep(2000);
	
	//Add New Mileage Rate
	driver.findElement(By.id("mileagerate")).clear();
	driver.findElement(By.id("mileagerate")).sendKeys("98.12");
	driver.findElement(By.id("milestobesubtracted")).clear();
	driver.findElement(By.id("milestobesubtracted")).sendKeys("158.14");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
	
	  }}
