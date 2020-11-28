package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AllDropDownElement {
	
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","//Users//imac//Documents//Chrome-Driver//chromedriver");
		
			WebDriver driver=new ChromeDriver();	
			driver.get("http://spicejet.com");
			
			System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
	
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
			driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
	
			System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
	
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1")){
	
				System.out.println("its enabled");
				Assert.assertTrue(true);
			}
	
			else{
				Assert.assertTrue(false);
	
			}
	
	}
}
