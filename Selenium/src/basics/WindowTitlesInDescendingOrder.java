package basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTitlesInDescendingOrder {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		Set<String> windowIds = driver.getWindowHandles();
		ArrayList<String> list = new ArrayList<>();
		for(String id:windowIds) {
			driver.switchTo().window(id);
		    list.add(driver.getTitle());
		}
		System.out.println(list);
		Collections.sort(list, Collections.reverseOrder());
		for(String title:list) {
			System.out.println(title);
		}
		driver.quit();
	}}  
		
		
