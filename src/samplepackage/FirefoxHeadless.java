package samplepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FirefoxHeadless {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\jars\\geckodriver-v0.11.1-win64\\New folder\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"F:\\indeed\\logfile.txt");
		
		//set firefox Headless mode as true
		FirefoxOptions options=new FirefoxOptions();
		options.setHeadless(true);
		
		WebDriver driver=new FirefoxDriver(options);
		driver.get("http://www.google.com");
		System.out.println("page title is -"+ driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	   Thread.sleep(3000);
			System.out.println("Total results -"+driver.findElement(By.id("resultStats")).getText());
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				FileUtils.copyFile(file, new File("F:\\indeed\\headless.png"));
			}catch(IOException e){
				e.getStackTrace();
			}
			driver.close();
			
	
		
		
	}
}
