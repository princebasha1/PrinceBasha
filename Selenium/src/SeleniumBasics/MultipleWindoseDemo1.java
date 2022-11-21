package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleWindoseDemo1 {
	WebDriver driver;
	@BeforeTest
	public void open() throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.online.citibank.co.in/");
		Thread.sleep(2000);
	}
	@Test
	public void operation() throws InterruptedException  {
		driver.findElement(By.xpath("/html/body/div[23]/div/div/a")).click();
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div[2]/ul/li[2]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div[2]/ul/li[3]/a")).click();
		Thread.sleep(2000);
		driver.navigate().to("https://www.youtube.com/"); 
		Thread.sleep(2000);
		driver.navigate().to("https://www.online.citibank.co.in/"); 
		driver.findElement(By.xpath("/html/body/div[23]/div/div/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"footer\"]/div[1]/div[2]/ul/li[4]/a")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"wrapper\"]/div[2]/div/a")).click();
		
	}

}
