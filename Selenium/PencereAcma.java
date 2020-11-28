package Selenium;

import java.util.Iterator;

import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

public class PencereAcma {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div[1]/p/a")).click();
		
		// Before swiching we write the name of our first website
		System.out.println(driver.getTitle());
		Set<String> ids = driver.getWindowHandles();//set olustur
		Iterator<String> it = ids.iterator();//elemanlarin iteratorunu listede tut
		String parentid = it.next();//birinciye git
		String childid = it.next();//ikinciye git
		driver.switchTo().window(childid);//driver i cocuk id ye degistir
		
		// After switching
		System.out.println(driver.getTitle());
		
		// Switching back to parent
		driver.switchTo().window(parentid);
		System.out.println(driver.getTitle());

	}

}
