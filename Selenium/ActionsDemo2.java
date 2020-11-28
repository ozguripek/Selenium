package Selenium;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");

		Actions a = new Actions(driver);
		//WebElementi bir degisken tipi sag taraftaki List bölümünü buldu 27 satirda orayi mause sürüyerek acti
		WebElement move=driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		
		//Arama bölümüne hello yazdi onu büyük harflerle yazdi click in klavyedeki benzeri keydown sonra
		//doubleclickle onu karaladi
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().
		keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		//1.
		//a.moveToElement(move).build().perform();
		//2.
		//contextClick sag klick demektir. List bölümüne geldi sag mause yapti ve aksiyona gecti
		a.moveToElement(move).contextClick().build().perform();


	}

}


/*
    System.out.println(driver.getTitle());
*/