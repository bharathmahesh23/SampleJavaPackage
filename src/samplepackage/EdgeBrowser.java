package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeBrowser {

	String driverpath="F:\\eclipse\\jars\\Drivers\\";
	public WebDriver driver;
	@Test(priority=1)
	public void launchBrowser(){
		System.out.println("launching micrososft edge browser");
		System.setProperty("webdriver.edge.driver", driverpath+"MicrosoftWebDriver.exe");
		driver=new EdgeDriver();
		
	}
	@Test(priority=2)
	public void openEdgeBrowser(){
		driver.navigate().to("https://www.gmail.com/");
	}
	@Test(priority=3)
	public void closeBrowser(){
		if(driver!=null){
			driver.close();
		}
	}
	
}
