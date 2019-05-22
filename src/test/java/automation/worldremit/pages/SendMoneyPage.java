package automation.worldremit.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import ch.qos.logback.core.net.SyslogOutputStream;

// TODO: Auto-generated Javadoc
/**
 * The Class SendMoneyPage.
 */
public class SendMoneyPage {

	/** The driver. */
	WebDriver driver;
	
	/**
	 * Instantiates a new send money page.
	 *
	 * @param driver the driver
	 */
	public SendMoneyPage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	/** The select send to. */
	@FindBy(id="selectTo")
	private WebElement selectSendTo;
	
	/** The send button. */
	@FindBy(xpath="//button[text()='Send']")
	private WebElement sendButton;
	
	
	/** The send to label. */
	@FindBy(xpath="//*[text()='Send to']")
	private WebElement sendToLabel;
	
	/**
	 * Verify selected country.
	 *
	 * @param expectedCountry the expected country
	 */
	public void verifySelectedCountry(String expectedCountry)
	{
		Select selectCountry = new Select(selectSendTo);
		String selectedCountry = selectCountry.getFirstSelectedOption().getText();
		Assert.assertEquals(selectedCountry, expectedCountry);
	}
	
	/**
	 * Validate send money page elements.
	 */
	public void validateSendMoneyPageElements()
	{
		Assert.assertTrue(sendToLabel.isDisplayed());
		Assert.assertTrue(sendButton.isDisplayed());
	}

	
	
	
	

	
	
	
	
	
}
