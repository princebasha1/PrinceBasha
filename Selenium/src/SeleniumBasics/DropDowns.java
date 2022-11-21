package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDowns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/"); 
		List<WebElement> dropdowns=driver.findElements(By.tagName("Select"));
		System.out.println("no.of dropdowns ="+dropdowns.size());
		for(int i=0;i<dropdowns.size();i++);
		int i=0;
		{
			System.out.println(dropdowns.get(i).getAttribute("name"));
			
		}
		driver.close(); 
 
	}

}
