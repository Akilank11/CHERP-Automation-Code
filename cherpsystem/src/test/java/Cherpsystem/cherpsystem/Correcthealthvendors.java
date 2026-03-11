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

public class Correcthealthvendors {
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
	  	
	  //Add CorrectHealth Vendors


	  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Invoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
	 	Invoice.click(); 
	 	Thread.sleep(2000);
	 	WebElement Chathamquarterlyreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='# quarterlyReports']"))); 
	 	Chathamquarterlyreport.click();
	Thread.sleep(2000);
	WebElement Correcthealthvendors = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CorrectHealth Vendors']"))); 
	Correcthealthvendors.click();
Thread.sleep(2000);

driver.findElement(By.id("vendorId")).sendKeys("001998");
driver.findElement(By.id("vendorName")).sendKeys("Test Vendors");
driver.findElement(By.id("wfmEmpId")).sendKeys("10610");
driver.findElement(By.id("department")).sendKeys("Provider Mental Health");
driver.findElement(By.id("job")).sendKeys("Psychiatrist");

Thread.sleep(2000);
WebElement Status = driver.findElement(By.name("status"));
Select selectposition = new Select(Status);
selectposition.selectByVisibleText("Active");
Thread.sleep(2000);



driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

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
	
//Edit and Search CorrectHealth Vendors

	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement Invoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
 	Invoice.click(); 
 	Thread.sleep(2000);
 	WebElement Chathamquarterlyreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='# quarterlyReports']"))); 
 	Chathamquarterlyreport.click();
Thread.sleep(2000);
WebElement Correcthealthvendors = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='CorrectHealth Vendors']"))); 
Correcthealthvendors.click();
Thread.sleep(2000);

driver.findElement(By.xpath("//tr[@id='row_254']//td[@class='edit-control btnCol sorting_1']")).click();
driver.findElement(By.id("vendorId")).clear();
driver.findElement(By.id("vendorId")).sendKeys("001999");

driver.findElement(By.id("vendorName")).clear();
driver.findElement(By.id("vendorName")).sendKeys("Test Vendor");

driver.findElement(By.id("wfmEmpId")).clear();
driver.findElement(By.id("wfmEmpId")).sendKeys("10611");

driver.findElement(By.id("department")).clear();
driver.findElement(By.id("department")).sendKeys("Oversite Operations");

driver.findElement(By.id("job")).clear();
driver.findElement(By.id("job")).sendKeys("LPN");

Thread.sleep(2000);


driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();

Thread.sleep(2000);

driver.findElement(By.xpath("(//button[normalize-space()='Clear'])[1]")).click();
Thread.sleep(2000);
driver.findElement(By.id("vendorId")).sendKeys("001998");
driver.findElement(By.id("vendorName")).sendKeys("Test Vendors");
driver.findElement(By.id("wfmEmpId")).sendKeys("10610");
driver.findElement(By.id("department")).sendKeys("Provider Mental Health");
driver.findElement(By.id("job")).sendKeys("Psychiatrist");
Thread.sleep(2000);
driver.findElement(By.id("newSearch")).click();
Thread.sleep(2000);

driver.findElement(By.xpath("(//button[normalize-space()='Clear'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//button[normalize-space()='Update Vendors']")).click();
Thread.sleep(4000);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
//page navigation
	WebElement pagenavigation = driver.findElement(By.name("vendorSummaryTable_length"));
	Select select1 = new Select(pagenavigation);
	select1.selectByVisibleText("5");
	Thread.sleep(1000);
	WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vendorSummaryTable_next")));
	nextpage.click();
	Thread.sleep(1000);
	WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("vendorSummaryTable_previous")));
	previous.click();
	Thread.sleep(1000);


}}
