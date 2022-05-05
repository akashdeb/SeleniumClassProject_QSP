package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']")).sendKeys("Tshirts");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[text()='Tshirts For Men']")).click();
		Thread.sleep(10000);
		driver.findElement(By.partialLinkText("\"tshirts/hrx-by-hrithik-roshan/hrx-by-hrithik-roshan-men-teal-blue-printed-t-shirt/1")).click();
		
	}

}
