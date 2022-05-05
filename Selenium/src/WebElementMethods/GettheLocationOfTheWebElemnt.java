package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettheLocationOfTheWebElemnt {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		int startX = usernameTextField.getLocation().getX();
		int startY = usernameTextField.getLocation().getY();
		System.out.println(startX);
		System.out.println(startY);
		driver.quit();
	}
	

}
