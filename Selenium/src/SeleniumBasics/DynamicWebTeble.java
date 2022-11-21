package SeleniumBasics;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DynamicWebTeble {
	WebDriver driver;
	@BeforeTest
	public void open()    {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timeanddate.com/worldclock/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void operation()  {
		   WebElement table = driver.findElement(By.xpath("//table[@class='zebra fw tb-theme']"));
		   List<WebElement> nrows = driver.findElements(By.tagName("tr"));
		   for(int i=0;i<nrows.size();i++)
		   {
			   List<WebElement> ncloms = nrows.get(i).findElements(By.tagName("td"));
			   for(int j=0;j<ncloms.size();j++)
			   {
				   System.out.println(ncloms.get(i).getText()+ "  ");
			   }
			   System.out.println();
		   }
		   
		     
		}
	@AfterTest
	public void close()  { 
		driver.close();
	}
}
