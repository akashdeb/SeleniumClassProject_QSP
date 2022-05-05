package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnother {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://google.com/");
			driver.navigate().to("https://www.flipkart.com");
			driver.quit();
		}}
				