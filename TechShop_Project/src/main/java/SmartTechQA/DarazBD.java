package SmartTechQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DarazBD {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver ();
		
		driver.get("https://www.daraz.com.bd/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("#q")).sendKeys("panjabi");
		
		driver.findElement(By.xpath("(//a[@class='grey'])[2]")).click();
		
		//driver.findElement(By.id("q")).sendKeys(Keys.ENTER);
	}
}
