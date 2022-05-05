package webElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisionPopup2 {

	public static void main(String[] args) {
		String date = "Sat Oct 23 2021";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		driver.findElement(By.xpath("//div[@aria-label='"+date+"']")).click();
		
	}

}
