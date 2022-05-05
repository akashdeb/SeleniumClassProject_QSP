package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsSelctedAndISDisplayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		  WebElement checkBox = driver.findElement(By.name("remember"));
		  checkBox.click();
		  boolean flag = checkBox.isDisplayed();
		  boolean flag1 = checkBox.isEnabled();
		  if(flag&&flag1) 
			  System.out.println("Pass: Element Is Displayed And Checked");
			  else System.out.println("Fail: Element Is Not Displayed And Checked");
		  
	}

}
