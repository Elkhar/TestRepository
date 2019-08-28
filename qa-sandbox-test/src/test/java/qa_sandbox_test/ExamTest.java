package qa_sandbox_test;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

public class ExamTest extends BaseTest{
	   
	  

	  @Test
	  public  void  examTest() throws MalformedURLException {
		 setUp(chrome);
		 login.userName.sendKeys(VALID_EMAIL);
		  login.passWord.sendKeys(VALID_PASSWORD);
		  login.submitButton.click();	  
		  clickUseCases();
		  clickAddUseCases();
		  setUpTestCases();
		  
		  useCase.title.sendKeys("test");
		  useCase.description.sendKeys("test");
		  useCase.expectedResult.sendKeys("test");
		  useCase.useCase.sendKeys("test");

	  }
}
