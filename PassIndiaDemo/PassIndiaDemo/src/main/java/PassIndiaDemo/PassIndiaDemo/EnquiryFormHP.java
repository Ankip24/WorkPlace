package PassIndiaDemo.PassIndiaDemo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EnquiryFormHP {
	
static WebDriver driver;
	
	public static void main(String[]args) throws InterruptedException  {
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\avina\\OneDrive\\SELENIUM\\msedgedriver.exe");
		
		
		driver = new EdgeDriver();
		driver.get("https://passport.quiestatechnologies.com/index.php");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);          //for Implicit WAITS
	    
	    
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys("avinash");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("aviansh@345");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("456556535548");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//select[@name='service_type']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//option[@value='New Passport']")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(2000);

	    

	  
	}
	
}
