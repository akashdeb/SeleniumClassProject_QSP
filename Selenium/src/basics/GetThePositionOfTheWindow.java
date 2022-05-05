 package basics;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetThePositionOfTheWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos.x);
		System.out.println(pos.y);
	}

}
