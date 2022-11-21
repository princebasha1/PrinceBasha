package SeleniumBasics;

//import java.awt.Checkbox;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountAndGetNames1 {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.co.in/");
		List<WebElement> checkboxes=driver.findElements(By.xpath("//input[@type='checkboxs']"));
		System.out.println("The no.of checkboxs are="+checkboxes.size());
		for(int j=0;j<checkboxes.size();j++);
		{
			int j = 0;
			System.out.println(checkboxes.get(j).getAttribute("name"));
		}
		//driver.close();
	}
	}