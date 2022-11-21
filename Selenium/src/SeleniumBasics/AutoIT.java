package SeleniumBasics;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AutoIT {
	
	WebDriver driver;
	@BeforeTest
	public void open()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		HashMap<String, Object> prefs = new HashMap<String,Object>();
		prefs.put("profile.default_content_settings.popups", 0);
		prefs.put("download.prompt_for_download", true);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		driver.get("https://www.selenium.dev/downloads/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@SuppressWarnings("deprecation")
	@Test
	public void operation() throws InterruptedException, IOException
	{
		driver.findElement(By.linkText("4.6.0")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\princ\\OneDrive\\Desktop\\screenshot\\button.exe");
	}

}
