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

public class MouseMoveDemo {
	WebDriver driver;
	@BeforeTest
	public void open()     {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}
			@Test
			public void operation()   throws InterruptedException   {
				Thread.sleep(3000);
				driver.findElement(By.xpath("//*[@id=\"narbar-menu\"]/ul/li[1]/a")).click();
				
				Actions action=new Actions(driver);
				driver.findElement(By.xpath("//*[@id=\"menu\"]")).click();
				driver.findElement(By.xpath("//*[@id=\"column-left\"]/div[1]/a[2]")).click();
				//action.moveToElement(Desktop).build().perform();
				Thread.sleep(1000);
			}
		/*	@AfterTest
			public void close()   {
				driver.close();
			}
 		*/
	}
 

