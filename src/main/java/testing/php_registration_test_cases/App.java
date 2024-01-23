package testing.php_registration_test_cases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//System.setProperty("webdriver.chrome.driver", "D:\\Chandan\\Softwares\\Chrome\\chromedriver-win64\\chromedriver.exe");
    	WebDriverManager.chromedriver().setup();
    	
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.get("http://13.232.161.2:8080/register.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		System.out.println("Test Scripts Started");
		System.out.println("Sign UP Process is taking place");
		//Signing UP
		driver.findElement(By.name("username")).sendKeys("mentorbaba");
		Thread.sleep(2000);
				
		driver.findElement(By.name("password")).sendKeys("mentorbaba123");
		Thread.sleep(2000);
				
		driver.findElement(By.name("email")).sendKeys("mentorbaba123@gmail.com");
		Thread.sleep(2000);
				
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		

		
		System.out.println("Test Scripts Ended");
		driver.quit();
		
		
		
    }
}
