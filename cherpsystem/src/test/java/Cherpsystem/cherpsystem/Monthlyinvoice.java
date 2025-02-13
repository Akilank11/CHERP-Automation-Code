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

public class Monthlyinvoice {
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
	      driver.get("http://localhost:8080/CHERPSystem/login");
	      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	      driver.findElement(By.id("password")).sendKeys("Dev@9090");
	      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	  	// rememberme.click();
	  	driver.findElement(By.id("btn-login")).click();
	  	driver.manage().window().maximize();
	  	
	  //Click Reimbursements
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
	 	Invoices.click(); 
	 	Thread.sleep(2000);
	 	WebElement MonthlyInvoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Monthly Invoices']"))); 
	 	MonthlyInvoice.click();
	Thread.sleep(2000);
	
	//Create Invoice
	driver.findElement(By.id("createMonthlyInvoice")).click();
	Thread.sleep(2000);
	
	 driver.findElement(By.id("invoiceDate")).click();
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement InvoiceDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[17]")));
	    InvoiceDate.click();
	    InvoiceDate.click();
	    WebElement InvoiceDateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='11'][data-year='2024']")));
	    InvoiceDateselect.click();
	    Thread.sleep(1000);
	
	    driver.findElement(By.xpath("(//input[@placeholder='Filter'])[1]")).sendKeys("Acadia");
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//button[normalize-space()='>>'])[1]")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.id("saveMaster")).click();
	    Thread.sleep(2000);
	    
	    WebElement mailedStatus = driver.findElement(By.id("mailedStatus"));
	    Select mailedStatusselect = new Select(mailedStatus);
	    mailedStatusselect.selectByVisibleText("Not Emailed");
	    
	    WebElement InvoiceStatus = driver.findElement(By.id("paidStatus"));
	    Select InvoiceStatusselect = new Select(InvoiceStatus);
	    InvoiceStatusselect.selectByVisibleText("Processed");
	    
	    driver.findElement(By.id("newMBSearch")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.id("clearMBSearch")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("(//input[@id='miInvoiceCheck'])[1]")).click();
	    WebElement InvoiceStatus1 = driver.findElement(By.id("paidStatus"));
	    Select InvoiceStatusselect1 = new Select(InvoiceStatus1);
	    InvoiceStatusselect1.selectByVisibleText("Processed");
	    driver.findElement(By.id("setpaid")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("(//input[@id='miInvoiceCheck'])[1]")).click();
	    WebElement Month = driver.findElement(By.id("miInvoiceMonth"));
	    Select Monthselect1 = new Select(Month);
	    Monthselect1.selectByVisibleText("March");
	    WebElement Year = driver.findElement(By.id("miInvoiceYear"));
	    Select Yearselect1 = new Select(Year);
	    Yearselect1.selectByVisibleText("2024");
	    driver.findElement(By.id("notes")).sendKeys("Acadia");
	    driver.findElement(By.id("adjustmentNotes")).sendKeys("Test");
	    driver.findElement(By.id("miAdjustmentRate")).sendKeys("10.25");
	    driver.findElement(By.xpath("(//td[@class=' download-control fileDownloadBtn'])[1]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("(//td[@class=' upload-control fileUploadBtn'])[1]")).click();
	    Thread.sleep(1000);
	    WebElement splitupfileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("docFiles")));
		File splitupfileToUpload = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Dec\\CL_UNUM_December_2024.xlsx"); // Update with the path to your PNG file
		splitupfileInput.sendKeys(splitupfileToUpload.getAbsolutePath());
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.id("close")).click();
		 Thread.sleep(1000);
	    WebElement mailedStatus1 = driver.findElement(By.id("mailedStatus"));
	    Select mailedStatusselect1 = new Select(mailedStatus1);
	    mailedStatusselect1.selectByVisibleText("Emailed");
	    
	    WebElement InvoiceStatus2 = driver.findElement(By.id("miPaymentStatus"));
	    Select InvoiceStatusselect2 = new Select(InvoiceStatus2);
	    InvoiceStatusselect2.selectByVisibleText("Paid");
	    driver.findElement(By.id("saveTran")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	    Thread.sleep(1000);
	    
	    
	    //Page Navigation
		 WebElement pagenavigation = driver.findElement(By.name("monthlyInvoiceTranListTable_length"));
	     Select select1 = new Select(pagenavigation);
	     select1.selectByVisibleText("30");
	     Thread.sleep(1500);
	     WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("monthlyInvoiceTranListTable_last")));
	     nextpage.click();
	     Thread.sleep(1500);
	     WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("monthlyInvoiceTranListTable_first")));
	     previous.click();
	     Thread.sleep(1500);
	     
	     //Mail and Download
	     //driver.findElement(By.id("SendRowMail")).click();
		   // Thread.sleep(4000);
		    //driver.findElement(By.id("SendRowMail2")).click();
		    //Thread.sleep(4000);
		    //driver.findElement(By.xpath("deleteTran")).click();
		    //Thread.sleep(500);
		    //driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
		    //Thread.sleep(2000);
		    //driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
		    //Thread.sleep(2000);
		    driver.findElement(By.xpath("//img[@data-placement='right']")).click();
		    Thread.sleep(2000);
		    
	  }
		    @Test (enabled=true)
			  public void Monthlyinvoice() throws InterruptedException {
			      driver.get("http://localhost:8080/CHERPSystem/login");
			      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
			      driver.findElement(By.id("password")).sendKeys("Dev@9090");
			      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
			  	// rememberme.click();
			  	driver.findElement(By.id("btn-login")).click();
			  	driver.manage().window().maximize();
			  	
			  //Click Reimbursements
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			 	WebElement Invoices = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewInvoice']")));
			 	Invoices.click(); 
			 	Thread.sleep(2000);
			 	WebElement MonthlyInvoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Monthly Invoices']"))); 
			 	MonthlyInvoice.click();
			Thread.sleep(5000);
		    
			//Monthly Invoice Summary
			 driver.findElement(By.xpath("(//td[contains(@class,'edit-control btnCol')])[1]")).click();
			    Thread.sleep(3000);
			    driver.findElement(By.xpath("//img[@data-placement='right']")).click();
			    Thread.sleep(5000);
			    driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[1]")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
			    Thread.sleep(2000);
			    
			    WebElement pagenavigation = driver.findElement(By.name("invoiceSummaryTable_length"));
			     Select select1 = new Select(pagenavigation);
			     select1.selectByVisibleText("15");
			     Thread.sleep(1500);
			     WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceSummaryTable_next")));
			     nextpage.click();
			     Thread.sleep(1500);
			     WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceSummaryTable_previous")));
			     previous.click();
			     Thread.sleep(1500);
			     
			     //Search Function
			     WebElement Facility = driver.findElement(By.id("facilityID"));
			     Select Facility1 = new Select(Facility);
			     Facility1.selectByVisibleText("Acadia Parish Jail (182)");
			     driver.findElement(By.id("dateFrom")).click();
				    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
				    WebElement InvoiceDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
				    InvoiceDate.click();
				    InvoiceDate.click();
				    WebElement InvoiceDateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='11'][data-year='2024']")));
				    InvoiceDateselect.click();
				    Thread.sleep(1000);
				    driver.findElement(By.id("dateTo")).click();
				    
				    WebElement InvoiceDat1e = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
				    InvoiceDat1e.click();
				    
				    WebElement InvoiceDateselect1 = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='0'][data-year='2025']")));
				    InvoiceDateselect1.click();
				    Thread.sleep(1000);
				    driver.findElement(By.id("newSearchTran")).click();
				    Thread.sleep(1000);
				    driver.findElement(By.id("clearSearchTran")).click();
				    Thread.sleep(3000);
				    
				    
				    WebElement pagenavigation1 = driver.findElement(By.name("monthlyInvoiceTranListTable_length"));
				     Select select2 = new Select(pagenavigation1);
				     select2.selectByVisibleText("15");
				     Thread.sleep(1500);
				     WebElement nextpage1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("monthlyInvoiceTranListTable_last")));
				     nextpage1.click();
				     Thread.sleep(1500);
				     WebElement previous1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("monthlyInvoiceTranListTable_first")));
				     previous1.click();
				     Thread.sleep(1500);
				     driver.findElement(By.xpath("(//td[@class=' download-control fileDownloadBtn'])[1]")).click();
					    Thread.sleep(2000);
					    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
					    Thread.sleep(1000);
					    
					    driver.findElement(By.xpath("(//td[contains(@class,'download-control1 fileDownloadBtn')])[1]")).click();
					    Thread.sleep(2000);
					    driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
					    Thread.sleep(1000);
					    driver.findElement(By.xpath("(//td[contains(@class,'edit-control btnCol')])[16]")).click();
					    Thread.sleep(2000);
					    driver.findElement(By.xpath("//img[@data-placement='right']")).click();
					    Thread.sleep(2000);
	  }}