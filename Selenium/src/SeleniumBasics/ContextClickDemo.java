package SeleniumBasics;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ContextClickDemo {
	WebDriver driver;
	@BeforeTest
	public void launchOperation()  {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
			@Test
			public void operation() throws InterruptedException  {
				WebElement gmail=driver.findElement(By.linkText("Gmail"));
				Actions ac=new Actions(driver);
				ac.contextClick(gmail).build().perform();
				Thread.sleep(2000);
			}
			@AfterTest
			public void close()  {
				driver.close();
			}
				
	}


