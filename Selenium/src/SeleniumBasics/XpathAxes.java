package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.zoho.com/crm/singup.html");
		Thread.sleep(1000);
		List<WebElement> cwe=driver.findElements(By.xpath("//div[@class='za-password-container sgfrm']/self::div"));
		System.out.println(cwe.size());
		for(int i=0;i<cwe.size();i++);
		int i=0;
		{
			System.out.println("Tag name:" +cwe.get(i).getTagName());
			System.out.println("Attribute value:" +cwe.get(i).getAttribute("class"));
			}
		

	}

}
