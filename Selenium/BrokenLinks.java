package Selenium;

import java.io.IOException;

import java.net.HttpURLConnection;

import java.net.MalformedURLException;

import java.net.URL;

import java.net.URLConnection;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.asserts.SoftAssert;

public class BrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {



		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");

		WebDriver driver = new ChromeDriver();

		// broken URL

		// Step 1 - IS to get all urls tied up to the links using Selenium

		// Step 2 - Java methods will call URL's and gets you the status code

		// Step 3 - if status code >400 then that url is not working-> link which tied to url is
		// broken

		// a[href*="soapui"]'

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		
		//Bunu yeni ögrendik, programin hatayi tespit edip devam etmesini sagliyor

		SoftAssert a = new SoftAssert();
		
		//Herbir links elemanini bir linke atiyor. yani döngü bir defa dönüyor

		for (WebElement link : links){

			String url = link.getAttribute("href");

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();

			conn.setRequestMethod("HEAD");

			conn.connect();

			int respCode = conn.getResponseCode();

			System.out.println(respCode);
			
			//parantezin solundaki sart saglanmaz ise sagdaki mesaji kaydediyor

			a.assertTrue(respCode < 400, "The link with Text" + link.getText() + " is broken with code" + respCode);

		}
		//hepsini degerlendiriyor

		a.assertAll();

	}

	private static Object getReturnCode(WebElement link) {



		return null;

	}

}