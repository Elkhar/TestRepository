package qa_sandbox_test;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;


public class LoginTest extends BaseTest{

	  @Test
	  public  void  correctCredentialsTest() throws MalformedURLException {
		  setUp(chrome);
		  login.userName.sendKeys(VALID_EMAIL);
		  login.passWord.sendKeys(VALID_PASSWORD);
		  login.submitButton.click();
		  String DASHBOARD_TEXT = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/h5/b")).getText();
		  Assert.assertEquals(DASHBOARD_TEXT, "Dashboard");
	  }
	  
	  @Test
	  public  void  emptyCredentialsTest() throws MalformedURLException {
		  setUp(chrome);
		  login.userName.clear();
		  login.passWord.clear();
		  login.submitButton.click();
		  String EMAIL_ERROR = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[1]/div")).getText();
		  String PASSWORD_ERROR = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div/form/div[2]/div")).getText();
		  Assert.assertEquals(EMAIL_ERROR, login.emailRequired);
		  Assert.assertEquals(PASSWORD_ERROR, login.passwordRequired);
	  }
}
