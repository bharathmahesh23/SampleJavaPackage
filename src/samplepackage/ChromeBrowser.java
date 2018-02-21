package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ChromeBrowser {

	static String driverpath="F:\\eclipse\\jars\\Drivers\\";
	public WebDriver driver;
	@BeforeClass
	public void launchBrowser(){
		System.out.println("launching browser");
		System.setProperty("webdriver.chrome.driver", driverpath+"chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void pageTitleInBrowser(){
		
		driver.navigate().to("https://www.google.com/");
		String pageTitle=driver.getTitle();
		System.out.println("page title: - "+pageTitle);
		Assert.assertTrue(pageTitle.equalsIgnoreCase("Google"),"page title doesn't match");
	}
	@AfterClass
	public void tearDown(){
		if(driver!=null){
			System.out.println("closing browser");
			driver.quit();
		}
	}
}
