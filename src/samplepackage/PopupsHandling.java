package samplepackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PopupsHandling {
	@Test
	public void driver() throws Exception{
	System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\jars\\geckodriver-v0.11.1-win64\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	/*driver.get("file:///F:/java/Alertsample.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	alert.accept();
	*/
	
	driver.get("file:///F:/java/ALerts2.html");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
	Alert alert=driver.switchTo().alert();
	driver.switchTo().alert().sendKeys("Hello");
	Thread.sleep(2000);
	alert.accept();
	System.out.println(alert.getText());
	
	
	}	
}
