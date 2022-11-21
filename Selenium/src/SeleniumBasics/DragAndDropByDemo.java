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

public class DragAndDropByDemo {
	WebDriver driver;
	@BeforeTest
	public void open()   {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://jqueryui.com/slider/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@Test
	public void operation()  throws InterruptedException {
		driver.switchTo().frame(0);
		WebElement Slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		Actions action=new Actions(driver);
		int loc=Slider.getLocation().x;
		action.dragAndDropBy(Slider, 70, loc).build().perform();
	}
		@AfterTest
		public void close()   {
			driver.close(); 
		}
 } 
