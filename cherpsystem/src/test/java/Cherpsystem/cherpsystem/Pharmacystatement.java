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

public class Pharmacystatement {
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
	  	
	  //Click Pharmacy

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Pharmacy= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Pharmacy']")));
		Pharmacy.click(); 
	 	WebElement Pharmacystatement= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Pharmacy Statement']"))); 
	 	Pharmacystatement.click();
	Thread.sleep(2000);
	
	
	//Create New Pharmacy Statement
	
	
	driver.findElement(By.id("createPharmacyStatement")).click();
	WebElement Pharmacy1 = driver.findElement(By.id("vendorid"));
    Select Pharmacyselect = new Select(Pharmacy1);
    Pharmacyselect.selectByVisibleText("DIAMOND PHARMACY SERVICES");
   // Thread.sleep(1000);
	

    Thread.sleep(2000);
    WebElement splitupfileInput1 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
	File splitupfileToUpload1 = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Dec\\CL_UNUM_December_2024.xlsx"); // Update with the path to your PNG file
	splitupfileInput1.sendKeys(splitupfileToUpload1.getAbsolutePath());
	 Thread.sleep(1000);
	 WebElement uploadclick1= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='savebtn1 uploadMasterDocFile1']"))); 
	 uploadclick1.click();
	 
	
	    Thread.sleep(2000);
	    WebElement splitupfileInput2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles2")));
		File splitupfileToUpload2 = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Consolidated\\UNUM Nov 2024 PDF\\TR UNUM Nov 2024.pdf"); // Update with the path to your PNG file
		splitupfileInput2.sendKeys(splitupfileToUpload2.getAbsolutePath());
		 Thread.sleep(1000);
		 WebElement uploadclic2= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='savebtn1 uploadMasterDocFile2']"))); 
		 uploadclic2.click();
		 Thread.sleep(2000);
		 
		 driver.findElement(By.id("saveMaster")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("pushDataToClaimsSystem1")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.id("pushDataToGPPayments1")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("(//button[normalize-space()='Push to Billing and Credits DB'])[1]")).click();
		 Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("(//img[@data-placement='right'])[1]")).click();
		 Thread.sleep(2000);
	  }
		 
		 //Search, Table Function
		 @Test 
		  public void Tablefunction() throws InterruptedException {
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
		 	WebElement Pharmacystatement= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Pharmacy Statement']"))); 
		 	Pharmacystatement.click();
		Thread.sleep(2000);
		
		//Search
		driver.findElement(By.name("dateTo")).click();
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement InvoicetoDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
	    InvoicetoDate.click();
	    InvoicetoDate.click();
	    InvoicetoDate.click();
	    WebElement InvoicetoDateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='10'][data-year='2024']")));
	    InvoicetoDateselect.click();
		 
		    
		    WebElement Search= wait.until(ExpectedConditions.elementToBeClickable(By.id("newSearch"))); 
		    Search.click();
		    Thread.sleep(2000);
		 	WebElement Clear= wait.until(ExpectedConditions.elementToBeClickable(By.id("clearSearch"))); 
		 	Clear.click();
		 	Thread.sleep(3000);
		 	
		 	driver.findElement(By.id("dateFrom")).click();
		    WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
		    WebElement InvoicefromDate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
		    InvoicefromDate.click();
		    InvoicefromDate.click();
		    WebElement InvoicefromDateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='15'][data-month='11'][data-year='2024']")));
		    InvoicefromDateselect.click();
		    Thread.sleep(1000);
			    Thread.sleep(1000);
			    Search.click();
			    Thread.sleep(2000);
			    Clear.click();
		 	
			    WebElement Pharmacy1 = driver.findElement(By.id("vendorid"));
			    Select Pharmacyselect = new Select(Pharmacy1);
			    Pharmacyselect.selectByVisibleText("DIAMOND PHARMACY SERVICES");
			    Thread.sleep(1000);
			    Search.click();
			    Thread.sleep(2000);
			    Clear.click();
			    
			    
			    //Delete
			    driver.findElement(By.xpath("(//td[contains(@class,'delete-control fileDeleteBtn')])[1]")).click();
			    Thread.sleep(1000);
			    driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
			    Thread.sleep(2000);
			    
			  //Page Navigation
				 WebElement pagenavigation = driver.findElement(By.name("invoiceSummaryTable_length"));
				    Select select4 = new Select(pagenavigation);
				    select4.selectByVisibleText("25");
				    Thread.sleep(1000);
				    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceSummaryTable_next")));
				    nextpage.click();
				    Thread.sleep(1500);
				    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("invoiceSummaryTable_previous")));
				    previous.click();
				    Thread.sleep(2500);
				    driver.findElement(By.xpath("(//td[@class=' download-control1 fileDownloadBtn'])[1]")).click();
	  }}
