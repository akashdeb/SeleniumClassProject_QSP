package actionClassMethod;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PageUpPageDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(5000);
		action.sendKeys(Keys.PAGE_UP).perform();
	}

}
