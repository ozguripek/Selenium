import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","//Users//imac//Documents//Chrome-Driver//chromedriver");

		
		/*
		WebDriver driver=new ChromeDriver();
		//driver.get("http://google.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//************
		driver.navigate().to("http://yahoo.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.close(); //Current browser
		driver.quit(); //All browers
		//*************
		//id üzerinden gittik ama bu her seferinde olmaz
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("erolertekinn.66");;
		//*************
		*/
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		//driver.findElement(By.id("email")).sendKeys("erolertekinn.66");
		
		//driver.findElement(By.name("pass")).sendKeys("12345678");
		driver.findElement(By.linkText("Şifreni mi Unuttun?")).click();
		
	}

}
