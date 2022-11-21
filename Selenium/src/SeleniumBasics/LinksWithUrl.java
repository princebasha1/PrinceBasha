package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksWithUrl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No.of links are:"+links.size());
		for(int i=0;i<links.size();i++);
		int i = 0;
		{
			
			if(links.get(i).isDisplayed());
		}
		String lname=links.get(i).getText();
		links.get(i).click();
		String lurl=driver.getCurrentUrl();
		System.out.println(lname+" "+lurl);
		driver.navigate().back();
		links=driver.findElements(By.tagName("a"));
		
				
		
		
			
		

	}

}
