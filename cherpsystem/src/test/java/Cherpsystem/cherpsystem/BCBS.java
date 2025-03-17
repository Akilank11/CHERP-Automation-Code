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

public class BCBS {
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
	        driver.findElement(By.id("password")).sendKeys("Dev@8080");
	        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	    	rememberme.click();
	    	driver.findElement(By.id("btn-login")).click();
	    	driver.manage().window().maximize();
	    	
	    	//Click BCBS 
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement BCBS = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='#viewBcbs'][normalize-space()='BCBS Vision and Anthem Life'])[1]")));
		 	BCBS.click(); 
		 	Thread.sleep(3000);
		 	WebElement BCBSinvoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/CHERPSystem/bcbs/bcbsStatementSummary']"))); 
		 	BCBSinvoice.click();
	Thread.sleep(2000);

	
 //Select BilledDateselect
	WebElement billeddate = driver.findElement(By.id("dateType"));
	Select billeddateselect = new Select(billeddate);
	billeddateselect.selectByVisibleText("Billed Date");
	
	driver.findElement(By.id("dateFrom")).click();
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement Fromdate	 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]")));
	Fromdate.click();
	WebElement Fromdateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='1'][data-year='2025']")));
	Fromdateselect.click();
	WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
	search.click(); 
	WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("clearSearch")));
	clear.click(); 

	//Select PaymentDueDate
	driver.findElement(By.id("dateTo")).click();
	WebElement todate	 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[12]")));
	todate.click();
	todate.click();
	WebElement todateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1'][data-month='0'][data-year='2025']")));
	todateselect.click();
	search.click(); 
	clear.click();
	
	driver.findElement(By.id("invoiceNumber")).sendKeys("9594064H");
	search.click(); 
	clear.click();

	//Select Month
	WebElement month = driver.findElement(By.id("month"));
	Select monthselect = new Select(month);
	monthselect.selectByVisibleText("January");
	search.click(); 
	clear.click(); 

	//Select Year
	WebElement year = driver.findElement(By.id("year"));
	Select yearelect = new Select(year);
	yearelect.selectByVisibleText("2024");
	search.click(); 
	clear.click(); 

	//Select Status
	WebElement Status = driver.findElement(By.id("status"));
	Select statuselect = new Select(Status);
	statuselect.selectByVisibleText("New");
	search.click(); 
	clear.click(); 
	    }

	@Test (enabled=false)
	public void createunum() throws InterruptedException 
	{
		
	        driver.get("http://localhost:8090/CHERPSystem/login");
	        driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	        driver.findElement(By.id("password")).sendKeys("Dev@8080");
	        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	    	rememberme.click();
	    	driver.findElement(By.id("btn-login")).click();
	    	driver.manage().window().maximize();
	    	
	    	//Click BCBS 
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement BCBS = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='#viewBcbs'][normalize-space()='BCBS Vision and Anthem Life'])[1]")));
		 	BCBS.click(); 
		 	Thread.sleep(3000);
		 	WebElement BCBSinvoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/CHERPSystem/bcbs/bcbsStatementSummary']"))); 
		 	BCBSinvoice.click();
	Thread.sleep(2000);

	//create unum statement
	driver.findElement(By.id("createAflacInvoice")).click();
	
	WebElement Company = driver.findElement(By.id("bcbsCompanyId"));
	Select Companyselect = new Select(Company);
	Companyselect.selectByVisibleText("BCBS Vision");
	
	//issue date select
	driver.findElement(By.id("billedDate")).click();
	WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement BilledDate	 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]")));
	BilledDate.click();
	WebElement BilledDateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='1'][data-year='2025']")));
	BilledDateselect.click();
Thread.sleep(2000);
driver.findElement(By.id("gpBatchId")).sendKeys("250123");

	//upload documents
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
	File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\Nov\\CH_consolidated_excel.xlsx"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	
	
	
	
	//select file type
	WebElement filetype = driver.findElement(By.id("fileType"));
	Select filetypeselect = new Select(filetype);
	filetypeselect.selectByVisibleText("Invoice Excel");
	
	
	driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
	Thread.sleep(2000);
	
	//Generate Aflac reports
	driver.findElement(By.id("saveMaster")).click();
	Thread.sleep(15000);
	driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	driver.findElement(By.xpath("//img[@data-placement='right']")).click();
	Thread.sleep(2000);




	}
	@Test
	public void editunum() throws InterruptedException
	{
		 driver.get("http://localhost:8090/CHERPSystem/login");
	     driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
	     driver.findElement(By.id("password")).sendKeys("Dev@9090");
	     WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	 	rememberme.click();
	 	driver.findElement(By.id("btn-login")).click();
	 	driver.manage().window().maximize();
	 	
	 	//Click BCBS 
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement BCBS = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='#viewBcbs'][normalize-space()='BCBS Vision and Anthem Life'])[1]")));
	 	BCBS.click(); 
	 	Thread.sleep(3000);
	 	WebElement BCBSinvoice = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/CHERPSystem/bcbs/bcbsStatementSummary']"))); 
	 	BCBSinvoice.click();
Thread.sleep(2000);

//Edit Aflac (Summary Table Function)
	driver.findElement(By.xpath("(//td[@class=' download-control1 fileDownloadBtn'])[1]")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//td[contains(@class,'download-control2 fileDownloadBtn')])[1]")).click();
	Thread.sleep(6000);
	
	//Change status
	WebElement status = driver.findElement(By.xpath("(//select[@id='status'])[2]"));
	Select statusselect = new Select(status);
	statusselect.selectByVisibleText("Processed");
	Thread.sleep(1000);
	driver.findElement(By.id("setstatus")).click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("(//td[@class=' delete-control fileDeleteBtn'])[1]")).click();
	driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();

	//Edit BCBS 
	Thread.sleep(1000);
	driver.findElement(By.id("(//td[contains(@class,'edit-control btnCol')])[1]")).click();
	Thread.sleep(2000);
	
	//upload documents
	WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
	File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\Nov\\CH_consolidated_excel.xlsx"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	//select file type
	WebElement Company = driver.findElement(By.id("bcbsCompanyId"));
	Select Companyselect = new Select(Company);
	Companyselect.selectByVisibleText("BCBS Vision");
	
	
	//select file type
	WebElement filetype = driver.findElement(By.id("fileType"));
	Select filetypeselect = new Select(filetype);
	filetypeselect.selectByVisibleText("Invoice Excel");
	
	
	
	driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
	Thread.sleep(2000);
	//Generate Unum reports
	driver.findElement(By.id("saveMaster")).click();
	Thread.sleep(15000);

	//File Download
	WebElement downloadgpimport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Download GP Import Report']"))); 
	downloadgpimport.click(); Thread.sleep(2000);

	WebElement downloadsummaryreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Download Summary Report']"))); 
	downloadsummaryreport.click(); Thread.sleep(2000);
	
	WebElement downloadcombinedreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Download Combined Invoice Report']"))); 
	downloadcombinedreport.click(); Thread.sleep(2000);
	
	WebElement downloadfacilityreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Download Facility-Wise Report']"))); 
	downloadfacilityreport.click(); Thread.sleep(2000);
	
	
	driver.findElement(By.xpath("//button[normalize-space()='Send CorrectLife Invoice']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();

	driver.findElement(By.xpath("//img[@data-placement='right']")).click();
	Thread.sleep(3000);
	
	
	//Page Navigation
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

	}
	}

	    
	    
