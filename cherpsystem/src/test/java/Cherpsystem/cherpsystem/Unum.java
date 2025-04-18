package Cherpsystem.cherpsystem;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Unum { 
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
        driver.findElement(By.id("password")).sendKeys("Dev@8080");
        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
    	rememberme.click();
    	driver.findElement(By.id("btn-login")).click();
    	driver.manage().window().maximize();
    	
    	//Click UNUM'
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement unum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='UNUM']")));
	 	unum.click(); 
	 	Thread.sleep(3000);
	 	WebElement unumstatement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='UNUM Statement']"))); 
	 	unumstatement.click();
Thread.sleep(2000);

//Select Company
WebElement company = driver.findElement(By.id("companyCode"));
Select companyselect = new Select(company);
companyselect.selectByVisibleText("CorrectHealth LLC");
WebElement search = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("newSearch")));
search.click(); 
WebElement clear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='clearSearch']")));
clear.click(); 

//Select Issue From Date
driver.findElement(By.id("dateFrom")).click();
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement Issuefromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[6]")));
Issuefromdate.click();
WebElement issuedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='10'][data-year='2024']")));
issuedateselect.click();
search.click(); 
clear.click();

//Select Issue To Date
driver.findElement(By.id("dateTo")).click();
//WebElement Issuetodate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[12]")));
//Issuetodate.click();
WebElement Issuetodateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='1'][data-month='11'][data-year='2024']")));
Issuetodateselect.click();
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
	
        driver.get("http://localhost:8080/CHERPSystem/login");
        driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Dev@8080");
        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
    	rememberme.click();
    	driver.findElement(By.id("btn-login")).click();
    	driver.manage().window().maximize();
    	
    	//Click UNUM'
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement unum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='UNUM']")));
	 	unum.click(); 
	 	Thread.sleep(3000);
	 	WebElement unumstatement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='UNUM Statement']"))); 
	 	unumstatement.click();
Thread.sleep(2000);

//create unum statement
driver.findElement(By.id("createUnumStatement")).click();
//company select
//Correcthealth file
WebElement company = driver.findElement(By.id("companyCode"));
Select companyselect = new Select(company);
companyselect.selectByVisibleText("CorrectHealth LLC");
//issue date select
driver.findElement(By.id("issueDate")).click();
WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement Issuefromdate = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
Issuefromdate.click();
WebElement issuedateselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='10'][data-year='2024']")));
issuedateselect.click();
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
//Generate Unum reports
driver.findElement(By.id("saveMaster")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
driver.findElement(By.xpath("//img[@data-placement='right']")).click();
Thread.sleep(2000);

//company select
//Correctlifebostick file
driver.findElement(By.id("createUnumStatement")).click();
WebElement company1 = driver.findElement(By.id("companyCode"));
Select companyselect1 = new Select(company1);
companyselect1.selectByVisibleText("CorrectLife Bostick LLC");
//issue date select
driver.findElement(By.id("issueDate")).click();
WebElement Issuefromdate1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
Issuefromdate1.click();
WebElement issuedateselect1 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='10'][data-year='2024']")));
issuedateselect1.click();
//upload documents
WebElement fileInput1 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
File fileToUpload1 = new File("C:\\Users\\panini019\\Desktop\\Nov\\CL_Consolidated_excel.xlsx"); // Update with the path to your PNG file
fileInput1.sendKeys(fileToUpload1.getAbsolutePath());
//select file type
WebElement filetype1 = driver.findElement(By.id("fileType"));
Select filetypeselect1 = new Select(filetype1);
filetypeselect1.selectByVisibleText("Invoice Excel");
driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
Thread.sleep(2000);
//Generate Unum reports
driver.findElement(By.id("saveMaster")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
driver.findElement(By.xpath("//img[@data-placement='right']")).click();
Thread.sleep(2000);


//company select
//Triage Holding lnc file
driver.findElement(By.id("createUnumStatement")).click();
WebElement company2 = driver.findElement(By.id("companyCode"));
Select companyselect2 = new Select(company2);
companyselect2.selectByVisibleText("Triage Holding Inc");
//issue date select
driver.findElement(By.id("issueDate")).click();
WebElement Issuefromdate2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[10]")));
Issuefromdate2.click();
WebElement issuedateselect2 = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='19'][data-month='10'][data-year='2024']")));
issuedateselect2.click();
//upload documents
WebElement fileInput2 = wait1.until(ExpectedConditions.presenceOfElementLocated(By.id("masterDocFiles1")));
File fileToUpload2 = new File("C:\\Users\\panini019\\Desktop\\Nov\\TL_Conslidated_excel.xlsx"); // Update with the path to your PNG file
fileInput2.sendKeys(fileToUpload2.getAbsolutePath());
//select file type
WebElement filetype2 = driver.findElement(By.id("fileType"));
Select filetypeselect2 = new Select(filetype2);
filetypeselect2.selectByVisibleText("Invoice Excel");
driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
Thread.sleep(2000);
//Generate Unum reports
driver.findElement(By.id("saveMaster")).click();
Thread.sleep(15000);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
driver.findElement(By.xpath("//img[@data-placement='right']")).click();
Thread.sleep(2000);

}
@Test
public void editunum() throws InterruptedException
{
	 driver.get("http://localhost:8080/CHERPSystem/login");
     driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
     driver.findElement(By.id("password")).sendKeys("Dev@8080");
     WebElement rememberme =driver.findElement(By.id("rememberMe1"));
 	rememberme.click();
 	driver.findElement(By.id("btn-login")).click();
 	driver.manage().window().maximize();
 	
 	//Click UNUM'
 	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement unum = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='UNUM']")));
	 	unum.click(); 
	 	Thread.sleep(3000);
	 	WebElement unumstatement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='UNUM Statement']"))); 
	 	unumstatement.click();
