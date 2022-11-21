package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNgParamters {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void launchBrowser(String browserName){
	 switch( browserName.toLowerCase())
	 {
		 case "chrome":
			System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		    driver=new ChromeDriver();
		    break;
		 case"edge":
			 driver=new EdgeDriver();
			 break;
	 }
			 driver.manage().window().maximize();
	}
	 @Parameters("url")
	 @Test
	 public void launchApp(String Url) throws InterruptedException {
			 driver.get(Url);
			 Thread.sleep(2000); 
			 }
	 @Parameters({"userName","password"})
	 @Test
	 public void login(String username , String password)
	 {
		 driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/a")).click();
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(username);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(password);
		 driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button/span")).click();
		 
	 }
	
					
						 
					 
					 
				 
	


	}


