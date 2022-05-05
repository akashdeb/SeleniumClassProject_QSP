package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserHistoryNabvigation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers.chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https;//google.com/");
		driver.get("https://flipkart.com");
		
		Navigation navigate = driver.navigate();
		navigate.refresh();
		navigate.forward();
		navigate.back();
		driver.quit();
		driver.navigate();
		
	}

}
