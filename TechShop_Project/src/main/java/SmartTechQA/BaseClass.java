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
		
		driver.get("https://www.smarttechqa.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.xpath("//button[@class='p-2 btn btn-outline-success']")).click();
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.xpath("//a[@class='active navbar-brand']")).click();
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		driver.findElement(By.linkText("Go Back")).click();
	
		
		System.out.println(driver.getTitle());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();
		
	}
}


