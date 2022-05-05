package basics;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMultipleWindowsOneByOne {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https:/www.naukri.com");
		
		Set<String> windowIds = driver.getWindowHandles();
		for(String windoId: windowIds) {
			driver.switchTo().window(windoId);
			driver.close();
		}
	}

}
