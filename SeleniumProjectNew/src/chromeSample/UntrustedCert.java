package chromeSample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedCert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DesiredCapabilities cap=DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Administrator\\\\Documents\\\\Selenium Project\\\\Selenium Drivers\\\\Chrome\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(cap);

	}

}
