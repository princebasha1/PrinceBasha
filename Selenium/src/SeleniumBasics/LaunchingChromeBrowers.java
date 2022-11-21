package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchingChromeBrowers {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//System.setProperty("webdriver.gecko.driver", "D:\\Testing\\Selenium\\khasim\\geckodriver.exe");
		//FirefoxDriver driver1=new FirefoxDriver();
		//driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		driver.findElement(By.linkText("Gmail")).click();
		String actuaUrl=driver.getCurrentUrl();
		System.out.println("actuaUrl");
		String expectedUrl="https://mail.google.com/mail/u/0/?ogbl#inbox";
		if(actuaUrl.equals(expectedUrl));
		{
			System.out.println("Gmail login Successfull");
		}
		{
			System.out.println("Gmail login unsuccessfull");
		}
		driver.close();
		

	}

}
