package package1; 

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Sample3
{
	
	public static void main (String [] args)
	{
	
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://semantic-ui.com/modules/dropdown.html");
		
		Select Gender = new Select (driver.findElement (By.xpath(".//*[@id='example']/div[4]/div[1]/div[2]/div[2]/div[1]/div[3]/div[2]/div[1]")));
		
		Gender.selectByVisibleText("Male");
		
	}
	
		}
