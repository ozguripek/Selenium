package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_01 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/weborders/");
		driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_password']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_login_button']")).click();

		String str = driver.findElement(By.xpath("//div[@class='login_info']")).getText();

		// Assert.assertEquals(str, "Welcome, Tester!");

		Assert.assertTrue(str.contains("Welcome, Tester!"), "String doesn't exist.");

		driver.findElement(By.linkText("View all orders")).click();

		WebElement table = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
		int rowCount = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr")).size();
		System.out.println("old row :" + rowCount);
		System.out.println(rowCount);

		driver.findElement(By.linkText("Order")).click();

		Select product = new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
		product.selectByValue("ScreenSaver");

		WebElement wb = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='12';", wb);

		jse.executeScript("document.getElementById('ctl00_MainContent_fmwOrder_txtUnitPrice').value='40';");
		jse.executeScript("document.getElementById('ctl00_MainContent_fmwOrder_txtDiscount').value='25';");

		driver.findElement(By.xpath("//input[@value='Calculate']")).click();

		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']")).sendKeys("Ali Yilmaz");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox2']")).sendKeys("Ankara Blvd.");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox3']")).sendKeys("Seattle");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox4']")).sendKeys("Washington");
		driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox5']")).sendKeys("98105");

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_0")).click();
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1423142356788927");
		driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("08/27");

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		driver.findElement(By.linkText("View all orders")).click();

		
		int newRowCount = driver.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr")).size();
		System.out.println("new row :" + newRowCount);

		Assert.assertEquals(10, newRowCount);
		
		
		WebElement table2 = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']"));
		int columnCount = table2.findElements(By.xpath("//table[@id='ctl00_MainContent_orderGrid']/tbody/tr[2]/td")).size();
		System.out.println("The number of the colums: " + columnCount);
/*
		for (int i = 0; i < columnCount; i++) {
			String value = table2.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(i).getText();
			System.out.println("Second row, " + (i + 1) + ". colum's value: " + value);
		}
*/
		String textName = table2.findElements(By.tagName("tr")).get(1).findElements(By.tagName("td")).get(1).getText();
		
	
		//Assert.assertFalse(textName.equals("Ali Yilmaz"),"Eleman basariyla eklenmistir");	
		if ((textName.equals("Ali Yilmaz"))) {
			System.out.println("Eleman basariyla eklenmistir.");
		}else {
			System.out.println("Eleman basariyla eklenememistir.");
		}
	}
}
