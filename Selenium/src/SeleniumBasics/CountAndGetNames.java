package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndGetNames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		List<WebElement> nradios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("no of radio butoons are: "+ nradios.size());
		for(int i=0;i<nradios.size();i++);
		int i=0;
		{
			System.out.println(nradios.get(i).getAttribute("name"));
		}
		
	}

}
