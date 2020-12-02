package assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
				
		driver.get("http://the-internet.herokuapp.com/");
		
		// ilk pencere icin  1.yöntem
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		// ilk pencere icin 2.yöntem
		//driver.findElement(By.linkText("Multiple Windows")).click();
		
		// ikinci pencere icin
		driver.findElement(By.cssSelector("a[href*='windows']")).click();
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String parentIt= it.next();
		String childIt= it.next();
		
		driver.switchTo().window(childIt);
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.xpath("//div/h3")).getText());
		
		
		driver.switchTo().window(parentIt);
		System.out.println(driver.getTitle());		
		System.out.println(driver.findElement(By.xpath("//div[@id='content']/div/h3")).getText());
		
	}

}
