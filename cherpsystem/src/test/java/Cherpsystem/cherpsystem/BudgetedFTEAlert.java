package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BudgetedFTEAlert {
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
	      driver.get("http://localhost:8090/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Budgeted FTE Alert



      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Reports= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
		Reports.click(); 
	 	WebElement Facilitycontract= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'Facility Contracts')])[2]"))); 
	 	Facilitycontract.click();
	Thread.sleep(1000);
	WebElement BudgetedFTEAlert= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Budgeted FTE Alert Report']"))); 
	BudgetedFTEAlert.click();
	Thread.sleep(2000);
	
	driver.findElement(By.id("newSearch")).click();
  }
}
