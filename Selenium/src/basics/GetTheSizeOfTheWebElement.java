package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheSizeOfTheWebElement {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * 
		 */
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		Dimension dimension = driver.findElement(By.id("username")).getSize();
		System.out.println("Height "+dimension.getHeight());
		System.out.println("Width "+dimension.getWidth());
		
		driver.quit();
	}

}
