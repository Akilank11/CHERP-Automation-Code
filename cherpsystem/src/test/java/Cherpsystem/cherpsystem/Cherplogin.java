package Cherpsystem.cherpsystem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cherplogin {WebDriver driver;
FirefoxOptions firefoxoptions = new FirefoxOptions();
ChromeOptions chromeoptions = new ChromeOptions();
EdgeOptions edgeoptions = new EdgeOptions();

@Parameters("browser")
@BeforeTest

public void initialize(String browser) 

{
	 if (browser.equalsIgnoreCase("chrome")) {
          
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
           
            driver = new EdgeDriver();
        }
        driver.manage().window().maximize();
    }

    @Test
    public void loginTest() {
        driver.get("http://localhost:8080/CHERPSystem/login");
        driver.findElement(By.id("userName")).sendKeys("superadmin@gmail.com");
        driver.findElement(By.id("password")).sendKeys("Dev@8080");
        WebElement rememberme =driver.findElement(By.id("rememberMe1"));
    	rememberme.click();
    	driver.findElement(By.id("btn-login")).click();
       
    }

    
        
    
}
