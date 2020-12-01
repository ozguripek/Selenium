package assignment;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.findElements(By.xpath("//div[id='checkbox-example']"));
		
		List<WebElement> cb= driver.findElements(By.cssSelector("div[id='checkbox-example'] label"));
		
		System.out.println(cb.size());
		
		
		
	}

}
