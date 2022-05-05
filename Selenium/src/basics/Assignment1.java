package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		
		String actualTitle = "actiTIME - Enter Time-Track";//good practice
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		String expectedTitle = driver.getTitle();
		
		System.out.println("Actual Title: "+actualTitle);
		System.out.println("Expected Title: "+expectedTitle);
		//validation
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Pass: The Actaual Title is equal to the Expected Title");
		}
		else {
			System.out.println("Fail: The Actaual Title is not equal to the Expected Title");
		}

		Thread.sleep(3000);
		driver.findElement(By.id("logoutLink")).click();
	}

}

