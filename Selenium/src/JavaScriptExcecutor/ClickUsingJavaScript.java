package JavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickUsingJavaScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("arguments[0].click()", loginButton);
		
		
		//javaScript code to return the title of the home page
		String title = je.executeScript("return document.title").toString();
		System.out.println(title);
		driver.quit();
	}

}
