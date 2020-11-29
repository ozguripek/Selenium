package Selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SayfalarArasiGecis {
	public static void main(String[] args) throws InterruptedException {
		// Bu bölümde 2 tane konu üzerine egiliyoruz...
		// 1. Give me the count of links on the page.--Toplam link sayisi
		// 2. Count of footer section----Footerdaki link sayisi

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");

		WebDriver driver = new ChromeDriver();

		driver.get("http://qaclickacademy.com/practice.php");

		// Ekrandaki link sayisini bulduruyor ve Konsola yazdiriyor size ile sayiyi
		// buluyoruz.
		System.out.println(driver.findElements(By.tagName("a")).size());

		// footer bölümündeki linklere foxus olmak istiyoruz.Footerin Id si -->
		// By.id("gf-BIG"
		// simdi driverimizdan bir subdriver olusturuyoruz. Bu bir WebElemnetdir.
		// Simdi hedefledigimiz seye ulastik footerdriverimizdaki link sayisini tagName
		// a yi aratarak bulabiliriz.
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());

		// 3-Footer bölümünde 4 coloumn var bunlarin icerisindeki link sayisini saymaca
		// Burada ilk yaptigimiz sey en alt coloumndaki en soldakinin link sayisini
		// bulmaca
		// SONUC OLARAK 5 ADET BULDU
		WebElement coloumndriver = footerdriver.findElement(By.xpath("//table[@class='gf-t']/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());

		// 4- click on each link in the coloumn and check if the pages are opening-
		for (int i = 1; i < coloumndriver.findElements(By.tagName("a")).size(); i++) {
			// coloumndriver.findElements(By.tagName("a")).get(i).click();-->Bu yeterli
			// degil gelistiriyoruz.
			// Keys.Control--->Ctrl Keys.Enter---->Enter tusunu birlestirip bir kisa yol
			// olusturdu
			// Bunu bir stringde tutdu artik bu bir yeni sekme aparti gibi kalip oldu
			// Sendkeyse yollayinca sanki klavyenin tuslarina ayni anda cökmüs gibi tepki
			// veriyor
			String clickonlinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
			// Yeni sekmeleri actik
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);

		} // opens all the tabs
		Set<String> abc = driver.getWindowHandles();// 4
		Iterator<String> it = abc.iterator();

		while (it.hasNext()) {
			// 4 sayfayi yukarida actik burada teker teker saydayi öne getiriyor ve sayfa
			// adini yazdiriyor
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());

		}

	}

}
