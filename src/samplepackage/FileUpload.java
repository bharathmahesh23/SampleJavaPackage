package samplepackage;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\eclipse\\jars\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.guru99.com/become-an-instructor.html");
		Thread.sleep(2000);
		//int size=driver.findElements(By.tagName("iframe")).size();
		//System.out.println("frames count"+size);
		driver.switchTo().frame("JotFormIFrame-71343386835462");
		System.out.println("we are switching to iframe");
		driver.findElement(By.id("input_1")).sendKeys("Mahesh");
		driver.findElement(By.id("input_2")).sendKeys("roambitesting07@gmail.com");
		driver.findElement(By.id("input_3")).sendKeys("AutoIT in selenium");
		Thread.sleep(2000);
		//driver.findElement(By.xpath(".//*div[@class='qq-upload-button']/div/input")).click();
		//driver.findElement(By.xpath(".//*[@id='cid_7']/div/div/div/div[3]/input")).click();
		driver.findElement(By.cssSelector("input[multiple=multiple]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("F:\\eclipse\\AutoIT\\FileUpload.exe");
		driver.findElement(By.id("input_5")).click();
		driver.close();

	}

}
