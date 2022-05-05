package webElementsUsingList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextAndAscending {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.fifa.com/fifa-world-ranking/men?dateId=id13295");
		
		List<WebElement> names = driver.findElements(By.xpath("//table[@class=\"fc-ranking-list-full_rankingTable__1u4hs\"]/tbody/tr/td[3]/span[@class=\"d-none d-lg-block\"]"));
		 ArrayList<String> list = new ArrayList<>();
		for(WebElement name:names) {
			String newName = name.getText();
			list.add(newName);
		}
		//System.out.println(list);
		Collections.sort(list);
		for(String newNames: list)
		{
			System.out.println(newNames);
		}
		driver.quit();
	}
	

}
