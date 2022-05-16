package week4.day1;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnWebElement {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("MDU");
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("TPJ");
		driver.findElement(By.id("chkSelectDateOnly")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr"));
		new ArrayList<String>();
		int rowCount = findElements.size();
		System.out.println(rowCount);
		for (int i = 1; i <=rowCount; i++) {
			String text = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[2]")).getText();
			String text2 = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]//td[1]")).getText();
			System.out.println("train Name "+text+"Train Number "+text2);
			System.out.println(text);

		}

	}
}