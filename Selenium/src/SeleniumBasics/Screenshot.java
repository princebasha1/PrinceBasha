package SeleniumBasics;



import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;


public class Screenshot {

	public static void main(String[] args) throws IOException{
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		TakesScreenshot tc = (TakesScreenshot) driver;
	    File sc = tc.getScreenshotAs(OutputType.FILE);
	    File path = new File("C:\\Users\\princ\\OneDrive\\Desktop\\screenshot\\img.png");
	    Files.copy(sc, path);
		
	} 

}
