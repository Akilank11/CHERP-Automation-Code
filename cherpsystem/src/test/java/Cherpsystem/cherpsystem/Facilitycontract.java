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

public class Facilitycontract {
	
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

  @Test(enabled=false)
  public void Facilitycontracttest() throws InterruptedException {
      driver.get("http://localhost:8080/CHERPSystem/login");
      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
      driver.findElement(By.id("password")).sendKeys("Dev@9090");
      WebElement rememberme =driver.findElement(By.id("rememberMe1"));
  	rememberme.click();
  	driver.findElement(By.id("btn-login")).click();
  	driver.manage().window().maximize();
  	
  	//Click Facilitycontract
  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Facilitycontract = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewFacility']")));
	 	Facilitycontract.click(); 
	 	Thread.sleep(3000);
	 	WebElement Facilitycontract1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Facility Contract Details']"))); 
	 	Facilitycontract1.click();
Thread.sleep(2000);

//Search Function

WebElement Facility = driver.findElement(By.id("facilityCode"));
Select Facilityselect = new Select(Facility);
Facilityselect.selectByVisibleText("Acadia Parish Jail(182)");
WebElement Search = wait.until(ExpectedConditions.elementToBeClickable(By.id("newSearch"))); 
Search.click();
Thread.sleep(1000);
WebElement Clear = wait.until(ExpectedConditions.elementToBeClickable(By.id("clearSearch"))); 
Clear.click();

WebElement ContractStatus = driver.findElement(By.id("contract_Status"));
Select ContractStatusselect = new Select(ContractStatus);
ContractStatusselect.selectByVisibleText("New");
Search.click();
Thread.sleep(1000);
Clear.click();

WebElement FacilityStatus = driver.findElement(By.id("facilityStatus"));
Select FacilityStatusselect = new Select(FacilityStatus);
FacilityStatusselect.selectByVisibleText("Active");
Search.click();
Thread.sleep(1000);
Clear.click();

WebElement PerDiem = driver.findElement(By.id("perDiem"));
Select PerDiemselect = new Select(PerDiem);
PerDiemselect.selectByVisibleText("Yes");
Search.click();
Thread.sleep(1000);
Clear.click();

driver.findElement(By.id("dateFrom")).click();
WebElement ContractStartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[5]")));
ContractStartDate.click();
ContractStartDate.click();
WebElement ContractStartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='10'][data-year='2024']")));
ContractStartDateselect.click();
Search.click();
Thread.sleep(1000);
Clear.click();


driver.findElement(By.id("dateTo")).click();
WebElement ContractEndDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[11]")));
ContractEndDate.click();
WebElement ContractEndDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='11'][data-year='2024']")));
ContractEndDateselect.click();
Search.click();
Thread.sleep(1000);
Clear.click();

//Summary Table
WebElement Editdata = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_88']//td[contains(@class,'edit-control btnCol')]")));
Editdata.click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='button']//img")).click();
Thread.sleep(1000);
driver.findElement(By.id("saveFacilityContract")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//img[@data-placement='right']")).click();
Thread.sleep(4000);
WebElement Download = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[@id='row_88']//td[@class=' download-control fileDownloadBtn']")));
Download.click();
Thread.sleep(1000);
WebElement pagenavigation = driver.findElement(By.name("facilityContractSummaryTable_length"));
Select select = new Select(pagenavigation);
select.selectByVisibleText("70");
Thread.sleep(3000);
WebElement nextpage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facilityContractSummaryTable_next")));
nextpage.click();
Thread.sleep(5000);
WebElement previous = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facilityContractSummaryTable_previous")));
previous.click();
Thread.sleep(8000);
  
  }
  
  @Test
  public void Addnew() throws InterruptedException {
      driver.get("http://localhost:8080/CHERPSystem/login");
      driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
      driver.findElement(By.id("password")).sendKeys("Dev@9090");
      WebElement rememberme =driver.findElement(By.id("rememberMe1"));
  	rememberme.click();
  	driver.findElement(By.id("btn-login")).click();
  	driver.manage().window().maximize();
  	
  	//Click Facilitycontract
  	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 	WebElement Facilitycontract = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@href='#viewFacility']")));
	 	Facilitycontract.click(); 
	 	Thread.sleep(3000);
	 	WebElement Facilitycontract1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Facility Contract Details']"))); 
	 	Facilitycontract1.click();
