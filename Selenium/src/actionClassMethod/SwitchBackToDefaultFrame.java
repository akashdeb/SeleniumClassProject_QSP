package actionClassMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBackToDefaultFrame {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/draggable/");
		
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		
		WebElement box = driver.findElement(By.id("draggable"));
		
		Actions action = new Actions(driver);
		action.dragAndDropBy(box, 100, 300).perform();
		//driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
		String text = driver.findElement(By.cssSelector("h1[class='entry-title']")).getText();
		System.out.println(text);
	}

}
