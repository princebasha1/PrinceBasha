package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectingValue {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",  "D:\\Testing\\Selenium\\khasim\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mercurytravels.co.in/");
		driver.findElement(By.id("themes")).sendKeys("Family");
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.id("themes"));
		Select st=new Select(dropdown);
		st.selectByIndex(5);
		Thread.sleep(2000);
		st.selectByVisibleText("Nature");
		Thread.sleep(2000);
		st.selectByValue("16");
		Thread.sleep(2000);
		driver.close();

	}

}
