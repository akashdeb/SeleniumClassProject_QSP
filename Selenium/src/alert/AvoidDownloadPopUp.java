package alert;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AvoidDownloadPopUp {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.linkText("4.0.0 (October 13, 2021)")).click();
		Runtime.getRuntime().exec("./autoIt/downloadFile.exe");
		
		
		
	}

}
