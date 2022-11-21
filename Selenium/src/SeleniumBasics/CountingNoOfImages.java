package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingNoOfImages {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkat.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		List<WebElement> nimages=driver.findElements(By.tagName("a"));
		System.out.println("no.of images=" +nimages.size());
		for(int i=0;i<nimages.size();i++);
		int i=0;
		{
			System.out.println(nimages.get(i).getAttribute("src"));
		}
		
		

	}

}
