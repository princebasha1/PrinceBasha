package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FramesDemo {
	WebDriver driver;
	@BeforeTest
	public void open()    {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Frames.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
			@Test
			public void operation()   throws InterruptedException{
				driver.findElement(By.linkText("Iframe with in an Iframe")).click();
				WebElement outerf=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[2]/a"));
				driver.switchTo().frame(outerf);
				WebElement innerf=driver.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[1]/div/ul/li[1]/a"));
				driver.switchTo().frame(innerf);
				driver.findElement(By.xpath("//input[@type='text']")).sendKeys("selenium");
				Thread.sleep(2000); 
			}
			@AfterTest
			public void close()   {
				driver.close();
				
				
	}
}
