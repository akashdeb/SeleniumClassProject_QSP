package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdentifySignInButtonInSkillrary_FrontendBackEnd {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Sign In")).click();
		/* Always Use whatever is given in the Front-End*/
		
		//<a href="https://www.skillrary.com/user/login">Sign In</a>
		driver.findElement(By.linkText("SIGN IN")).click();
		driver.quit();
	}

}
