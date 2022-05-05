package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAllTheWindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://naukri.com");
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String ids: windowIds) {
			System.out.println(ids);
		}
		driver.quit();
	}

}
