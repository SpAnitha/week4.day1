package week4.day1;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LearnDropdown {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		WebElement industryDropdown=driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select industrySelect=new Select(industryDropdown);
		industrySelect.selectByValue("IND_SOFTWARE");
		List<WebElement>industryDropdownOptions=industrySelect.getOptions();
		for(WebElement option:industryDropdownOptions) {
			System.out.println(option.getText());
		}

		WebElement ownershipDropDown= driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipSelect=new Select(ownershipDropDown);
		ownershipSelect.selectByIndex(ownershipSelect.getOptions().size()-1);
		WebElement generalDropDown= driver.findElement(By.id("createLeadForm_generalStateProvinceGeo"));
		Select stateselect=new Select(generalDropDown);
		stateselect.selectByIndex(2);
        driver.findElement(By.className("smallSubmit")).click();

	}
}