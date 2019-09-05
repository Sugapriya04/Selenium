package chromeSample;

import org.openqa.selenium.chrome.ChromeOptions;

public class FramesSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Documents\\Selenium Project\\Selenium Drivers\\Chrome\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		
		//check bootstrap login
		
		
	}

}
