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

public class Amexjournalentryreport {
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
	        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
	    	rememberme.click();
	    	driver.findElement(By.id("btn-login")).click();
	    	driver.manage().window().maximize();
	    	
	    	//Click BCBS 
	    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 	WebElement Reports = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Reports']")));
		 	Reports.click(); 
		 	Thread.sleep(3000);
		 	WebElement Amex = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='active']//a[contains(text(),'AMEX')]"))); 
		 	Amex.click();
		 	WebElement Journalentryreport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Journal Entry Report']"))); 
		 	Journalentryreport.click();
	Thread.sleep(2000);
	
	//Search Function
	
	WebElement Employee = driver.findElement(By.id("empId"));
	Select Employeeselect = new Select(Employee);
	Employeeselect.selectByVisibleText("Jean Llovet");
	
	WebElement Expense = driver.findElement(By.id("accountId"));
	Select Expenseselect = new Select(Expense);
	Expenseselect.selectByVisibleText("Travel (788)");
	
	WebElement Site = driver.findElement(By.id("siteId"));
	Select Siteselect = new Select(Site);
	Siteselect.selectByVisibleText("CH Admin (100)");
	
	WebElement Segment = driver.findElement(By.id("segmentId"));
	Select Segmentselect = new Select(Segment);
	Segmentselect.selectByVisibleText("Clinical Services (001)");
	
	WebElement Cost = driver.findElement(By.id("costCenterId"));
	Select Costselect = new Select(Cost);
	Costselect.selectByVisibleText("Network (0770)");
	
	WebElement Company = driver.findElement(By.id("companyId"));
	Select Companyselect = new Select(Company);
	Companyselect.selectByVisibleText("CorrectLife LLC");
	
	WebElement Month = driver.findElement(By.id("invoiceMonthList"));
	Select Monthselect = new Select(Month);
	Monthselect.selectByVisibleText("January");
	
	WebElement Year = driver.findElement(By.id("invoiceYearList"));
	Select Yearselect = new Select(Year);
	Yearselect.selectByVisibleText("2025");
	
	
	   driver.findElement(By.id("dateFrom")).click();
	    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement FROMDATE = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
	    FROMDATE.click();
	    FROMDATE.click();
	    WebElement dosselect = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='0'][data-year='2025']")));
	    dosselect.click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("dateTo")).click();
	    WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(10));
	    WebElement Todate = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
	    Todate.click();
	    WebElement Todateselect = wait2.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='1'][data-year='2025']")));
	    Todateselect.click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Clear']"));
	    Thread.sleep(1000);
	    Employeeselect.selectByVisibleText("All");
	    Expenseselect.selectByVisibleText("All");
	    Siteselect.selectByVisibleText("All");
	    Segmentselect.selectByVisibleText("All");
	    Costselect.selectByVisibleText("All");
	    Companyselect.selectByVisibleText("All");
	    Monthselect.selectByVisibleText("January");
	    Yearselect.selectByVisibleText("2025");
	    
	    driver.findElement(By.xpath("//button[normalize-space()='Journal Entry Report Download']"));
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//button[normalize-space()='Consolidated Report Download']"));
  }
}
