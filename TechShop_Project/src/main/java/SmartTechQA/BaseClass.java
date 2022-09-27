package SmartTechQA;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.smarttechqa.com/login");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}


