package week4.day1;

import java.time.Duration;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlRows {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get(" https://html.com/tags/table/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement>TogetRows = driver.findElements(By.xpath("(//table)[1]//tr"));
		int rowcount=TogetRows.size();
		System.out.println(rowcount);
		System.out.println(TogetRows.get(0).getText());
		System.out.println("--------------------");
		System.out.println(TogetRows.get(1).getText());
		
	}
}
