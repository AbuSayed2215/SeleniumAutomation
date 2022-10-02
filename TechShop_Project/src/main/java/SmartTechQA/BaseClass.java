package SmartTechQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.smarttechqa.utils.Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public static WebDriver driver;

	
	public static void main(String[] args) throws InterruptedException {
		
		BaseClass.SetUp();
		
	}
		
		
			
	public static void SetUp() throws InterruptedException	{
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.smarttechqa.com/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(5000);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.navigate().to("https://www.smarttechqa.com/");
		
		driver.findElement(By.xpath("//button[@class='p-2 btn btn-outline-success']")).click();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[@class='active navbar-brand']")).click();
		
		driver.findElement(By.xpath("//a[@href='/login']")).click();
		
		driver.findElement(By.id("email")).sendKeys("abusayed@gmail.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		driver.findElement(By.xpath("//a[@href='/cart']")).click();
		Utilities.getExplicitWait(driver.findElement(By.linkText("Go Back")), 20);
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
	

