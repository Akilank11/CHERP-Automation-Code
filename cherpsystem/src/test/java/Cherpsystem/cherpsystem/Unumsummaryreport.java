package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Unumsummaryreport {
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
	        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	    	rememberme.click();
	    	driver.findElement(By.id("btn-login")).click();
	    	driver.manage().window().maximize();
	    	
	    	
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Reports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
		 	Reports.click(); 
		 	Thread.sleep(3000);
		 	WebElement UnumREPORT = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='UNUM Reports']"))); 
		 	UnumREPORT.click();
		 	WebElement UnumSummaryreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='UNUM Summary Report']"))); 
		 	UnumSummaryreport.click();
	Thread.sleep(2000);
	
	//Search Function
	
	   driver.findElement(By.id("dateFrom")).click();
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[4]")));
	    FROMDATE.click();
	    FROMDATE.click();
	    WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='0'][data-year='2025']")));
	    dosselect.click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("dateTo")).click();
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement Todate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
	    Todate.click();
	    WebElement Todateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='1'][data-year='2025']")));
	    Todateselect.click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Clear']"));
	    Thread.sleep(1000);
	    dosselect.click();
	    Thread.sleep(1000);
	    Todateselect.click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[normalize-space()='Excel Report Download']"));
	    Thread.sleep(1000);
  }
}

