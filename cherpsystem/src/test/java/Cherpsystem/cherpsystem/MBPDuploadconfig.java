package Cherpsystem.cherpsystem;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MBPDuploadconfig {
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
	  	
	  //Click Pharmacy

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Invoice= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
		Invoice.click(); 
	 	WebElement Mbpdconfig= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='MB/PD Upload Config']"))); 
	 	Mbpdconfig.click();
	Thread.sleep(2000);
	
	//Search and Clear
	
	WebElement Facility = driver.findElement(By.id("facilityContractId"));
    Select Facilityselect = new Select(Facility);
    Facilityselect.selectByVisibleText("Acadia Parish Jail (182)");
    Thread.sleep(500);
	driver.findElement(By.id("newSearch")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("clearSearch")).click();
	Thread.sleep(2500);
	
	//Edit
	
	driver.findElement(By.xpath("(//td[@class=' edit-control btnCol'])[1]")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("mbPDUploadFolderName")).clear();
	driver.findElement(By.id("mbPDUploadFolderName")).sendKeys("Test1");
	WebElement Facility1 = driver.findElement(By.id("facilityContractId"));
    Select CategoryNameselect1 = new Select(Facility1);
    CategoryNameselect1.selectByVisibleText("Acadia Parish Jail (182)");
    Thread.sleep(1500);
  
  
    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    driver.findElement(By.xpath("(//a[@class='close'][normalize-space()='×'])[1]")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("clearSearch")).click();
	Thread.sleep(2500);
    
    //Add New
    
    
    driver.findElement(By.id("mbPDUploadFolderName")).sendKeys("Akilan Test");
    WebElement Facility2 = driver.findElement(By.id("facilityContractId"));
    Select Facility2select1 = new Select(Facility2);
    Facility2select1.selectByVisibleText("Acadia Parish Jail (182)");
    Thread.sleep(1500);
    
  //Move All
  
    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    Thread.sleep(1500);
   
    
  //Page Navigation
	 WebElement pagenavigation = driver.findElement(By.name("facilityUploadSummaryTable_length"));
	    Select select4 = new Select(pagenavigation);
	    select4.selectByVisibleText("25");
	    Thread.sleep(1000);
	    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facilityUploadSummaryTable_length")));
	    nextpage.click();
	    Thread.sleep(1500);
	    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facilityUploadSummaryTable_first")));
	    previous.click();
	    Thread.sleep(1500);
	  }}