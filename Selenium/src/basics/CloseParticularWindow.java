package basics;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseParticularWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https:/www.naukri.com");
		 
		 Set<String> allWindows = driver.getWindowHandles();
		 ArrayList<String> list = new ArrayList<>(allWindows);
				 String secondWindow = list.get(1);
				 driver.switchTo().window(secondWindow);
				 driver.close(); 
	}

}
