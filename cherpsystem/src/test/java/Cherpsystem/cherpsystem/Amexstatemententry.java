package Cherpsystem.cherpsystem;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Amexstatemententry {WebDriver driver = new ChromeDriver();
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
  	
  //Click Amex statement entry
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement Amex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#expenseTran']")));
 	Amex.click(); 
 	Thread.sleep(2000);
 	WebElement amexstatemententry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='AMEX Statement Entry']"))); 
 	amexstatemententry.click();
Thread.sleep(2000);

//Search
WebElement employee = driver.findElement(By.name("empId"));
Select employeeselect = new Select(employee);
employeeselect.selectByVisibleText("Lynn M Junca");
WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
search.click(); 
Thread.sleep(2000);
WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
clear.click();
Thread.sleep(2000);

//Edit Function
WebElement Edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[contains(@class,'edit-control btnCol')])[1]")));
Edit.click(); 
Thread.sleep(2000);

//Upload File
WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles")));
	File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Dec\\CL_UNUM_December_2024.xlsx"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
	 Thread.sleep(2000);
	 WebElement Delete = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@class=' delete-control fileDeleteBtn2'])[1]")));
	 Delete.click(); 
	 Thread.sleep(500);
	 driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
	 Thread.sleep(500);
	 
	 
	 //Add New Transaction
	   driver.findElement(By.id("transactionDate")).click();
	    WebElement transactionDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[20]")));
	    
	   transactionDate.click();
	    WebElement transactionDateselect1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='0'][data-year='2025']")));
	    transactionDateselect1.click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("vendor")).sendKeys("Test Vendor");
	    driver.findElement(By.id("gpAmount")).sendKeys("54.36");
	    WebElement Receipt = driver.findElement(By.name("gpReceipt"));
	    Select Receiptselect = new Select(Receipt);
	    Receiptselect.selectByVisibleText("Yes");
	    WebElement Account = driver.findElement(By.name("accountId"));
	    Select Accountselect = new Select(Account);
	    Accountselect.selectByVisibleText("Accreditation (705)");
	    WebElement Site = driver.findElement(By.name("siteId"));
	    Select Siteselect = new Select(Site);
	    Siteselect.selectByVisibleText("CH Admin (100)");
	    driver.findElement(By.id("gpComment")).sendKeys("Test Vendor Comments");
	    Thread.sleep(500);
	    driver.findElement(By.id("addNewExpense")).click();
	    Thread.sleep(2000);
	    
	  // Transaction Table Function  
	    driver.findElement(By.id("searchByVendor")).sendKeys("Test");
	    driver.findElement(By.id("searchByTransactionDate")).click();
	    WebElement transactionDate1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[26]")));
	    transactionDate1.click();
	   transactionDate1.click();
	    WebElement transactionDateselect2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='11'][data-year='2024']")));
	    transactionDateselect2.click();
	    Thread.sleep(1000);
	    WebElement search1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Search")));
	    search1.click(); 
	    Thread.sleep(2000);
	    WebElement clear1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("Reset")));
	    clear1.click();
	    Thread.sleep(5000);
	    WebElement selectall = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='expenseTranListTable-select-all']")));
	    selectall.click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("saveExpense")).click();
	    Thread.sleep(1000);
	    driver.switchTo().alert().accept();
	    
	    
	    
	    
	    
	    
	    
	    
  }}
