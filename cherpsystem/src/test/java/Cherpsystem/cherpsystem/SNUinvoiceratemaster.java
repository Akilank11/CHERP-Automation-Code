package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SNUinvoiceratemaster {
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
	  	
	  //Click SNU Invoice Rate Master

      WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Invoice= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
		Invoice.click(); 
	 	WebElement PLQJSNUinvoice= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='PLQJ SNU Invoices']"))); 
	 	PLQJSNUinvoice.click();
	Thread.sleep(1000);
	WebElement PLQJSNUinvoiceratemaster= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='SNU Invoice Rate Master']"))); 
	PLQJSNUinvoiceratemaster.click();
	Thread.sleep(2000);
	
	//Create or Update Rate Master
	
	
	driver.findElement(By.id("effectiveDate")).click();
    
    //WebElement Effective  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
    //Effective .click();
    
    WebElement Effective1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='0'][data-year='2024']")));
    Effective1 .click();
    Thread.sleep(1000);
    
driver.findElement(By.id("lpnhamrate")).clear();
driver.findElement(By.id("lpnhamrate")).sendKeys("68.23");
driver.findElement(By.id("lpnhpmrate")).clear();
driver.findElement(By.id("lpnhpmrate")).sendKeys("73.35");
driver.findElement(By.id("mahamrate")).clear();
driver.findElement(By.id("mahamrate")).sendKeys("47.53");
driver.findElement(By.id("mahpmrate")).clear();
driver.findElement(By.id("mahpmrate")).sendKeys("49.68");
driver.findElement(By.id("vendorrate")).clear();
driver.findElement(By.id("vendorrate")).sendKeys("70.0");
Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();

	
	  }}