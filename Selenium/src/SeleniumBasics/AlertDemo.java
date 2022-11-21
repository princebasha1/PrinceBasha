package SeleniumBasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlertDemo {
	WebDriver driver;
	@BeforeTest
	public void open()   {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void alertWithTextbox()  throws InterruptedException   {
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click(); 	
	    driver.switchTo().alert().sendKeys("Selenium with Alert");
    	Thread.sleep(2000); 
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept(); 
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		//System.out.println(driver.findElement(By.id("demo")));
		driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		
		
	}
	@AfterTest
    public void close()   {
	    driver.close();
	}

}
