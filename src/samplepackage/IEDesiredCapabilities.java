package samplepackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class IEDesiredCapabilities {

	public static void main(String[] args) {
		
		DesiredCapabilities capabilities=DesiredCapabilities.internetExplorer();
		//capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		//capabilities.setCapability(CapabilityType.BROWSER_NAME,"IE");
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		System.setProperty("webdriver.ie.driver", "F:\\eclipse\\jars\\Drivers\\IEDriverServer.exe");
		WebDriver IEDriver=new InternetExplorerDriver();
		IEDriver.manage().window().maximize();
		IEDriver.get("http://www.gmail.com");
		
		IEDriver.quit();

	}

}
