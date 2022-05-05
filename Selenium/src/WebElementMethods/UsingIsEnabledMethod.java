package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIsEnabledMethod {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		
		boolean flag = driver.findElement(By.xpath("//input[@class='form-control']")).isEnabled();
		if(flag) 
			System.out.println("it is Enabled");
			else System.out.println("it is Disabled");
		
		driver.quit();
		}

}
