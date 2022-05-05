package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingAllignmentOfTheWebElements {

	public static void main(String[] args) {
		final int SPACE = 6;
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		 Rectangle usernameTextField = driver.findElement(By.id("username")).getRect();
		 Rectangle passwordTextField = driver.findElement(By.name("pwd")).getRect();

		 int usernameStartX = usernameTextField.getX();
		 int passwordStartX=passwordTextField.getX();
		 
		 System.out.println("Start-X of UserName TextField: "+usernameStartX);
		 System.out.println("Start-X of Password TextField: "+passwordStartX);
		 
		 if(usernameStartX==passwordStartX) 
			 System.out.println("Pass: The left Allignment is Correct");
			 else System.out.println("Fail: The left Allignment is not Correct");
		 
		 int usernameEndY = usernameTextField.getY()+usernameTextField.getHeight();
		 int passwordStartY = passwordTextField.getY();
		 System.out.println("*************************************************************");
		 System.out.println("End-Y of UserName TextField: "+usernameEndY);
		 System.out.println("Start-Y of Password TextField: "+passwordStartY);
		 
		 if(passwordStartY>=usernameEndY+SPACE) 
			 System.out.println("Pass: The Top Allignment is Correct");
			 else 
				 System.out.println("Fail: The Top Allignment is not Correct"); 
		 
		 driver.quit();
		 }

		 
	}

