package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTitleInAscendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.get("https:/www.naukri.com");
		 
		 
		 Set<String> windowIds = driver.getWindowHandles();
		 ArrayList<String> list = new ArrayList<>();
		 for(String ids:windowIds) {
			 driver.switchTo().window(ids);
			 list.add(driver.getTitle());
		 }
		 System.out.println(list);
		 Collections.sort(list);
		 for(String title:list) {
		 System.out.println(title);
		 }
		 driver.quit();
	}

}
