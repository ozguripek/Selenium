package Selenium;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.os.WindowsUtils;
import org.apache.commons.io.FileUtils;

public class Miscelleanous {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		WindowsUtils.killByName("excel.exe");

		// driver.manage().deleteCookieNamed("sessionKey");

		// click on any link
		// login page- verify login url

		/*
		 * driver.get("http://google.com");
		 * 
		 * File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 * FileUtils.copyFile(src,new File("C:\\Users\\rahul\\screenshot.png"));
		 */

	}

}
