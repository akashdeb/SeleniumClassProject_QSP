package basics;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToAnother2 {
	public static void main(String[] args) throws MalformedURLException {
	
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://google.com");
	
	URL url = new URL("https://www.flipkart.com");
	driver.navigate().to(url);
	driver.quit();

			
}}
