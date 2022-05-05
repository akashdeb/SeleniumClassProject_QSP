package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllignmentIssueTest {

	public static void main(String[] args) throws InterruptedException {
		final int SPACE = 5;
		System.setProperty("webdriver.chrome.driver", ".//drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signin");
		Thread.sleep(2000);
		Rectangle usernameRect = driver.findElement(By.name("email")).getRect();
		int userNameWidth = usernameRect.getWidth();
		int usernameStartX = usernameRect.getX();
		int usernameEndX = userNameWidth+usernameStartX;
		
		int passwordStartX = driver.findElement(By.name("pass")).getLocation().getX();
		
		System.out.println("UserName EndX: "+usernameEndX);
		System.out.println("Password StartX: "+passwordStartX);
		
		if(passwordStartX>usernameEndX+SPACE) 
			System.out.println("Pass: Textfields are not Overlapping");
			else System.out.println("Fail: Textfields are Overlapping");
		
		driver.quit();
		}
		
		
	}


