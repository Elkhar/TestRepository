package qa_sandbox_test;

import java.net.MalformedURLException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import net.bytebuddy.utility.RandomString;
import qa_sandbox_test.Pages.HomePage;
import qa_sandbox_test.Pages.LoginPage;
import qa_sandbox_test.Pages.UseCasesPage;

public class BaseTest {

//	final String LOGIN_PAGE_URL = "https://qa-sandbox.apps.htec.rs/";
//	WebElement userName;
//	WebElement passWord;
//	WebElement loginButton;
//	WebElement submitButton;
//	protected WebDriver driver;
	LoginPage login = new LoginPage();
	HomePage home = new HomePage();
	UseCasesPage useCase = new UseCasesPage();
	public WebDriver driver;
	public String chrome = "CHROME";
	String text = "Please include an '@' in the email address. 'test' is missing an '@'";
	String VALID_EMAIL = "filipstajk@gmail.com";
	String VALID_PASSWORD = "Test";
	String INVALID_EMAIL = "test";
	String INVALID_PASSWORD = "test";

	int random = (int) (Math.random() * 20 + 1);
	String RandomTitle = "testTitle" + "" + RandomStringUtils.randomAlphabetic(random);
	String RandomDescription = "testDescription" + "" + RandomStringUtils.randomAlphabetic(random);
	String RandomExpectedResult = "testExpectedResult" + "" + RandomStringUtils.randomAlphabetic(random);
	String RandomUseCase = "testUseCase" + "" + RandomStringUtils.randomAlphabetic(random);


	protected void clickUseCases() {
		home.testCases = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[2]/div/a/div"));
		home.testCases.click();
	}

	protected void clickAddUseCases() {
		useCase.createUseCase = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/a[2]"));
		useCase.createUseCase.click();
	}
	
		
//	protected void clickTitle(String title) {
//		useCase.title = driver.findElement(By.name("title"));
//		useCase.title.sendKeys(title);
//	}
//	protected void clickDescription(String descritpion) {
//		useCase.description = driver.findElement(By.name("description"));
//		useCase.description.sendKeys(descritpion);
//	}
//	protected void clickExpectedResult(String ExpectedResult) {
//		useCase.expectedResult = driver.findElement(By.name("expected_result"));
//		useCase.expectedResult.sendKeys(ExpectedResult);
//	}
	protected void clickUseCase() {
		useCase.useCase = driver.findElement(By.xpath("//*[@id=\"stepId\"]"));
	}

	protected Integer numberOfCharacters(String title) {
		Integer numberOfCharacters = title.replace(" ", "").length();
		return numberOfCharacters;
	}

	protected WebDriver setupChrome() throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "src/test/resources/data/chromedriver.exe");
		driver = new ChromeDriver();

		return driver;
	}

	public WebDriver setupFirefox() throws MalformedURLException {
		System.setProperty("webdriver.gecko.driver", "src/test/resources/data/geckodriver.exe");
		driver = new FirefoxDriver();
		return driver;
	}

	public void initDrivers(String browser) throws MalformedURLException {
		if (browser.equals("CHROME")) {
			setupChrome();
		} else {
			setupFirefox();
		}
	}

	public void setUp(String browser) throws MalformedURLException {
		initDrivers(browser);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(login.LOGIN_PAGE_URL);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		login.loginButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div/a[2]"));
		login.loginButton.click();
		login.userName = driver.findElement(By.name("email"));
		login.passWord = driver.findElement(By.name("password"));
		login.submitButton = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/form/button"));

	}
	
	public void setUpTestCases() throws MalformedURLException {
		useCase.title = driver.findElement(By.name("title"));
		useCase.description = driver.findElement(By.name("description"));
		useCase.expectedResult = driver.findElement(By.name("expected_result"));
		useCase.useCase = driver.findElement(By.xpath("//*[@id=\"stepId\"]"));
	}


	@AfterMethod
	public void tearDown() {
		driver.close();

	}

}
