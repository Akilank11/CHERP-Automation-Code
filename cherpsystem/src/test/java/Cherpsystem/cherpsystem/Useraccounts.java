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

public class Useraccounts {
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
  	
  //Click User ACOCUNTS
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
 	WebElement Admin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Admin']")));
 	Admin.click(); 
 	Thread.sleep(2000);
 	WebElement Useraccounts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='User Accounts']"))); 
 	Useraccounts.click();
Thread.sleep(2000);

//Search and Clear Function
//Username
driver.findElement(By.id("adminName")).sendKeys("Akilan");
WebElement Search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
Search.click(); 
	Thread.sleep(1000);
	WebElement Clear = wait.until(ExpectedConditions.elementToBeClickable(By.id("clearSearch"))); 
	Clear.click();
	
	//Select User Type
	WebElement Usertype = driver.findElement(By.id("usertype"));
	Select Usertypeselect = new Select(Usertype);
	Usertypeselect.selectByVisibleText("Admin");
	Search.click();
	Thread.sleep(1000);
	Clear.click();
	
	//Select Department	
	WebElement Department = driver.findElement(By.id("departmentId"));
	Select Departmentselect = new Select(Department);
	Departmentselect.selectByVisibleText("Clinical Programs");
	Search.click();
	Thread.sleep(1000);
	Clear.click();
	
	//Select Vendor or Supervisor	
		//WebElement Vendor = driver.findElement(By.id("vendorsupervisor"));
		//Select Vendorselect = new Select(Vendor);
		//Vendorselect.selectByVisibleText("Vendor");
		//Search.click();
		//Thread.sleep(1000);
		//Clear.click();
		
		//Select Status	
				WebElement Status = driver.findElement(By.id("status"));
				Select Statusselect = new Select(Status);
				Statusselect.selectByVisibleText("Active");
				Search.click();
				Thread.sleep(1000);
				Clear.click();
	
//Sorting and Edit
				driver.findElement(By.xpath("//th[@aria-label='Name: activate to sort column ascending']")).click();
				Thread.sleep(1000);
				Clear.click();
				Thread.sleep(1000);
				WebElement Edit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@class=' edit-control'])[1]")));
				Edit.click(); 
				Thread.sleep(1000);
			//Edit page	
				driver.findElement(By.id("unumStatementCreation1")).click();
				driver.findElement(By.id("zoomMeetings1")).click();
				driver.findElement(By.id("workedHoursReport1")).click();
				driver.findElement(By.id("ewcInvoiceAndVarianceReport1")).click();
				driver.findElement(By.id("unumreports1")).click();
				driver.findElement(By.xpath("//button[normalize-space()='Save']")).click();
				Thread.sleep(1500);
				driver.findElement(By.xpath("(//img[@class='img-responsive goSummary'])[1]")).click();
				Thread.sleep(1500);
				//Page navigation
				   
			    
			    WebElement pagenavigation = driver.findElement(By.name("summaryTable_length"));
			    Select select4 = new Select(pagenavigation);
			    select4.selectByVisibleText("25");
			    Thread.sleep(3000);
			    WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("summaryTable_next")));
			    nextpage.click();
			    Thread.sleep(5000);
			    WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("summaryTable_previous")));
			    previous.click();
			    Thread.sleep(8000);
  }
				
