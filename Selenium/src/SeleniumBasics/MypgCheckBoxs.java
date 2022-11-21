package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MypgCheckBoxs {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\Selenium\\chrome\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");
		Thread.sleep(2000);
		driver.findElement(By.id("femalerb")).click();
		driver.findElement(By.id("englishchbx")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("hindichbx")).click();
		WebElement chichinesechk=driver.findElement(By.id("chinesechbx"));
		chichinesechk.click();
		Thread.sleep(2000);
		if(chichinesechk.isSelected());
		chichinesechk.click();
		driver.findElement(By.id("registerbtn")).click();
		System.out.println(driver.findElement(By.id("msg")).getText());
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		
		
	}

}
