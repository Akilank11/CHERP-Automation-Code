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

public class ReimbursementForm {
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
	 	WebElement ReimbursementForm = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Reimbursement Form']"))); 
	 	ReimbursementForm.click();
	Thread.sleep(2000);
	
	//Search, Add and Edit
	
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
    WebElement Vendor = driver.findElement(By.id("vendorId"));
    Select Vendorselect1 = new Select(Vendor);
    Vendorselect1.selectByVisibleText("Adline Brumbalow");
    
    WebElement Month = driver.findElement(By.id("month"));
    Select Monthselect1 = new Select(Month);
    Monthselect1.selectByVisibleText("March");
    
    WebElement Year = driver.findElement(By.id("year"));
    Select Yearelect1 = new Select(Year);
    Yearelect1.selectByVisibleText("2023");
    Thread.sleep(1000);
    driver.findElement(By.id("newReimbEntry")).click();
    Thread.sleep(2000);
	
    //Edit
    WebElement Status = driver.findElement(By.id("status"));
    Select Statuselect1 = new Select(Status);
    Statuselect1.selectByVisibleText("Processed");
    
    

    WebElement splitupfileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles")));
	File splitupfileToUpload = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Dec\\CL_UNUM_December_2024.xlsx"); // Update with the path to your PNG file
	splitupfileInput.sendKeys(splitupfileToUpload.getAbsolutePath());
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[@class='savebtn1 uploadMasterDocFile']")).click();
	 Thread.sleep(1000);
	 
	 
	 //Table Function
	 driver.findElement(By.id("gpTransactionDate")).click();
	 
	 WebElement Account = driver.findElement(By.id("gpAccountCode"));
	    Select Accountselect1 = new Select(Account);
	    Accountselect1.selectByVisibleText("Training (786)");
     
	    WebElement Site = driver.findElement(By.id("gpSiteCode"));
	    Select Siteselect1 = new Select(Site);
	    Siteselect1.selectByVisibleText("CorrectLife Bostick (401)");
	 
	    WebElement Segment = driver.findElement(By.id("gpSegmentCode"));
	    Select Segmentselect1 = new Select(Segment);
	    Segmentselect1.selectByVisibleText("Operations (002)");
	    
	    driver.findElement(By.id("gpDescription")).sendKeys("Test");
	    
	    driver.findElement(By.id("gpAmount")).sendKeys("124.56");
	    
	    WebElement Receipt = driver.findElement(By.id("gpReceipt"));
	    Select Receiptselect1 = new Select(Receipt);
	    Receiptselect1.selectByVisibleText("Yes");
	    
	    WebElement Status2 = driver.findElement(By.id("gpStatus"));
	    Select Statusselect2 = new Select(Status2);
	    Statusselect2.selectByVisibleText("Approved");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("(//button[@id='saveExpenseTran'])[1]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("(//td[@class=' upload-control fileUploadBtn'])[1]")).click();
	    Thread.sleep(2000);
	    
	    WebElement splitupfileInput1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("docFiles")));
		File splitupfileToUpload1 = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Dec\\CL_UNUM_December_2024.xlsx"); // Update with the path to your PNG file
		splitupfileInput1.sendKeys(splitupfileToUpload1.getAbsolutePath());
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[@class='savebtn1 uploadDocFile']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("close")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//td[@class=' download-control fileDownloadBtn'])[1]")).click();
		 Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//input[@id='gpReimbExpenseEntryCheck'])[1]")).click();
		 Thread.sleep(1000);
		 
		 WebElement Status3 = driver.findElement(By.id("transtatus"));
		    Select Statusselect3 = new Select(Status3);
		    Statusselect3.selectByVisibleText("Approved");
		    Thread.sleep(1000);
		    driver.findElement(By.id("setpaid")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.id("generateReimbForm")).click();
		    Thread.sleep(1000);
		    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
		    
		    driver.findElement(By.xpath("(//input[@id='gpReimbExpenseEntryCheck'])[1]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.id("saveExpense")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
			    Thread.sleep(1000);
			    
			    driver.findElement(By.xpath("(//input[@id='gpReimbExpenseEntryCheck'])[1]")).click();
				 Thread.sleep(1000);
				 driver.findElement(By.id("deleteTran")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
				    Thread.sleep(1000);
				    
				    driver.findElement(By.cssSelector(".img-responsive.goSummary[data-placement='right']")).click();
				    Thread.sleep(5000);
				    
				    //Reimbursement Form Summary
				    //driver.findElement(By.xpath("(//td[contains(@class,'download-control1 fileDownloadBtn')])[1]")).click();
				    //Thread.sleep(1000);
				    
				    driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[1]")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
				    Thread.sleep(3000);
				  
				    
				    
				
				    
				  //Page Navigation
					 WebElement pagenavigation = driver.findElement(By.name("expenseSummaryTable_length"));
				     Select select1 = new Select(pagenavigation);
				     select1.selectByVisibleText("25");
				     Thread.sleep(1500);
				     WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("expenseSummaryTable_next")));
				     nextpage.click();
				     Thread.sleep(1500);
				     WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("expenseSummaryTable_previous")));
				     previous.click();
				     Thread.sleep(1500);
	  
	  //Search Function
				     WebElement Vendor1 = driver.findElement(By.id("vendorId"));
				     Select Vendorselect2 = new Select(Vendor1);
				     Vendorselect2.selectByVisibleText("Adline Brumbalow");
				     
				     WebElement Month1 = driver.findElement(By.id("month"));
				     Select Monthselect2 = new Select(Month1);
				     Monthselect2.selectByVisibleText("March");
				     
				     WebElement Year1 = driver.findElement(By.id("year"));
				     Select Yearelect2 = new Select(Year1);
				     Yearelect2.selectByVisibleText("2023");
				     Thread.sleep(1000);
				     driver.findElement(By.id("newSearch")).click();
				     Thread.sleep(2000);
				     driver.findElement(By.id("clearSearch")).click();
	  }}