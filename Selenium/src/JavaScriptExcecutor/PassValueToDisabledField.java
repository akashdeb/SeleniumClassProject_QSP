package JavaScriptExcecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PassValueToDisabledField {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demoapp.skillrary.com/");
			
			WebElement disabledField = driver.findElement(By.cssSelector("input[class='form-control']"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].value='Akash'", disabledField);
	}

}
