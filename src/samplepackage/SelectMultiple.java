package samplepackage;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\jars\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("F:\\java\\sample.html");
		WebElement element=driver.findElement(By.name("Mobdevices"));
		Select se=new Select(element);
		/*List<WebElement> allOptions=se.getOptions();
		for(WebElement webEle : allOptions)
		{
			System.out.println(webEle.getText());
		}
		*/
		
		se.selectByVisibleText("Nokia");
		se.selectByVisibleText("HTC");
		WebElement firstOption=se.getFirstSelectedOption();
		System.out.println("the first selected option is:"+firstOption.getText());
		/*List<WebElement>allSelectedOptions=se.getAllSelectedOptions();
		for(WebElement webEle : allSelectedOptions)
		{
			System.out.println("you have selected::"+webEle.getText());
		}
		//System.out.println("sample message");
         */
	}

}
