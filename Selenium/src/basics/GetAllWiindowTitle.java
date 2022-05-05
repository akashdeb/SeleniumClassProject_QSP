package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllWiindowTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String Ids:windowIds) {
			driver.switchTo().window(Ids);
			System.out.println(driver.getTitle());
		}
		driver.quit();
	}

}
