package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Hook;

public class ValidationPage {

	public ValidationPage() {
		PageFactory.initElements(Hook.driver, this);
	}

	@FindBy(id="SubHeadJrney")
	private WebElement ValidatePage;

	public WebElement getValidatePage() {
		return ValidatePage;
	}

}
