package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindows2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https:/www.naukri.com");
		 
		 String parentWindow = driver.getWindowHandle();
		 Set<String> allWindows = driver.getWindowHandles();
		 for(String windowId: allWindows) {
			 driver.switchTo().window(windowId);
			 if(!windowId.equals(parentWindow)) {
				 driver.close();
			 }
		 }
	}

}