Thread.sleep(2000);

//Add Facility Contract
driver.findElement(By.id("newFacilityAcc")).click();
Thread.sleep(1500);
driver.findElement(By.id("facility")).sendKeys("Facility Test");
driver.findElement(By.id("facilityAbbr")).sendKeys("Facility Abbr");
driver.findElement(By.id("title")).sendKeys("Facility Title");
driver.findElement(By.xpath("//input[@id='region1']")).click();
WebElement facilityStatus = driver.findElement(By.name("facilityStatus"));
Select facilityStatusselect = new Select(facilityStatus);
facilityStatusselect.selectByVisibleText("Active");


driver.findElement(By.id("fullName")).sendKeys("Akilan");
driver.findElement(By.id("facilityCode")).sendKeys("03");
WebElement Division = driver.findElement(By.name("division"));
Select Divisionselect = new Select(Division);
Divisionselect.selectByVisibleText("J-0000");
WebElement contractType = driver.findElement(By.name("contract_Type"));
Select contractTypeselect = new Select(contractType);
contractTypeselect.selectByVisibleText("Multi Year");
WebElement Noofyears = driver.findElement(By.name("no_of_years"));
Select Noofyearsselect = new Select(Noofyears);
Noofyearsselect.selectByVisibleText("5");
driver.findElement(By.id("contract_x0020_Historical_x0020_")).click();
WebElement FullContractstartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[8]")));
FullContractstartDate.click();
WebElement FullContractstartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='11'][data-year='2024']")));
FullContractstartDateselect.click();
Thread.sleep(500);
driver.findElement(By.id("contract_x0020_Start_x0020_Date")).click();
WebElement CurrentContractstartDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[14]")));
CurrentContractstartDate.click();
CurrentContractstartDate.click();
WebElement CurrentContractstartDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='10'][data-year='2024']")));
CurrentContractstartDateselect.click();
Thread.sleep(500);
driver.findElement(By.id("contractNo")).sendKeys("123456");
driver.findElement(By.id("annual_escalator")).sendKeys("2.54");
driver.findElement(By.xpath("//input[@id='ooc_billing1']")).click();
driver.findElement(By.xpath("//input[@id='extension1']")).click();
driver.findElement(By.id("baseIncreaseDate")).click();
//WebElement baseIncreaseDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[32]")));
//baseIncreaseDate.click();
WebElement baseIncreaseDateselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='27'][data-month='0'][data-year='2025']")));
baseIncreaseDateselect.click();
Thread.sleep(500);


