package SmartTechQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class GoogleSearch {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.google.com/");
		 driver.manage().window().maximize() ;
		 
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("zello");
		 
		 driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys(Keys.ENTER);
		 
		 driver.quit();
		
		}

}
