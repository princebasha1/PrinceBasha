package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DefaultStatus {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Flights")).click();
		List<WebElement> nradios=driver.findElements(By.xpath("//input[@type='radio']"));
		for(int j=0;j<nradios.size();j++);
		int j=0;
		{
			String rname=nradios.get(j).getAttribute("name");
			if(nradios.get(j).isSelected());
			{
				System.out.println(rname+"is active"); 
			}
			{
				System.out.println(rname+"is not active");
			}
	}
	}
}


