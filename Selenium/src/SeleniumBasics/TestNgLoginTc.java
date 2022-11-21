package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNgLoginTc
{
	WebDriver driver;
	
	@BeforeSuite
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@Test
	public void login()
	{
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9642314490");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys("9642314490");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[3]/a/div[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/span[2]")).click();
	
	}
	//@Test
	//public void logOut()
	{
	//	driver.findElement(By.xpath("
	}
}