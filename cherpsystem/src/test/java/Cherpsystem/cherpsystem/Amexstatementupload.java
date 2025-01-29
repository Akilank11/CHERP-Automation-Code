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

public class Amexstatementupload {
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
	  	
	  //Click User ACOCUNTS
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Amex = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#expenseTran']")));
	 	Amex.click(); 
	 	Thread.sleep(2000);
	 	WebElement amexstatementupload = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='AMEX Statement Upload']"))); 
	 	amexstatementupload.click();
	Thread.sleep(2000);
	
	//Search Function
	driver.findElement(By.id("dateFrom")).click();
    WebElement fromdate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[2]/div[1]/div[1]/button[1]")));
    fromdate.click();
    WebElement fromdateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='11'][data-year='2024']")));
    fromdateselect.click();
    Thread.sleep(1000);
    driver.findElement(By.id("Search")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("Reset")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.id("dateTo")).click();
    WebElement Todate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/button[1]")));
    Todate.click();
    Todate.click();
    WebElement todateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='10'][data-year='2024']")));
    todateselect.click();
    Thread.sleep(1000);
    driver.findElement(By.id("Search")).click();
    Thread.sleep(1500);
    driver.findElement(By.id("Reset")).click();
    Thread.sleep(2000);
    
    //Upload Amex Statement
    driver.findElement(By.id("dateFrom")).click();
    WebElement fromdate1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/div[2]/div[1]/div[1]/button[1]")));
    fromdate1.click();
    fromdate1.click();
    fromdate1.click();
    WebElement fromdateselect1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='9'][data-year='2024']")));
    fromdateselect1.click();
    Thread.sleep(1000);
    
    driver.findElement(By.id("dateTo")).click();
    WebElement Todate1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/button[1]")));
    Todate1.click();
    Todate1.click();
    WebElement todateselect1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='11'][data-month='10'][data-year='2024']")));
    todateselect1.click();
    Thread.sleep(1000);
    
    WebElement fileInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("docFiles")));
	File fileToUpload = new File("C:\\Users\\panini019\\Desktop\\UNUM File\\Dec\\CL_UNUM_December_2024.xlsx"); // Update with the path to your PNG file
	fileInput.sendKeys(fileToUpload.getAbsolutePath());
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[normalize-space()='Upload File']")).click();
	 Thread.sleep(1000);
	 driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
	 Thread.sleep(2000);
	 
	 //Table Function
	 WebElement Status = driver.findElement(By.xpath("(//select[@id='status'])[2]"));
		Select Statusselect = new Select(Status);
		Statusselect.selectByVisibleText("Completed");
		 Thread.sleep(500);
		 driver.findElement(By.xpath("(//td[@class=' save-control fileSaveBtn'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//button[normalize-space()='ok']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//td[@class=' delete-control fileDeleteBtn'])[1]")).click();
		 Thread.sleep(500);
		 driver.findElement(By.xpath("//button[normalize-space()='confirm']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//button[@id='CreateGPImportBtn'])[2]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//td[contains(@class,'edit-control btnCol')])[2]")).click();
		 Thread.sleep(3000);
		 
}}