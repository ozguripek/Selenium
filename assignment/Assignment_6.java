package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_6 {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		// birincisi icin 
		driver.findElement(By.xpath("//input[@value='option1']")).click();
		
		// ikinci icin
		
		String opt=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label")).getText();// "option1"		
		//WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		//Select s=new Select(dropdown);
		
		//veya
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(opt);

		// 3.
	    driver.findElement(By.name("enter-name")).sendKeys(opt);

	    //4.
	    driver.findElement(By.id("alertbtn")).click();

	    String text=  driver.switchTo().alert().getText();

	    if(text.contains(opt)){

	    	System.out.println("Alert message success");

	     }

	     else {

	    	 System.out.println("Something wrong with execution");
	    
	     }

	}		
		
}

