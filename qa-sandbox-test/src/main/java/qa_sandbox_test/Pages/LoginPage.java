package qa_sandbox_test.Pages;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

/**
 * 
 * This class will store all the locators and methods for the Login page
 * 
 * @author Elkhar
 */
public class LoginPage {
    
	public String emailRequired = "Email field is required";
	public String passwordRequired = "Password is required";
	public final String LOGIN_PAGE_URL = "https://qa-sandbox.apps.htec.rs/";
	public WebElement userName;
	public WebElement passWord;
	public WebElement loginButton;
	public WebElement submitButton;
	public WebElement getUserName() {
		return userName;
	}
	public void setUserName(WebElement userName) {
		this.userName = userName;
	}
	public WebElement getPassWord() {
		return passWord;
	}
	public void setPassWord(WebElement passWord) {
		this.passWord = passWord;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public void setLoginButton(WebElement loginButton) {
		this.loginButton = loginButton;
	}
	public WebElement getSubmitButton() {
		return submitButton;
	}
	public void setSubmitButton(WebElement submitButton) {
		this.submitButton = submitButton;
	}

	
//	String EMAIL_ERROR = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[1]/div"))
//			.getText();
//	String PASSWORD_ERROR = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[2]/div"))
//			.getText();
//	protected static final String LOGIN_PAGE_URL = "https://qa-sandbox.apps.htec.rs/";
//
//	public WebDriver driver;
//	protected WebElement userName;
//	protected WebElement passWord;
//	private WebElement loginButton;
//	protected WebElement submitButton;
//
//	public void setUp(String browser) throws MalformedURLException {
//		initDrivers(browser);
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get(LOGIN_PAGE_URL);
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/a[2]"));
//		loginButton.click();
//		userName = driver.findElement(By.name("email"));
//		passWord = driver.findElement(By.name("password"));
//		submitButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/form/button"));
//		
//
//	}
//
//	@AfterMethod
//	public void tearDown() {
//		driver.close();
//	}

}
