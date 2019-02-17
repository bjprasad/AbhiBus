package stepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import objectRepository.AbhiBusHomePage;

public class AbhiBusHomePageSteps {

	static WebDriver driver;
	AbhiBusHomePage ABHP = new AbhiBusHomePage();
	
	@Given("The user is in abhi bus home page")
	public void the_user_is_in_abhi_bus_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Hook.driver.get("https://www.abhibus.com/");
	}

	@When("The user gives journey detals {string}, {string}")
	public void the_user_gives_journey_detals(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Robot RC = new Robot();
		
		ABHP.getSrcLocation().sendKeys(arg1);
		
		Thread.sleep(4000);
		
		RC.keyPress(KeyEvent.VK_ENTER);
		RC.keyPress(KeyEvent.VK_ENTER);
		
		Thread.sleep(4000);
		
		ABHP.getDesLocation().sendKeys(arg2);
		
		Thread.sleep(4000);
		
		RC.keyPress(KeyEvent.VK_ENTER);
		RC.keyPress(KeyEvent.VK_ENTER);
		
		ABHP.getPickDate().click();
		ABHP.getSelectDate().click();
	}

	@When("The user submits the search")
	public void the_user_submits_the_search() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		
		Thread.sleep(4000);
		ABHP.getSearchBuses().click();
	}


}
