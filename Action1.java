package Day11;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.WebElement;		
import org.openqa.selenium.chrome.ChromeDriver;		
import org.openqa.selenium.interactions.Actions;	
public class Action1 {

	public static void main(String[] args) throws InterruptedException					
    {		
			
        WebDriver driver= new ChromeDriver();					
        driver.get("http://demo.guru99.com/test/drag_drop.html");					
        
		    		
       	WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
        	
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));
        WebElement text=driver.findElement(By.xpath("//*[@id=\"g-mainbar\"]/div/div/div/div/div/div/h2"));
        		
        
        Actions act=new Actions(driver); 
            
        act.doubleClick(text).build().perform();
        Thread.sleep(3000);
        act.contextClick(text).build().perform();
        Thread.sleep(3000);
        act.dragAndDrop(From, To).build().perform();
        Thread.sleep(3000);
       
      driver.quit();
} 
		

}
