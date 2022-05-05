package slelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckingAnElementIspresentOrNot {

	public static void main(String[] args) {
		boolean flag = true;
		String givenOption = "Audi";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select select = new Select (dropDown);
		List<WebElement> options = select.getOptions();
		for(WebElement elements:options) {
			if(elements.getText().equals(givenOption)) {
				flag=false;
				break;				
			}
		}
		if(flag) {
			System.out.println("Element "+givenOption+" is not Present");
		}
		else System.out.println("Element "+givenOption+" is Present");
			
		driver.quit();
	}
}
