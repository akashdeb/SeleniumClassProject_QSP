package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureCurrentWindowId {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
		
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		//System.out.println(driver.getWindowHandle());
		driver.quit();
	}

}
