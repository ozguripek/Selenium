import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","//Users//imac//Documents//Chrome-Driver//chromedriver");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://spicejet.com");
		Select s=new Select(driver.findElement(By.id("ct100 mainContent ddl Adult")));
		s.selectByValue("2");
		s.deselectByIndex(6);
		s.deselectByVisibleText("5 Adults");
		
		driver.findElement(By.id("ct_100_mainContent_ddl_originStation1_CTXT")).click();
	
		driver.findElement(By.xpath("*//a[@value='BLR ']")).click();
		Thread.sleep(2000);;
		driver.findElement(By.xpath("(*//a[@value='MAA'])[2]")).click();
		driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();
	}

}
