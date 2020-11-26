
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException {
		
		//System.setProperty("webdriver.chrome.driver","//Users//imac//Documents//Chrome-Driver//chromedriver");
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://login.salesforce.com/");
		
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("özgür ipek");

		driver.findElement(By.cssSelector("input[id='password']")).click();

		//System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));
	
		driver.findElement(By.cssSelector("#Login")).click();
	
	}
}
