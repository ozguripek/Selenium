package Selenium;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Divpaxinfo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//imac//Documents//Chrome-Driver//chromedriver");
		
		WebDriver driver =new ChromeDriver();
		Assert.assertFalse(driver.findElement(By.cssSelector("input='SeniorCitizendiscount']")).isSelected());
		//Assert.assertFalse(true);
		//System.out.println(driver.findElement(By.cssSelector("input='SeniorCitizendiscount']")).isSelected());
		driver.findElement(By.cssSelector("input='SeniorCitizendiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input='SeniorCitizendiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input [type='checkbox']")).size());
		//Assert.assertTrue(true);
		driver.findElement(By.id("divpaxinfo")).click();

		   Thread.sleep(2000L);

		   /*int i=1;

		while(i<5)

		{

		driver.findElement(By.id("hrefIncAdt")).click();//4 times

		i++;

		}*/

		   System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		for(int i=1;i<5;i++)

		{

		driver.findElement(By.id("hrefIncAdt")).click();

		}

		driver.findElement(By.id("btnclosepaxoption")).click();

		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
	}

}
