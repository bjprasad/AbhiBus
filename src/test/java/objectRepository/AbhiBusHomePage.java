package objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepDefinitions.Hook;

/**
 * @author user
 *
 */
public class AbhiBusHomePage {

	public AbhiBusHomePage() {
		
		PageFactory.initElements(Hook.driver, this);
	}
	@FindBy(id="source")
	private WebElement SrcLocation;
	
	@FindBy(id="destination")
	private WebElement DesLocation;
	
	@FindBy(id="datepicker1")
	private WebElement PickDate;
	
	@FindBy(xpath="//div[@id=\"tomorrowdiv\"]")
	private WebElement SelectDate;

	public WebElement getSrcLocation() {
		return SrcLocation;
	}

	public WebElement getDesLocation() {
		return DesLocation;
	}

	public WebElement getPickDate() {
		return PickDate;
	}

	public WebElement getSelectDate() {
		return SelectDate;
	}
	
	@FindBy(xpath="//a[@title=\"Search Buses\"]")
	private WebElement SearchBuses;
	
	public WebElement getSearchBuses() {
		return SearchBuses;
	}
}
