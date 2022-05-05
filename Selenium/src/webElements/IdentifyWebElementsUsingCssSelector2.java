package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyWebElementsUsingCssSelector2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("Akash");
		driver.findElement(By.cssSelector("input.textField")).sendKeys("123");
		
	}
}
