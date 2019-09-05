package chromeSample;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class ProxySettings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Proxy p=new Proxy();
		p.setHttpProxy("localhost:7777");
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(CapabilityType.PROXY, p);
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Administrator\\\\Documents\\\\Selenium Project\\\\Selenium Drivers\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cap);
		
		
		
		
		
	}

}
