package webElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IndentifyElementUsingName {

	public static void main(String[] args) throws InterruptedException {
		//browser executable settings
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		//launching the browser
		WebDriver driver = new ChromeDriver();
		//maximize the window
		driver.manage().window().maximize();
		//navigate to the skillary webpage
		driver.get("https://www.skillrary.com/");
		//identifying from the searchbar from the webpage and entering the text"java" string to it
		//<input type="search" name="q" placeholder="Search for Courses" value="">
		
		driver.findElement(By.name("q")).sendKeys("Varsha");
		//delay to see the result
		Thread.sleep(5000);
		driver.quit();
		
	}

}
