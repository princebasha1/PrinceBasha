package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UploadFileDemo {
	WebDriver driver;
	@BeforeTest
	public void launchApplication()   {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.monsterindia.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  
	}
	
			@Test
			public void operation()  throws InterruptedException , AWTException
			{
				Thread.sleep(2000);
				driver.findElement(By.xpath("span[@class='uprcse semi-bold']")).click();
				Robot rb=new Robot();
				String path=System.getProperty("user.dir")+"C:\\User\\princ\\Downloads\\KHASIM's Resume (11).pdf";
				StringSelection ss=new StringSelection(path);
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
				WebElement button=driver.findElement(By.xpath("//*[@id='user=signup=action']/div[1]/div[1]/div[2]/div/div/section/div/form/div[1]/div[1]/div/div/button"));
				Actions ac=new Actions(driver);
				ac.moveToElement(button).click().build().perform();
				rb.delay(2000);
				rb.keyPress(KeyEvent.VK_CONTROL);
				rb.keyPress(KeyEvent.VK_V);
				rb.keyRelease(KeyEvent.VK_CONTROL);
				rb.keyRelease(KeyEvent.VK_V);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				rb.keyPress(KeyEvent.VK_TAB);
				rb.keyRelease(KeyEvent.VK_TAB);
				rb.keyPress(KeyEvent.VK_ENTER);
				rb.keyRelease(KeyEvent.VK_ENTER);
				driver.findElement(By.xpath("//form[@name='parsingResponeForm']/descendant:;span/input[@value='submit' and @class='btn']")).click();
				
			}
			@AfterTest
			public void close()  {
				driver.close();
			}
}

