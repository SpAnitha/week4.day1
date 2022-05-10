package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Chitt {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get(" https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("navbtn_stockmarket")).click();
		driver.findElement(By.linkText("NSE Bulk Deals")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='table table-bordered table-condensed table-striped']//th"));
		new ArrayList<String>();
		int rowCount = findElements.size();
		System.out.println(rowCount);
		for (int i = 1; i <=rowCount; i++) {
			String text = driver.findElement(By.xpath("//table[@class='table table-bordered table-condensed table-stripped']///tr["+i+"]//th[1]")).getText();
			System.out.println("security name "+text);
			System.out.println("security name");
			Set<String> set=new LinkedHashSet<String>();
			if(set.size()<findElements.size()) {
				System.out.println("the dupliacte elements are : " + set );
			}		
		}		
	}
}
