package basics;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeOfWindow {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://google.com");
		
		Dimension dimension = driver.manage().window().getSize();
		int height = dimension.getHeight();
		int width = dimension.getWidth();
		System.out.println(height);
		System.out.println(width);

}}
