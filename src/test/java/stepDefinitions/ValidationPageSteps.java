package stepDefinitions;

import org.junit.Assert;

import cucumber.api.java.en.Then;
import objectRepository.ValidationPage;

public class ValidationPageSteps {

	@Then("The user should see the Leaving from  and Going to")
	public void the_user_should_see_the_Leaving_from_and_Going_to() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		ValidationPage VP = new ValidationPage();
		//Assert.assertTrue(VP.getValidatePage().is);
		System.out.println(VP.getValidatePage().getText());
	}


}
