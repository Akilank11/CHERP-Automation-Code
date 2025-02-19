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

public class Pharmacydrugmaster {
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
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Pharmacy

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Pharmacy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Pharmacy']")));
		Pharmacy.click(); 
	 	WebElement Pharmacydrugmaster= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Pharmacy Drug Master']"))); 
	 	Pharmacydrugmaster.click();
	Thread.sleep(2000);
	
	//Search and Clear
	
	driver.findElement(By.id("pharmaDrugName")).sendKeys("BENZTROPINE");
	WebElement CategoryName = driver.findElement(By.id("pharmaCategoryId"));
    Select CategoryNameselect = new Select(CategoryName);
    CategoryNameselect.selectByVisibleText("MH FORM");
    Thread.sleep(500);
	driver.findElement(By.id("newSearch")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("clearSearch")).click();
	Thread.sleep(2500);
	
	//Edit
	
	driver.findElement(By.xpath("(//td[@class=' edit-control btnCol'])[1]")).click();
	Thread.sleep(1500);
	driver.findElement(By.id("pharmaDrugName")).clear();
	driver.findElement(By.id("pharmaDrugName")).sendKeys("BENZTROPINE1");
	WebElement CategoryName1 = driver.findElement(By.id("pharmaCategoryId"));
    Select CategoryNameselect1 = new Select(CategoryName1);
    CategoryNameselect1.selectByVisibleText("MH NF");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    driver.findElement(By.xpath("(//a[@class='close'][normalize-space()='×'])[1]")).click();
    Thread.sleep(1500);
    
    //Add New
    
    driver.findElement(By.id("pharmaDrugName")).clear();
    driver.findElement(By.id("pharmaDrugName")).sendKeys("Akilan Test");
	WebElement CategoryName2 = driver.findElement(By.id("pharmaCategoryId"));
    Select CategoryNameselect2 = new Select(CategoryName2);
    CategoryNameselect2.selectByVisibleText("MH NF");
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
    Thread.sleep(1500);
    //driver.findElement(By.id("drugSummaryTable_last")).click();
    //Thread.sleep(1000);
    driver.findElement(By.xpath("(//td[@class=' delete-control fileDeleteBtn'])[1]")).click();
    Thread.sleep(1500);
    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
    Thread.sleep(1500);
    
  //Page Navigation
	 WebElement pagenavigation = driver.findElement(By.name("drugSummaryTable_length"));
	    Select select4 = new Select(pagenavigation);
	    select4.selectByVisibleText("25");
	    Thread.sleep(1000);
	    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("drugSummaryTable_last")));
	    nextpage.click();
	    Thread.sleep(1500);
	    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("drugSummaryTable_first")));
	    previous.click();
	    Thread.sleep(1500);
	  }}