package one;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
public class NewTest {
	
	public static WebDriver driver;
	
	@BeforeTest
	public void beforetest1() throws InterruptedException
	{
		
		 System.out.println("in beforetest");
		 driver = new FirefoxDriver();

		 System.out.println("going to open google web page");
		 driver.get("http://google.co.in");
		  Thread.sleep(10000);
	}
/*	
  @Test
  public void test1() throws InterruptedException {
	  
	  System.out.println("testing...");
	 // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Cheese");   
	 // Thread.sleep(10000);
	  
	  driver.findElement(By.id("lst-ib1")).sendKeys("India");

	  Thread.sleep(7000);
	  driver.findElement(By.name("btnG")).click();
	  Thread.sleep(7000);
	  
  }
  */
  @Test(invocationCount = 1)
  public void tes() throws InterruptedException
  {

	  System.out.println("going to click search text box");
	  driver.findElement(By.id("lst-ib")).sendKeys("India");
	  Thread.sleep(7000);
	  	  
	  System.out.println("going to hit button");
	  driver.findElement(By.name("btnG")).click();
	  Thread.sleep(7000);
	  
	  
	//  driver.
	  
  }
 
 @AfterTest
 public void after()
 {
	 
	 driver.quit();
 }
 
}
