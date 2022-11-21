package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MYpgDropDowns {

	public static void main(String[] args)   throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(2000);
		
		WebElement courseElement =driver.findElement(By.id("course"));
		Select courseNameDropDown =new Select((WebElement) courseElement);
		List<WebElement> courseNameDropDownoptions= courseNameDropDown.getOptions();
		for ( WebElement options: courseNameDropDownoptions) {
			System.out.println(options.getText());
		}
		courseNameDropDown.selectByIndex(1);
		Thread.sleep(2000);
		courseNameDropDown.selectByValue("net");  // Dot.net
		Thread.sleep(2000);
		courseNameDropDown.selectByVisibleText("Javascript");   //Javascript
		String selectedText= courseNameDropDown.getFirstSelectedOption().getText();
		System.out.println("selectedByVisibleText -" +selectedText);
		
		
		WebElement ideElement =driver.findElement(By.id("ide"));
		Select ideDropDown =new Select((WebElement) ideElement);
		List<WebElement> ideDropDownoptions= ideDropDown.getOptions();
		for ( WebElement options:ideDropDownoptions) {
			System.out.println(options.getText());
		}
		ideDropDown.selectByIndex(0);  //Eclipse
		Thread.sleep(2000);
		ideDropDown.selectByValue("ij");  // IntelliJ IDEA
		Thread.sleep(2000);
		ideDropDown.selectByVisibleText("NetBeans");   //NetBeans 
		Thread.sleep(2000);
		ideDropDown.deselectByVisibleText("IntelliJ IDEA");
		List<WebElement> selectedText1= ideDropDown.getAllSelectedOptions();
		System.out.println("selectedByVisibleText -" +selectedText1);
	}

}
