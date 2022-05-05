package alert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseChildWindows {

	public static void main(String[] args) {
		String expectedTitle = "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com";
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
	
		Set<String> windows = driver.getWindowHandles();
		for(String titles:windows) {
			driver.switchTo().window(titles);
			System.out.println(driver.getTitle());
			if(!expectedTitle.equals(driver.getTitle())) {
				driver.close();
			}
			
	}
	}

}
