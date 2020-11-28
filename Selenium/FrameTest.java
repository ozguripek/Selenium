package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/droppable/");

		// Eger birden fazla iframe varsa bunu yazdirmak suretiyle anlariz ve müteakiben
		// istedigimiz iframe`e switch edebiliriz.
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		driver.switchTo().frame(0);

		// Genis ekranda bulamadi frame e gecis yaptik simdi frame icerisinde aksiyona
		// geciyoruz..
		// 1.
		// driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
		// Switch ederken vakte ihtiyaci var
		Thread.sleep(3000);
		// driver.findElement(By.id("draggable"));
		Actions a = new Actions(driver);

		WebElement source = driver.findElement(By.id("draggable"));

		WebElement target = driver.findElement(By.id("droppable"));

		// tutup birakma WebElement cinsinden 2 degisken aliyor bunlar baslama
		// noktasi-->varis noktasi
		a.dragAndDrop(source, target).build().perform();

		// Girmis oldugumuz framden genis ekrana gecis ve devaminda ekrandaki bir
		// noktaya Klik
		driver.switchTo().defaultContent();

		// sonra findElement de istedigini yap.

	}

}