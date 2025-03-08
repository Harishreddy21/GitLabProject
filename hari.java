package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Adactin {

	public static void main(String[] args) throws InterruptedException {
		  WebDriver driver= new ChromeDriver();					
		  driver.manage().window().maximize();
		  driver.get("http://www.adactin.com/HotelApp/index.php");
	       Thread.sleep(2000);
           driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[7]/td/a")).click();
           Thread.sleep(2000);
           driver.findElement(By.id("username")).sendKeys("vengat16");
           Thread.sleep(2000);
           driver.findElement(By.id("password")).sendKeys("Karthick");
           Thread.sleep(2000);
           driver.findElement(By.id("re_password")).sendKeys("Karthick");
           Thread.sleep(2000);
           driver.findElement(By.id("full_name")).sendKeys("Karthick");
           Thread.sleep(2000);
           driver.findElement(By.id("email_add")).sendKeys("Karthick@gmail.com");
           Thread.sleep(2000);
           driver.findElement(By.id("tnc_box")).click();
           Thread.sleep(2000);
           driver.findElement(By.id("Submit")).click();
	
	
	
	
	
	
	
	
	
	
	
	}

}
