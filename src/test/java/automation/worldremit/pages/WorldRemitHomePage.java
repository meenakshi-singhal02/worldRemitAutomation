package automation.worldremit.pages;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import automation.worldremit.initialsetup.CommonUtils;


// TODO: Auto-generated Javadoc
/**
 * The Class WorldRemitHomePage.
 */
public class WorldRemitHomePage {

	/** The driver. */
	WebDriver driver;
	private static Logger logger = LogManager.getLogger(WorldRemitHomePage.class.getName());

	/**
	 * Instantiates a new world remit home page.
	 *
	 * @param driver the driver
	 */
	public WorldRemitHomePage(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginLink;
	
	@FindBy(xpath="//a[text()='Sign up']")
	private WebElement signUpLink;
	
	@FindBy(xpath="//a[text()='How it works']")
	private WebElement howItWorksLink;
	
	@FindBy(xpath="//a[text()='For businesses']")
	private WebElement forBusinessesLink;
	
	@FindBy(xpath="//a[@title='WorldRemit - Online Money Transfer']")
	private WebElement worldRemitLabel;
	
	@FindBy(xpath="//a[text()='Help']")
	private WebElement helpLink;
	
	@FindBy(id="selectLanguage")
	private WebElement selectLanguage;

	@FindBy(id="selectTo")
	private WebElement selectSendToCountry;
	
	@FindBy(id="selectFrom")
	private WebElement selectSendFromCountry;
	
	@FindBy(xpath="//a[text()='Get started']")
	private WebElement getStartedButton;
	
	
	
	

	/**
	 * Navigate to URL.
	 *
	 * @param navigationUrl the navigation url
	 * @throws IOException 
	 */
	public void navigateToURL(String navigationUrl) throws IOException
	{
		Properties propData = CommonUtils.getValFromResource();
		String url= CommonUtils.getPropertiesValue(navigationUrl, propData);
		driver.get(url);
	}
	
	/**
	 * Select send from country.
	 *
	 * @param countryName the country name
	 */
	public void selectSendFromCountry(String countryName)
	{
		Select selectCountry = new Select(selectSendFromCountry);
		selectCountry.selectByVisibleText(countryName);
	}
	
	public void selectLanguage(String language)
	{
		Select selectCountry = new Select(selectLanguage);
		selectCountry.selectByVisibleText(language);
	}
	
	/**
	 * Select send to country.
	 *
	 * @param countryName the country name
	 */
	public void selectSendToCountry(String countryName)
	{
		Select selectCountry = new Select(selectSendToCountry);
		selectCountry.selectByVisibleText(countryName);
	}
	
	/**
	 * Click on get satrted.
	 */
	public void clickOnGetSatrted()
	{
		getStartedButton.click();
	}
	
	/**
	 * Validate home page elements.
	 */
	public void validateHomePageElements()
	{
		Assert.assertTrue(loginLink.isDisplayed());
		Assert.assertTrue(getStartedButton.isDisplayed());
		Assert.assertTrue(forBusinessesLink.isDisplayed());
		Assert.assertTrue(signUpLink.isDisplayed());
		Assert.assertTrue(howItWorksLink.isDisplayed());
		Assert.assertTrue(helpLink.isDisplayed());
		Assert.assertTrue(worldRemitLabel.isDisplayed());
	
	}
	
	
	
}