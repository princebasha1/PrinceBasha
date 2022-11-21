package SeleniumBasics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathaDemo1 {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Selenim");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("Testing");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("Automation Testing");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi' and @name='q']")).sendKeys("Manual Testing");
		driver.findElement(By.xpath("//*[contains(@name,'q')]")).sendKeys("Testing");
		driver.get("https:/www.rediff.com/");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Basha");
		Thread.sleep(1000);
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.xpath("//*[text()='Google offered in:']")).click();
		Thread.sleep(1000);
		driver.close();
		

	}

}
