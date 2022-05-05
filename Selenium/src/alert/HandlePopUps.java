package alert;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUps {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.marimallappawomenscollege.org/");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@id='chromemenu']/ul/li"));
		for(WebElement e :ele) {
			System.out.println(e.getText());
		}
		driver.findElement(By.linkText("Contact Us")).click();
		driver.findElement(By.name("Send")).click();
		
		driver.switchTo().alert().accept();
		
		System.out.println("*********************************");
		System.out.println("PopUp Handled");
		driver.quit();
		
	}

}
