package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindowBasedOnTittle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:/www.naukri.com");
		String actualTitle = "Cognizant";
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String windowId : windowIds) {
			driver.switchTo().window(windowId);
			String expectedTitle = driver.getTitle();
			if (expectedTitle.equals(actualTitle)) {
				driver.close();
				break;
			}
		}
	}

}
