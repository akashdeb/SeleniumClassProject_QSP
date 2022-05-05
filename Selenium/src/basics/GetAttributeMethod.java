package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		String expectedTitle = "Do not select if this computer is shared";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		String actualTitle = driver.findElement(By.name("remember")).getAttribute("title");
		System.out.println(actualTitle);
		if(actualTitle.equals(expectedTitle))
		System.out.println("Pass: Tool tip is Verified");
		else
			System.out.println("Fail: Tool tip is verified");
		
		
		driver.quit();
	}

}