driver.findElement(By.id("medicalDirectorName")).sendKeys("Acadia");
driver.findElement(By.id("email_x0020_Address")).sendKeys("akilanksa10@gmail.com");
driver.findElement(By.id("facilityMedicalPhoneNumber")).sendKeys("8489320178");
driver.findElement(By.id("payer_x0020_Name")).sendKeys("Akilan");
driver.findElement(By.id("facilityMedicalFaxNumber")).sendKeys("02145897");
driver.findElement(By.id("facilityMedicalFaxNumber")).sendKeys("2/340d dsp nagar 2nd street, Mannarai(Post), Tirupur");
driver.findElement(By.id("billing_Attn")).sendKeys("IND012");
driver.findElement(By.id("tpa_x0020_Name")).sendKeys("TPA Test");
driver.findElement(By.id("remit_x0020_Payment_x0020_To")).sendKeys("Akilan");
driver.findElement(By.xpath("//input[@id='bcbs1']")).click();
WebElement TPAPayer = driver.findElement(By.name("tpa_x0020_Payer"));
Select TPAPayerselect = new Select(TPAPayer);
TPAPayerselect.selectByVisibleText("Facility");
driver.findElement(By.id("min_x0020_Population")).sendKeys("10");
driver.findElement(By.id("max_x0020_Population")).sendKeys("100");
driver.findElement(By.id("ein")).sendKeys("256");
driver.findElement(By.id("catastrophicAmt")).sendKeys("1.25");
driver.findElement(By.xpath("//input[@id='county_x002d_Run_x0020_State_x001']")).click();
WebElement Catastrophic = driver.findElement(By.name("catastrophic_x0020_Insurance_x00"));
Select Catastrophicselect = new Select(Catastrophic);
Catastrophicselect.selectByVisibleText("Contract");
Thread.sleep(500);
driver.findElement(By.id("bcbs_Effective_date")).click();
WebElement BCBSEffectiveDate = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@type='button'])[40]")));
BCBSEffectiveDate.click();
WebElement BCBSEffectiveDateeselect = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("td[data-date='17'][data-month='1'][data-year='2025']")));
BCBSEffectiveDateeselect.click();
Thread.sleep(500);


driver.findElement(By.xpath("//input[@value='CAP']")).click();
WebElement Claims = driver.findElement(By.name("claimProcessing"));
Select Claimsselect = new Select(Claims);
Claimsselect.selectByVisibleText("Reprice Only");
driver.findElement(By.xpath("//input[@id='specialtyCare3']")).click();
driver.findElement(By.xpath("//input[@id='preincarceration1']")).click();
driver.findElement(By.xpath("//input[@id='ems_x002d_Ambulance2']")).click();
driver.findElement(By.xpath("//input[@id='dental3']")).click();
driver.findElement(By.xpath("//input[@id='ultrasound1']")).click();
driver.findElement(By.xpath("//input[@id='xray1']")).click();
driver.findElement(By.xpath("//input[@id='lab1']")).click();
driver.findElement(By.xpath("//input[@id='medicalSupplies1']")).click();
driver.findElement(By.xpath("//input[@id='officeSupplies1']")).click();
driver.findElement(By.xpath("//input[@id='biohazard1']")).click();
driver.findElement(By.xpath("//input[@id='pharmacy1']")).click();
driver.findElement(By.id("pharmacyCapAmt")).sendKeys("1.15");
driver.findElement(By.xpath("//input[@id='pharmacyCAP1']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP2']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP3']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP4']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP5']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP6']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP7']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP8']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP9']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP10']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP11']")).click();
driver.findElement(By.xpath("//input[@id='pharmacyCAP12']")).click();

