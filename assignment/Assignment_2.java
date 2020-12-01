package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cleartrip.com");
		driver.findElement(By.xpath("//input[@id='DepartDate']")).click();
		
		//takvimi acip current günün üzerine tiklayinca görünüyor
		driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active ")).click();

		// Birinci yöntem
		/*
		 * WebElement adult=driver.findElement(By.id("Adults")); Select s =new
		 * Select(adult); s.selectByIndex(2);
		 */

		/*
		 * WebElement ch=driver.findElement(By.id("Childrens")); Select s1 =new
		 * Select(ch); s1.selectByIndex(2);
		 */

		// Ikinci yöntem
		Select adult = new Select(driver.findElement(By.id("Adults")));
		adult.selectByValue("3");

		Select childeren = new Select(driver.findElement(By.id("Childrens")));
		childeren.selectByValue("3");

		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();

		Select classOfTravel = new Select(driver.findElement(By.id("Class")));
		classOfTravel.selectByValue("Business");

		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("indigo");

		driver.findElement(By.id("SearchBtn")).click();

		// error message

		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());

	}

}
