package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// bu siteye gidilemiyor

		driver.get("https://www.itgeared.com/demo/1506-ajax-loading.html");
		driver.findElement(By.cssSelector("a[href*='loadAjax']")).click();
		
		WebDriverWait w= new WebDriverWait(driver,5);
		w.until(ExpectedConditions.elementToBeClickable(By.id("results")));
	
		System.out.println(driver.findElement(By.id("results")).getText());
		
		// id si belli paren`ten child`a gitme
	    //System.out.println( driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]")).getText());   

	
	}

}
