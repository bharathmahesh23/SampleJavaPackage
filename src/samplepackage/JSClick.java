package samplepackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JSClick {

	WebDriver driver;
	@Test
	public void testClick() throws Exception{
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\jars\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.navigate().to("http://www.amazon.com/");
		WebElement searchbox=driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("Mobiles");
		WebElement goButton=driver.findElement(By.cssSelector("input[value=Go]"));
		javaScriptClick(goButton);
		
	}
	public void javaScriptClick(WebElement element) throws Exception{
		
		try{
			
			if(element.isEnabled() && element.isDisplayed())
			{
				System.out.println("clicking on element with using java script click");
				((JavascriptExecutor)driver).executeScript("arguments[0].click()",element);
			}else{
				System.out.println("unable to click on element");
			}
		}catch(StaleElementReferenceException e){
			System.out.println("Element is not attached to the page document "+e.getStackTrace());
		}
		
		catch(NoSuchElementException e){
			System.out.println("element was not found in DOM "+e.getStackTrace());
		}
		catch(Exception e){
			System.out.println("unable to click on element "+e.getStackTrace());
		}
	}
}
