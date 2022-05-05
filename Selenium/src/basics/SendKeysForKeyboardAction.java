package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysForKeyboardAction {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement ele = driver.findElement(By.name("pwd"));
		ele.sendKeys("manager");
		ele.sendKeys(Keys.CONTROL+"a");
		ele.sendKeys(Keys.CONTROL+"c");
		System.out.println(Keys.CONTROL+"v");
		driver.findElement(By.id("username")).sendKeys(Keys.CONTROL+"v");
		
	}

}
