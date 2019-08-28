//package qa_sandbox_test.Pages;
//
//import java.net.MalformedURLException;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.Test;
//
///**
// * NOTE: Using and older version for a chrome driver will open 2 tabs, one with
// * empty "data;" - Source:
// * https://stackoverflow.com/questions/37159684/chrome-opens-with-data-with-selenium
// *
// * @author Elkhar
// *
// */
//public class DriverClass {
//
//	protected WebDriver driver;
//
//	protected WebDriver setupChrome() throws MalformedURLException {
//
//		System.setProperty("webdriver.chrome.driver", "src/test/resources/data/chromedriver.exe");
//		driver = new ChromeDriver();
//
//		return driver;
//	}
//
//	public WebDriver setupFirefox() throws MalformedURLException {
//		System.setProperty("webdriver.gecko.driver", "src/test/resources/data/geckodriver.exe");
//		driver = new FirefoxDriver();
//		return driver;
//	}
//
//	public void initDrivers(String browser) throws MalformedURLException {
//		if (browser.equals("CHROME")) {
//			setupChrome();
//		} else {
//			setupFirefox();
//		}
//
//	}
//
//}
