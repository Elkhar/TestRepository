package qa_sandbox_test.Pages;

import org.openqa.selenium.WebElement;

public class UseCasesPage {
	public WebElement createUseCase;
	public static WebElement title;
    public WebElement description;
    public WebElement expectedResult;
    public WebElement useCase;
    public WebElement submit;
    
    public WebElement getTitle() {
		return title;
	}

	public void setTitle(WebElement title) {
		this.title = title;
	}

	public WebElement getDescription() {
		return description;
	}

	public void setDescription(WebElement description) {
		this.description = description;
	}

	public WebElement getExpectedResult() {
		return expectedResult;
	}

	public void setExpectedResult(WebElement expectedResult) {
		this.expectedResult = expectedResult;
	}

	public WebElement getUseCase() {
		return useCase;
	}

	public void setUseCase(WebElement useCase) {
		this.useCase = useCase;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}

    
	public WebElement getCreateUseCase() {
		return createUseCase;
	}

	public void setCreateUseCase(WebElement createUseCase) {
		this.createUseCase = createUseCase;
	}
	
}
