package actionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame lazyloaded']")));
		
		WebElement source = driver.findElement(By.cssSelector("img[alt='The peaks of High Tatras']"));
		WebElement destination = driver.findElement(By.cssSelector("div[id='trash']"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(source, destination).perform();
		
		
	}

}
