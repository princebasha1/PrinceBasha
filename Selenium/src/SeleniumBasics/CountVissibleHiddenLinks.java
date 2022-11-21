package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountVissibleHiddenLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bing.com/");
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("No.of links are:"+links.size());
		for(int i=0;i<links.size();i++);
		int i = 0;
		{
			
			if(links.get(i).isDisplayed());
			{
				System.out.println(links.get(i).getText());
			}
		}
			Thread.sleep(2000);
			System.out.println("total links are: "+links.size());
			int count = 0;
			System.out.println("Visible links: "+ count);
			System.out.println("Hadden links: "+(links.size()-count));
			
		

	}

}