/// Create New User Account
				@Test 
				  public void Createuser() throws InterruptedException {
				      driver.get("http://localhost:8080/CHERPSystem/login");
				      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
				      driver.findElement(By.id("password")).sendKeys("Dev@9090");
				      //WebElement rememberme =driver.findElement(By.id("rememberMe1"));
				  	// rememberme.click();
				  	driver.findElement(By.id("btn-login")).click();
				  	driver.manage().window().maximize();
				  	
				  //Click User ACOCUNTS
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				 	WebElement Admin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Admin']")));
				 	Admin.click(); 
				 	Thread.sleep(2000);
				 	WebElement Useraccounts = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='User Accounts']"))); 
				 	Useraccounts.click();
				Thread.sleep(2000);
				driver.findElement(By.id("newAdminAcc")).click();
				Thread.sleep(1500);
				WebElement Status = driver.findElement(By.id("status"));
				Select Statusselect = new Select(Status);
				Statusselect.selectByVisibleText("Active");
				Thread.sleep(500);
				WebElement Company = driver.findElement(By.id("companyId"));
				Select Companyselect = new Select(Company);
				Companyselect.selectByVisibleText("Triage Holding Inc (THI)");
				Thread.sleep(500);
				driver.findElement(By.id("employeeNo")).sendKeys("0131");
				driver.findElement(By.id("vendorNo")).sendKeys("01981");
				driver.findElement(By.id("firstName")).sendKeys("Akilan");
				driver.findElement(By.id("middleName")).sendKeys("K");
				driver.findElement(By.id("lastName")).sendKeys("Krishnadas");
				WebElement Department = driver.findElement(By.id("departmentId"));
				Select Departmentselect = new Select(Department);
				Departmentselect.selectByVisibleText("Clinical Programs");
				Thread.sleep(500);
				driver.findElement(By.id("designation")).sendKeys("Tester");
				WebElement Usertype = driver.findElement(By.id("type"));
				Select Usertypeselect = new Select(Usertype);
				Usertypeselect.selectByVisibleText("Admin");
				driver.findElement(By.id("cardMemberName")).sendKeys("Akilan K");
				driver.findElement(By.id("designation")).sendKeys("Tester");
				WebElement Vendor = driver.findElement(By.id("vendor"));
				Select Vendorselect = new Select(Vendor);
				Vendorselect.selectByVisibleText("No");
				WebElement supervisor = driver.findElement(By.id("supervisor"));
				Select supervisorselect = new Select(supervisor);
				supervisorselect.selectByVisibleText("Yes");
				
				WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
				WebElement fileInput = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
				File fileToUpload = new File("C:\\Users\\panini019\\Pictures\\Screenshots\\1st Bug.png"); // Update with the path to your PNG file
				fileInput.sendKeys(fileToUpload.getAbsolutePath());
				 Thread.sleep(1000);
				 driver.findElement(By.id("email")).sendKeys("akilanksa100@gmail.com");
				 driver.findElement(By.id("mobile")).sendKeys("8489320178");
				 WebElement Signature = wait2.until(ExpectedConditions.presenceOfElementLocated(By.id("file")));
					File SignatureUpload = new File("C:\\Users\\panini019\\Pictures\\Screenshots\\1st Bug.png"); // Update with the path to your PNG file
					Signature.sendKeys(SignatureUpload.getAbsolutePath());
					driver.findElement(By.id("savesignature")).click();
					 Thread.sleep(1000);
					 driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
					 Thread.sleep(500);
					 
					 //Permission
					 driver.findElement(By.id("adminAccCreation1")).click();
					 driver.findElement(By.id("reimbursementCreation1")).click();
					 driver.findElement(By.id("amexCreation1")).click();
					 driver.findElement(By.id("facilityCreation1")).click();
					 driver.findElement(By.id("mbPDInvoiceCreation1")).click();
					 driver.findElement(By.id("pharmacyStatementCreation1")).click();
					 driver.findElement(By.id("cignaStatementCreation1")).click();
					 driver.findElement(By.id("unumStatementCreation1")).click();
					 driver.findElement(By.id("bcbsStatementCreation1")).click();
					 driver.findElement(By.id("ptoAccrualCreation1")).click();
					 driver.findElement(By.id("zoomMeetings1")).click();
					 driver.findElement(By.id("agencyStaffing1")).click();
					 driver.findElement(By.id("agencyStaffingReports1")).click();
					 driver.findElement(By.id("workedHoursReport1")).click();
					 driver.findElement(By.id("agencyStaffingInvoiceReports1")).click();
					 driver.findElement(By.id("ewcInvoiceAndVarianceReport1")).click();
					 driver.findElement(By.id("amexreports1")).click();
					 driver.findElement(By.id("cignareports1")).click();
					 driver.findElement(By.id("unumreports1")).click();
					 driver.findElement(By.id("cobrareports1")).click();
					 driver.findElement(By.id("aflacreports1")).click();
					 driver.findElement(By.id("bcbsreports1")).click();
					 driver.findElement(By.id("invoicereports1")).click();
					 driver.findElement(By.id("pharmacyreports1")).click();
					 driver.findElement(By.id("atlanticDentalBills1")).click();
					 driver.findElement(By.id("dentalBills1")).click();
					 driver.findElement(By.id("stephenMitchellBills1")).click();
					 driver.findElement(By.id("expenseCards1")).click();
					 driver.findElement(By.id("expenseCardsAdminPrivilege1")).click();
					 driver.findElement(By.id("snuinvoices1")).click();
					 driver.findElement(By.id("tbnjinvoices1")).click();
					 driver.findElement(By.id("quarterlyReports1")).click();
					 driver.findElement(By.id("savebtn1")).click();
					 
				}} 