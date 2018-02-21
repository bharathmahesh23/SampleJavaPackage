package samplepackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class ChromeHeadless {

public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\eclipse\\jars\\Drivers\\chromedriver.exe");
		//System.setProperty(ChromeDriver.SystemProperty.,"true");
		//System.setProperty(ChromeDriver.SystemProperty.BROWSER_LOGFILE,"F:\\indeed\\logfile.txt");
		
		//set firefox Headless mode as true
		ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriver driver=new ChromeDriver(options);
		driver.get("http://www.google.com");
		System.out.println("page title is -"+ driver.getTitle());
		
		driver.findElement(By.name("q")).sendKeys("Selenium webdriver");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		
	   Thread.sleep(3000);
			System.out.println("Total results -"+driver.findElement(By.id("resultStats")).getText());
			File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try{
				FileUtils.copyFile(file, new File("F:\\indeed\\headless1.png"));
			}catch(IOException e){
				e.getStackTrace();
			}
			driver.close();
			
	
		
		
	}
}

