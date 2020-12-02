package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment_7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement table= driver.findElement(By.xpath("//table[@id='product']"));
		int rowCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr")).size();
		System.out.println("The number of the rows: "+rowCount);
		
		int columnCount=table.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size();
		System.out.println("The number of the colums: "+columnCount);
		
		
		for(int i=0; i<columnCount;i++) {
			String value=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td")).get(i).getText();
			System.out.println("Second row, "+(i+1)+". colum's value: "+value);
		}
		
		/*List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println(secondrow.get(0).getText());
		System.out.println(secondrow.get(1).getText());
		System.out.println(secondrow.get(2).getText());*/		
		

	}

}
