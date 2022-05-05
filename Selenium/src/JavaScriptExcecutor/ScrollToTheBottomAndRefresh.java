package JavaScriptExcecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToTheBottomAndRefresh {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollTo(0,document.body.scrollHeight");
		//Thread.sleep(3000);
		//js.executeScript("window.scrollTo(0, -document.body.scrollHeight");
		
		
		
		//Refreshing the webpage
		js.executeScript("history.go(0)");
	}

}
