package SeleniumBasics;

import javax.swing.border.Border;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAndHardAssertions {
	WebDriver driver;
	@BeforeTest
	public void launchBrowser()throws InterruptedException
	{
			System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
	}
	@Test
	public void login() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("seleniumAssert",Keys.ENTER);
	   	Thread.sleep(2000);
	   	SoftAssert softAssert=new SoftAssert();
	   	String actualTitle=driver.getTitle();
	   	String expcetedTittle="Log in to Facebook";
		SoftAssert softAssert2 = new SoftAssert();
		softAssert2.assertEquals(actualTitle, actualTitle, "Url is mistadched");
		String actualUrl=driver.getCurrentUrl();
		String ExpectedUrl="https://www.facebook/";
		softAssert2.assertEquals(actualUrl, actualUrl, "Url is mistadched");
		//Border assertion
		String actualBorder=driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder="lpx solid rgb(240, 40, 73)";
		softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");
		
	}

}
