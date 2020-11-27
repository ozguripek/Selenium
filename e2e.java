import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {
	public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver","//Users//imac//Documents//Chrome-Driver//chromedriver");
		
			WebDriver driver=new ChromeDriver();			
			driver.get("http://spicejet.com");
			
			driver.findElement(By.id("ct100 mainContent rbtnl Trip 0")).click();// One way radio button
			
			driver.findElement(By.id("ct_100_mainContent_ddl_originStation1_CTXT")).click();// Departure Dropddown ac 
			
			driver.findElement(By.xpath("*//a[@value='DEL']")).click();// DEl sehrini sec
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//div[@id='glsct100_mainContent_ddl_originStation1_CTNR']//a[@value='MAA']")).click();//önce arrival dropdown ini actik, sonra MAA sehrini sectik
			
			driver.findElement(By.cssSelector(".ul-state-default.ui-state-highlight.ui-state-active")).click();// takvimde icinde bulunulan günü secmek
			
			// dönüs tarihi takvimi Round trip butonuna tiklayinca acildigi icin renk-stil kontrolü yapmak icin 
			if(driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){
				
				System.out.println("its disabled");
				Assert.assertTrue(true);
			}
	
			else{
				Assert.assertTrue(false);
	
			}
			driver.findElement(By.cssSelector("input[id*='SeniorCitizendiscount']")).click();// senior citizent butonuna tikladik
			
			driver.findElement(By.id("divpaxinfo")).click();//passanger dropdown ina tikladik
			
			for(int i=1;i<5;i++){

			driver.findElement(By.id("hrefIncAdt")).click();// 

			}

			driver.findElement(By.id("btnclosepaxoption")).click();

			Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");//5 esit olup omadigi kontrolü

			System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
			
			driver.findElement(By.cssSelector("#ct100_mainContent_btn_FindFlights")).click();//search butonuna bastik
			//driver.findElement(By.cssSelector("input[value='Search']")).click();
			//driver.findElement(By.xpath("//input[@value='Search']")).click();
		}
			
	}


