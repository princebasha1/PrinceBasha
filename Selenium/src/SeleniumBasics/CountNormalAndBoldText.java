package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountNormalAndBoldText {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(1000);
		List<WebElement> btexts=driver.findElements(By.tagName("p"));
		System.out.println("the normal text is="+btexts.size());
		for(int i=0;i<btexts.size();i++);
		int i=0;
		{
			System.out.println(btexts.get(i).getText());
		}
			driver.close();
	}

}
