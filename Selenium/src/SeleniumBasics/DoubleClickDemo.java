package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClickDemo {
	WebDriver driver;
	@BeforeTest
	public void launchOPeration()  {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
	@Test
	public void operation()
	{
		WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		Actions ac = new Actions(driver);
		ac.doubleClick(doubleClick).build().perform();
		System.out.println(driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText());
		String actual = driver.findElement(By.xpath("//p[@id='doubleClickMessage']")).getText();
		String expected = "You have done a double click";
		Assert.assertEquals(actual, expected, "Both are Equal");
		
	}
	} 

