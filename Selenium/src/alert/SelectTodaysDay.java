package alert;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectTodaysDay {

	public static void main(String[] args) throws InterruptedException {
		LocalDateTime todaysDate = LocalDateTime.now();
		int date = todaysDate.getDayOfMonth();
		String mon = todaysDate.getMonth().name();
		int year = todaysDate.getYear();
		String day = todaysDate.getDayOfWeek().name();
		
	    String firstCharOfMonth = mon.substring(0, 1);
	    String editedMon = firstCharOfMonth+ mon.substring(1, 3).toLowerCase();
	    
	    String editedDay = day.substring(0, 1)+day.substring(1, 3).toLowerCase();
	    
	    System.out.println(day);
	    System.out.println(mon);
	    System.out.println(year);
	    System.out.println(editedMon);
	    System.out.println(editedDay);
	    System.out.println(date);
	    
	    String dateInput=editedDay+" "+editedMon+" "+date+" "+year;
	    
	    System.out.println(dateInput);
	    //Fri Oct 22 2021
	    
	    System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.xpath("//div[@class='fsw_inputBox dates inactiveWidget ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='langCardClose']")).click();
		driver.findElement(By.xpath("//div[aria-label='"+dateInput+"']")).click();
	    
	    
	}

}
