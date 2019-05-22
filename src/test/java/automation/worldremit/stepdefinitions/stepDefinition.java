package automation.worldremit.stepdefinitions;

import org.openqa.selenium.WebDriver;
import automation.worldremit.initialsetup.TestBase;
import automation.worldremit.initialsetup.TestNgRunner;
import automation.worldremit.pages.SendMoneyPage;
import automation.worldremit.pages.WorldRemitHomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


/**
 * The Class stepDefinition.
 */
public class stepDefinition extends TestBase {

	/** The driver. */
	WebDriver driver = getWebDriver();
	WorldRemitHomePage objWorldRemitHomePage;
	SendMoneyPage objSendMoneyPage;
	
	@Given("^I navigate to World Remit Hompage \"([^\"]*)\"$")
	public void i_navigate_to_World_Remit_Hompage(String arg1) throws Throwable {
		objWorldRemitHomePage = new WorldRemitHomePage(driver);	
		objWorldRemitHomePage.navigateToURL(arg1);
	}
	
	@Given("^I validate objects on World Remit Homepage$")
	public void i_validate_objects_on_Homepage() throws Throwable {
		objWorldRemitHomePage = new WorldRemitHomePage(driver);
		objWorldRemitHomePage.validateHomePageElements();
	}

	@Given("^I select send from country as \"([^\"]*)\"$")
	public void i_select_send_from_country_as(String arg1) throws Throwable {
		objWorldRemitHomePage = new WorldRemitHomePage(driver);
		objWorldRemitHomePage.selectSendFromCountry(arg1);
	}
	
	@Given("^I select language as \"([^\"]*)\"$")
	public void i_select_language_as(String arg1) throws Throwable {
		objWorldRemitHomePage = new WorldRemitHomePage(driver);
		objWorldRemitHomePage.selectLanguage(arg1);
	}
	
	@When("^I should verify user select Country as \"([^\"]*)\"$")
	public void i_should_verify_user_select_Country_as(String arg1) throws Throwable {
		objWorldRemitHomePage = new WorldRemitHomePage(driver);
		objWorldRemitHomePage.selectSendToCountry(arg1);
	}

	@When("^I start the money sending process$")
	public void i_start_the_money_sending_process() throws Throwable {
		objWorldRemitHomePage = new WorldRemitHomePage(driver);
		objWorldRemitHomePage.clickOnGetSatrted();
	}

	@Given("^I validate objects on Send Money Page$")
	public void i_validate_objects_on_send_money_page() throws Throwable {
		objSendMoneyPage = new SendMoneyPage(driver);
		objSendMoneyPage.validateSendMoneyPageElements();
	}
	
	@Then("^I should see money transfer page for \"([^\"]*)\"$")
	public void i_should_see_money_transfer_page(String arg1) throws Throwable {
		objSendMoneyPage = new SendMoneyPage(driver);
		objSendMoneyPage.verifySelectedCountry(arg1);
	}
	
	


}
