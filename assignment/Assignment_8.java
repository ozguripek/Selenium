package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_8 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("ind");

		Thread.sleep(2000);

		/*
		 * driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
		 * System.out.println(driver.findElement(By.id("autocomplete")).getAttribute(
		 * "value"));
		 */

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String script = "return document.getElementById(\"autocomplete\").value;";
		String text = (String) js.executeScript(script);
		// System.out.println(text);
		
		int i = 0;

		while (!text.equalsIgnoreCase("INDIA")) {
			i++;
			System.out.println(i);
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
			text = (String) js.executeScript(script);
			System.out.println(text);
			if (i > 10) {
				break;
			}

		}

		if (i > 10) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element  found");
		}

	}

}
