package Testng1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

public class testng1 {


	   WebDriver driver;
	   String browser= "chrome";
	  
	  //customers
	   
	  By usernameField= By.xpath("//input[@id='username']");
	  By passwordField=By.xpath("//input[@type='password']");
	  By loginField=By.xpath("//button[@type='submit']");
	  By dashboardField=By.xpath("//h2[contains(text(),'Dashboard')]");
	  
	  By customerFiled=By.xpath("//span[contains(text(),'Customers')]");
	By addcustomerField=By.xpath("//a[contains(text(),'Add Customer')]");

	By fullnameField=By.xpath("//input [@ id='account']");
	
	By companydropdwnField= By.xpath("//*[@id=\"cid\"]");
	By emailField=By.xpath("//input[@id='email']");
	By phoneField=By.xpath("//input[@id='phone']");
	By addressField=By.xpath("//input[@id='address']");
	By cityField=By.xpath("//input[@id='city']");
	By stateField=By.xpath("//input[@id='state'and @name='state']");
	By zipField=By.xpath("//input[@id='zip'and @name='zip']");
	By groupdropdwnField=By.xpath("//*[@id=\"group\"]");
	By passField=By.xpath("//input[@id='password']");
	By confirmpassField=By.xpath("//input[@id='cpassword']");
	By welcomeemailField=By.xpath("//label[@class='btn btn-primary btn-sm toggle-on'");
By submitField=By.xpath("//button[@id='submit'and @type='submit']");

@BeforeTest
	public  void init() throws InterruptedException {
		
		if(browser.equalsIgnoreCase("Firefox"))
				{System.setProperty("webdriver.gecko.driver", "geckodriver\\geckodriver.exe");
		driver= new FirefoxDriver();}
		else if(browser.equalsIgnoreCase("chrome")) {System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver= new ChromeDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get("https://www.techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(usernameField).sendKeys("demo@techfios.com");
		driver.findElement(passwordField).sendKeys("abc123");
		driver.findElement(loginField).click();
		//Assert.assertEquals("page not found", "Dashboard- iBilling", driver.getTitle());
	
		Thread.sleep(1000);
		
	}
	@AfterTest
	public void adddetails() throws InterruptedException {
	Assert.assertEquals("Dashboard", driver.findElement(dashboardField).getText());
	driver.findElement(customerFiled).click();
	driver.findElement(addcustomerField).click();
	driver.findElement(fullnameField).sendKeys("Tom"+Random(888));
	driver.findElement(addressField).sendKeys("frisco");
	driver.findElement(cityField).sendKeys("frisco");
	driver.findElement(passField).sendKeys("abc123");
	driver.findElement(confirmpassField).sendKeys("abc123");
	driver.findElement(emailField).sendKeys(Random(88)+"heiwh@gmail.com");
	driver.findElement(phoneField).sendKeys("Random(888)+1654465");
	driver.findElement(stateField).sendKeys("TX");
	driver.findElement(zipField).sendKeys("15464");
	//driver.findElement(welcomeemailField).click();
	
	selectclass( companydropdwnField, "Apple");
	selectclass( groupdropdwnField, "Selenium");
	
	
driver.findElement(submitField).click();
		

	}

public void selectclass(By element, String VisibleText) {
	
	Select sel= new Select(driver.findElement(element));
	sel.selectByVisibleText(VisibleText);

}

public int Random(int boundaryNumber) {
	
	java.util.Random rand = new java.util.Random();
	 int randomNum=rand.nextInt(boundaryNumber);
	 return randomNum;
			
			
}}
