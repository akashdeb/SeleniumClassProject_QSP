package actionClassMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinksInMultipleWindows {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		List<WebElement> navBar = driver.findElements(By.xpath("//ul[@class='navbar-nav mr-4 mb-2 mb-lg-0 pl-4 pl-lg-2']/li"));
		
		Actions action=new Actions(driver);
		action.keyDown(Keys.CONTROL);
		for(WebElement ele:navBar) {
		action.click(ele);
		}
		
		action.keyUp(Keys.CONTROL);
		action.perform();
	}

}
