package alert;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class AvoidNotificationPopUpsInFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		
		 FirefoxOptions options = new FirefoxOptions();
		 
		 //to get the key value pair goto firefox and in search button type about:config and click accept risk and continue and directly type the preferences 
		 options.addPreference("dom.webnotifications.enabled", false);
		 
		 WebDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("https://www.yatra.com/");
		 
		 
	}

}
