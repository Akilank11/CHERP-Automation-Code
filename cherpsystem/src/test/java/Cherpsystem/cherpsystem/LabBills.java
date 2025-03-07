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

public class LabBills {
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

	  @Test (enabled=false)
	  public void loginTest() throws InterruptedException {
	      driver.get("http://localhost:8090/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Amex statement entry
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Otherinvoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Other Invoices']")));
	 	Otherinvoice.click(); 
	 	Thread.sleep(2000);
	 	WebElement labbills = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Lab Bills']"))); 
	 	labbills.click();
	Thread.sleep(2000);
	
	//Create Lab Bills
	driver.findElement(By.id("createOtherInvoice")).click();
    Thread.sleep(3000);
    driver.findElement(By.id("invoiceFromDate")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement fromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[13]")));
    fromdate.click();
    fromdate.click();
    fromdate.click();
    fromdate.click();
    fromdate.click();
    fromdate.click();
    WebElement fromdateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='8'][data-year='2024']")));
    fromdateselect.click();

//Select Invoice date
    WebElement todateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceToDate")));
    todateselect.sendKeys("09/29/2024");
    
    WebElement vendor = driver.findElement(By.name("vendorid"));
    Select vendorselect = new Select(vendor);
    vendorselect.selectByVisibleText("2020 MEDICAL CONSULTING INC");
    
    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
	File fileToUpload = new File("C:\\Users\\panini019\\Downloads\\240531ATLQuestLabinv9210013576_SP_06102024.xlsx"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("//button[@class='savebtn1 uploadMasterDocFile1']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.id("uniquenessCheck")).click();
	 driver.findElement(By.id("saveMaster")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='×']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.id("pushDataToClaimsSystem2")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[normalize-space()='×']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.id("pushDataToGPPayments1")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//img[@data-placement='right']")).click();
}
	  
	  @Test (enabled=true)
	  public void Serach() throws InterruptedException {
	      driver.get("http://localhost:8090/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Amex statement entry
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Otherinvoice = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Other Invoices']")));
	 	Otherinvoice.click(); 
	 	Thread.sleep(2000);
	 	WebElement labbills = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Lab Bills']"))); 
	 	labbills.click();
	Thread.sleep(2000);
	
	//Create Lab Bills

    driver.findElement(By.id("dateFrom")).click();
    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement fromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
    fromdate.click();
    fromdate.click();
    fromdate.click();
    fromdate.click();
    fromdate.click();
    fromdate.click();
    WebElement fromdateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='8'][data-year='2024']")));
    fromdateselect.click();

//Select Invoice date
    WebElement todateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("dateTo")));
    todateselect.sendKeys("09/29/2024");
    
    WebElement vendor = driver.findElement(By.name("vendorid"));
    Select vendorselect = new Select(vendor);
    vendorselect.selectByVisibleText("2020 MEDICAL CONSULTING INC");
    
    driver.findElement(By.id("newSearch")).click();
    Thread.sleep(2000);
    driver.findElement(By.id("clearSearch")).click();
    Thread.sleep(3000);
    
    driver.findElement(By.xpath("(//td[@class=' delete-control fileDeleteBtn'])[1]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
    Thread.sleep(1000);
    
    WebElement pagenavigation = driver.findElement(By.name("invoiceSummaryTable_length"));
    Select select1 = new Select(pagenavigation);
    select1.selectByVisibleText("30");
    Thread.sleep(3000);
    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceSummaryTable_next")));
    nextpage.click();
    Thread.sleep(5000);
    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceSummaryTable_previous")));
    previous.click();
    Thread.sleep(5000);
    
    //Edit Page
    
    driver.findElement(By.xpath("(//td[@class=' edit-control btnCol'])[1]")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//img[@data-placement='right']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("(//td[@class=' download-control1 fileDownloadBtn'])[1]")).click();
    Thread.sleep(1000);
	  }}