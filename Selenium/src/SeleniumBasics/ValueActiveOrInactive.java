package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValueActiveOrInactive {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		WebElement dropdown=driver.findElement(By.id("themes"));
		List<WebElement> values=dropdown.findElements(By.tagName("option"));
		for(int i=0;i<values.size();i++);
		int i = 0;
		String vname=values.get(i).getText();
		values.get(i).click();
		if(values.get(5).isSelected())
		{
			System.out.println(vname +" "+"active");
		}
			driver.close();
	}

}
