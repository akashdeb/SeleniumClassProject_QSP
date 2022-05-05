package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSizeOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		Dimension dim = new Dimension(500, 600);
		driver.manage().window().setSize(dim);
		driver.quit();
		
		
		
		
		
		driver.quit();

}}