Thread.sleep(2000);

//Edit Unum (Summary Table Function)
driver.findElement(By.xpath("//tr[@id='row_86']//td[contains(@class,'download-control1 fileDownloadBtn')]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//tr[@id='row_86']//td[contains(@class,'download-control2 fileDownloadBtn')]")).click();
Thread.sleep(6000);
//Change status
WebElement status = driver.findElement(By.xpath("//tr[@id='row_86']//select[@id='status']"));
Select statusselect = new Select(status);
statusselect.selectByVisibleText("Processed");
Thread.sleep(1000);
driver.findElement(By.id("setstatus")).click();
Thread.sleep(2500);
driver.findElement(By.xpath("//tr[@id='row_86']//td[@class=' delete-control fileDeleteBtn']")).click();
driver.findElement(By.xpath("//button[normalize-space()='cancel']")).click();

//Edit Unum
Thread.sleep(1000);
driver.findElement(By.id("//tr[@id='row_86']//td[@class=' edit-control btnCol']")).click();
Thread.sleep(2000);
WebElement statusedit = driver.findElement(By.xpath("status"));
Select editstatusselect = new Select(statusedit);
editstatusselect.selectByVisibleText("Processed");
Thread.sleep(1500);
driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
driver.findElement(By.xpath("//td[contains(@class,'delete-control fileDeleteBtn2')]")).click();
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
//Generate Unum reports
driver.findElement(By.id("saveMaster")).click();
Thread.sleep(15000);

//File Download
WebElement downloadgpimport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Download GP Import Report']"))); 
downloadgpimport.click(); Thread.sleep(2000);

WebElement downloadsummaryreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//b[contains(text(),'Download Summary Report')])[1]"))); 
downloadsummaryreport.click(); Thread.sleep(2000);

WebElement DownloadFacilityWiseReport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//b[normalize-space()='Download Facility-Wise Report']"))); 
DownloadFacilityWiseReport.click(); Thread.sleep(2000);

WebElement DownloadTalliedReport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//b[contains(text(),'Download Tallied Report')])[1]"))); 
DownloadTalliedReport.click(); Thread.sleep(2000);

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

    
    
