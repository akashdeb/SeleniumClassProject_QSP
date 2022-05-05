package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifyElemenUsingClassname {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		
//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
		//placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
		driver.findElement(By.className("inputtext")).sendKeys("Akash");
		driver.quit();
	}

}
