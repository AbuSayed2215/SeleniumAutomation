package SmartTechQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPractice {
	public static WebDriver dv;
	public static void code() {
		WebDriverManager.chromedriver().setup();
		dv = new ChromeDriver();
		dv.manage().window().maximize();
		dv.manage().deleteAllCookies();
		dv.get("https://www.youtube.com/");
		dv.findElement(By.xpath("//img[@class='style-scope yt-img-shadow']")).click();
	}
public static void main(String[] args) {
	AutomationPractice.code();
}
}
