package slelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTheDropDownElemntAndDeselect {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		
		WebElement dropDown = driver.findElement(By.id("cars"));
		Select select = new Select (dropDown);
		
		select.selectByIndex(2);
		Thread.sleep(2000);
		select.selectByValue("volvo");
		Thread.sleep(2000);

		select.selectByVisibleText("Audi");
		Thread.sleep(2000);

		
		WebElement firstSelect = select.getFirstSelectedOption();
		System.out.println("First Selected " +firstSelect.getText() );
		Thread.sleep(2000);

		
		List<WebElement> allSelected = select.getAllSelectedOptions();
		for(WebElement elements:allSelected) {
			System.out.println(elements.getText());
		}
		Thread.sleep(2000);

		select.deselectAll();
	}

}
