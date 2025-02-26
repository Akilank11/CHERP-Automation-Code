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

public class TBNJInvoicesummary {
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
	  	
	  //Click TBNJ Invoice Rate Master

WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Invoice= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
		Invoice.click(); 
	 	WebElement TBNJinvoice= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='TBNJ Invoices']"))); 
	 	TBNJinvoice.click();
	Thread.sleep(1000);
	WebElement TBNJinvoicesummary= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='TBNJ Invoice Summary']"))); 
	TBNJinvoicesummary.click();
	Thread.sleep(2000);
	
	
	//Summary Search and Clear
	
	WebElement Month = driver.findElement(By.id("month"));
    Select Monthselect = new Select(Month);
    Monthselect.selectByVisibleText("October");
    
    WebElement Year = driver.findElement(By.id("year"));
    Select Yearselect = new Select(Year);
    Yearselect.selectByVisibleText("2024");
    
    driver.findElement(By.id("invoiceNoStr")).sendKeys("STAF241031");
    
    driver.findElement(By.id("invoiceDate")).click();
    
    WebElement invoiceDate  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[9]")));
    invoiceDate .click();
    invoiceDate .click();
    invoiceDate .click();
    invoiceDate .click();
    WebElement invoiceDate1  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='9'][data-year='2024']")));
    invoiceDate1 .click();
    Thread.sleep(1000);
    
    driver.findElement(By.id("newSearch")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("clearButtonId")).click();
    Thread.sleep(2000);
    
    //Page Navigation
    WebElement pagenavigation = driver.findElement(By.name("tbnjInvoiceSummaryTable_length"));
    Select select4 = new Select(pagenavigation);
    select4.selectByVisibleText("25");
    Thread.sleep(1000);
    //WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbnjInvoiceSummaryTable_next")));
    //nextpage.click();
    //Thread.sleep(1500);
    //WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("tbnjInvoiceSummaryTable_previous")));
    //previous.click();
    //Thread.sleep(2500);
    
    //Download, Delete and Send 
    
    driver.findElement(By.xpath("(//td[@class=' download-control fileDownloadBtn'])[2]")).click();
    Thread.sleep(2000);
    
  
    
    driver.findElement(By.xpath("(//input[@id='miInvoiceCheckrow_2'])[1]")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("(//input[@id='miInvoiceCheckrow_1'])[1]")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.id("SendTBNJMail")).click();
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[2]")).click();
    Thread.sleep(1000);
    
    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
    Thread.sleep(2000);
    
    WebElement Month1 = driver.findElement(By.id("month"));
    Select Monthselect1 = new Select(Month1);
    Monthselect1.selectByVisibleText("November");
    
    WebElement Year1 = driver.findElement(By.id("year"));
    Select Yearselect1 = new Select(Year1);
    Yearselect1.selectByVisibleText("2024");
    
    driver.findElement(By.id("downloadCherpPayrollData1")).click();
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
    Thread.sleep(1500);
    
    driver.findElement(By.id("generatTBNJInvoices1")).click();
    Thread.sleep(4500);
    
    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
    Thread.sleep(1500);
	  }}