package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyWebElementUsingId {

		public static void main(String[] args) throws InterruptedException {
			//browser executable settings
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			//launching the browser
			WebDriver driver = new ChromeDriver();
			//maximize the window
			driver.manage().window().maximize();
			//navigate to the actitime webpage
			driver.get("https://demo.actitime.com/login.do");
			
			//<input type="text" name="username" value="" id="username" class="textField" placeholder="Username">
			driver.findElement(By.id("username")).sendKeys("Akash");
			
			Thread.sleep(5000);
			driver.quit();
	}

}
