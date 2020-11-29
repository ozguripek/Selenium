package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TableExercises {
	public static void main(String[] args) {
	
		int sum=0;
		System.setProperty("webdriver.chrome.driver", "//Users//imac//Documents//Chrome-Driver//chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.cricbuzz.com/live-cricket-scorecard/18970/pak-vs-sl-2nd-t20i-pakistan-v-sri-lanka-in-uae-2017");

		//sitede tabloyu bul
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		//tablodaki satir sayosoni bul
		//Bunu kullanmadik
		int rowcount= table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		
		//satirdaki 3.sütun(hücre) sayisi(kac tane var)		
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		
		//(son ikisi farkli bilgi oldugu icin ve onlari almak istemedigimizden count-2 yaptik
		//tüm satirlarin 3. sütunlarini dolas ve texti al
		for(int i=0;i<count-2;i++){
			String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
			int valueinteger=  Integer.parseInt(value);//stringi integere cevir
			sum=sum+valueinteger;//topla
		}
		//System.out.println(sum);
		
		//sondan bir önceki satirin ikinci sütununa from sibling to sibling özelligi ile git
		String Extras=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int extrasValue=Integer.parseInt(Extras);//stringi integere cevir
		int TotalSumValue=sum+extrasValue;//önceki toplan ile topla
		System.out.println(TotalSumValue);

		//son satirin ikinci sütununa from sibling to sibling özelligi ile git
		String ActualTotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int ActualTotalVAlue=Integer.parseInt(ActualTotal);//stringi integere cevir
		
		//toplamlari karsilastir
		if(ActualTotalVAlue==TotalSumValue){
			System.out.println("Count Matches");
		}
		else{
		System.out.println("count fails");
		}
	}

}
