package samplepackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;





		public class AllLinks {
			public static void main(String[] args) {
				DesiredCapabilities capab = DesiredCapabilities.firefox();

	             capab.setCapability(FirefoxDriver.MARIONETTE,true);
	             
				System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\jars\\geckodriver-v0.11.1-win64\\New folder\\geckodriver.exe"); 
				System.setProperty(FirefoxDriver.SystemProperty.DRIVER_USE_MARIONETTE,"true");
				System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"F:\\indeed\\logs.txt");
				WebDriver driver=new FirefoxDriver();
				driver.navigate().to("https://www.facebook.com/");
				List<WebElement> list=driver.findElements(By.tagName("a"));
			    System.out.println("list size"+list.size());
			    
			    for(int i=0;i<list.size();i++)
			    {
			    
			           System.out.println(list.get(i).getAttribute("href"));
			    }
			    driver.close();
			   

			}
			
	}