driver.findElement(By.id("monthly_x0020_Base")).sendKeys("2");
driver.findElement(By.id("annual_x0020_Base_x0020_Amount")).sendKeys("20");
driver.findElement(By.id("monthly_x0020_Base_x0020_Type1")).click();
driver.findElement(By.id("mdp")).sendKeys("10");
driver.findElement(By.id("pipd")).sendKeys("15");
WebElement BillMonthly = driver.findElement(By.name("bill_x0020_Monthly_x0020_Base_x0"));
Select BillMonthlyselect = new Select(BillMonthly);
BillMonthlyselect.selectByVisibleText("0-Previous Month");
driver.findElement(By.id("annualCapAmt")).sendKeys("20.65");
driver.findElement(By.id("monthlyCapAmt")).sendKeys("210.65");
driver.findElement(By.xpath("//input[@id='monthlyCap']")).click();
driver.findElement(By.id("cap_x0020_Reimbursement_x0020_Ra")).sendKeys("15.64");
driver.findElement(By.id("mortalityReviewRate")).sendKeys("10.12");
driver.findElement(By.xpath("//input[@id='underCapCreditToFacility1']")).click();
driver.findElement(By.id("perDiem1")).click();
driver.findElement(By.xpath("//input[@id='calcUnderage']")).click();
driver.findElement(By.xpath("//input[@id='calcOverage']")).click();
driver.findElement(By.xpath("//input[@id='calcRangeOverage']")).click();
driver.findElement(By.id("perDiem_x0020_Max_x0020_1")).sendKeys("1");
driver.findElement(By.id("perDiem_x0020_Max_x0020_2")).sendKeys("2");
driver.findElement(By.id("perDiem_x0020_Max_x0020_3")).sendKeys("3");
driver.findElement(By.id("perDiem_x0020_Max_x0020_4")).sendKeys("4");
driver.findElement(By.id("perDiem_x0020_Rate_x0020_1")).clear();
driver.findElement(By.id("perDiem_x0020_Rate_x0020_1")).sendKeys("10.1");
driver.findElement(By.id("perDiem_x0020_Rate_x0020_2")).clear();
driver.findElement(By.id("perDiem_x0020_Rate_x0020_2")).sendKeys("10.2");
driver.findElement(By.id("perDiem_x0020_Rate_x0020_3")).clear();
driver.findElement(By.id("perDiem_x0020_Rate_x0020_3")).sendKeys("10.3");
driver.findElement(By.id("perDiem_x0020_Rate_x0020_4")).clear();
driver.findElement(By.id("perDiem_x0020_Rate_x0020_4")).sendKeys("10.4");
driver.findElement(By.id("perDiemRebate1")).clear();
driver.findElement(By.id("perDiemRebate1")).sendKeys("11.4");
driver.findElement(By.id("perDiemRebateRate1")).clear();
driver.findElement(By.id("perDiemRebateRate1")).sendKeys("12.4");
driver.findElement(By.id("x0033_rd_x0020_Party_x0020_Repr1")).click();
driver.findElement(By.id("billable_x0020_Staff_x0020_Time1")).click();
driver.findElement(By.id("staff_x0020_Hourly_x0020_Rate")).clear();
driver.findElement(By.id("staff_x0020_Hourly_x0020_Rate")).sendKeys("9.04");
driver.findElement(By.id("clinicalHours")).clear();
driver.findElement(By.id("clinicalHours")).sendKeys("9.05");
driver.findElement(By.id("staff_x0020_Forensics_x0020_Rate")).clear();
driver.findElement(By.id("staff_x0020_Forensics_x0020_Rate")).sendKeys("9.06");
driver.findElement(By.id("staff_x0020_On_x002d_Call_x0020_")).clear();
driver.findElement(By.id("staff_x0020_On_x002d_Call_x0020_")).sendKeys("9.07");
driver.findElement(By.id("onCallHours")).clear();
driver.findElement(By.id("onCallHours")).sendKeys("9.08");
driver.findElement(By.id("serviceFee")).clear();
driver.findElement(By.id("serviceFee")).sendKeys("9.28");
driver.findElement(By.xpath("//input[@id='serviceFeeType1']")).click();
driver.findElement(By.xpath("//input[@id='serviceFeeType2']")).click();
driver.findElement(By.xpath("//input[@id='serviceFeeType3']")).click();
driver.findElement(By.xpath("//input[@id='serviceFeeType4']")).click();
driver.findElement(By.xpath("//input[@id='serviceFeeType5']")).click();
driver.findElement(By.xpath("//input[@id='serviceFeeType6']")).click();
driver.findElement(By.id("pre_x002d_Inc_x0020_Claims_x00201")).click();
driver.findElement(By.id("lateFee1")).click();
driver.findElement(By.id("lateFee1")).sendKeys("15");
driver.findElement(By.id("mealAllowance")).clear();
driver.findElement(By.id("mealAllowance")).sendKeys("9.28");
driver.findElement(By.id("comments")).sendKeys("For Testing Purpose");
driver.findElement(By.id("saveFacilityContract")).click();


}
  
}