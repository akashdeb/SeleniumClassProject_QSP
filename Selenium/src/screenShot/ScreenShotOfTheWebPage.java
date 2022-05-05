package screenShot;

import java.io.File;
import java.sql.Date;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotOfTheWebPage {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.actitime.com/login.do");
			
			TakesScreenshot ts = (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		//System.out.println(tempFile);
			
		String timeStamp = LocalDateTime.now().toString().replace(":", "-");
		
		File destFile = new File("./screenshots/"+timeStamp+"webpage.png");
		tempFile.renameTo(destFile);
		driver.quit();
		//System.out.println(timeStamp);
	}
	//Date date = new Date ();
	//System.out.println(date.toString())
	
	

}
