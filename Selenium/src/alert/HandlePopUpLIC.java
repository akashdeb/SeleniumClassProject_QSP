package alert;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlePopUpLIC {

	public static void main(String[] args) throws InterruptedException {
		String expectedOnLineLoanTitle = "Life Insurance Corporation of India - Policy Loan Options";
		String expetedPageAfterClick = "Life Insurance Corporation of India";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		
		driver.findElement(By.linkText("Online Loan")).click();
		if(expectedOnLineLoanTitle.equals(driver.getTitle())) {
			System.out.println("Pass: Online Loan Page Title is matching");
		}
		else System.out.println("Fail: Online Loan Page Title is not matching");

		driver.findElement(By.xpath("//b[text()='Pay Direct (Without login)']")).click();
		driver.switchTo().alert().accept();
		
		Set<String> windows = driver.getWindowHandles();
		for(String title:windows) {
			driver.switchTo().window(title);
			}
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(expetedPageAfterClick));
		if(expetedPageAfterClick.equals(driver.getTitle())) {
			System.out.println("Pass: Page Title is matching after handling the pop up");
		}
		else System.out.println("Fail: Page Title is not matching after handling the pop up");
		
		
		driver.quit();
		
	}

}
