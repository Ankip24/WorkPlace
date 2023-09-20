package PassIndiaDemo.PassIndiaDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	static WebDriver driver;
	public static void main(String[] args) throws  InterruptedException{
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\avina\\OneDrive\\SELENIUM\\msedgedriver.exe");
		driver=new EdgeDriver();

		driver.get("https://www.facebook.com/forms");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*driver.findElement(By.name("email")).sendKeys("AVINASH");
		Thread.sleep(5000);
		driver.findElement(By.name("pass")).sendKeys("#@Avinash123");
		Thread.sleep(2000);
		driver.findElement(By.id("loginbutton")).click(); 
		
		driver.navigate().back();
		Thread.sleep(2000);*/

		
		driver.findElement(By.xpath("//a[@role='button']")).click();
		Thread.sleep(2000);
		
		//for page scroll down
		JavascriptExecutor j=((JavascriptExecutor)driver);
		j.executeScript("scroll(0,2000)");
		Thread.sleep(2000);
		
		
		//for page scroll up
		JavascriptExecutor h=((JavascriptExecutor)driver);
		h.executeScript("scroll(0,-2000)");
		Thread.sleep(2000);
		
		/*Right shift
		JavascriptExecutor a=((JavascriptExecutor)driver);
		a.executeScript("scroll(-2000,0)");
		Thread.sleep(2000);*/
		
		/*left shift
		JavascriptExecutor a=((JavascriptExecutor)driver);
		a.executeScript("scroll(2000,0)");
		Thread.sleep(2000);*/
		
		driver.findElement(By.name("firstname")).sendKeys("abc");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("xyz");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("6733@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("6733@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("0204");
		Thread.sleep(2000);

		
		WebElement day=
		driver.findElement(By.xpath("//select[@id='day']"));
         Select a= new Select(day);
         a.selectByIndex(1);
         
         //a.selectByValue(null);
         //a.selectByVisibleText(null);
		
         WebElement month=
 		driver.findElement(By.xpath("//select[@id='month']"));
         Select b= new Select(month);
         b.selectByIndex(3);
         
         
         WebElement year=
        		 driver.findElement(By.xpath("//select[@id='year']"));
         Select c= new Select(year);
         c.selectByValue("1998");
         
 		driver.findElement(By.xpath("//input[@value='2']")).click();
 		Thread.sleep(2000);
 		driver.findElement(By.xpath("//button[@type='submit']")).click();
 		Thread.sleep(2000);


	}
}
