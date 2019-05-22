
package automation.worldremit.initialsetup;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import io.github.bonigarcia.wdm.ChromeDriverManager;


public class TestNgRunner extends AbstractTestNGCucumberTests{
public static WebDriver driver =null;
	
	@BeforeTest
	@Parameters(value = {"browser"})
	public void initDriver(String browser) {
		try {
//			Properties propConfig = CommonUtils.getValFromResource();
//			String browser= CommonUtils.getPropertiesValue("browser", propConfig);
			System.out.println("browser is      "+browser);
			DesiredCapabilities cap;
			cap = new DesiredCapabilities();
			cap.setJavascriptEnabled(true);
			
			if(!(browser.equals("null")))
			{
				switch(browser)
				{
				case "chrome": 
					Class<? extends WebDriver> driverClass = ChromeDriver.class;
					ChromeDriverManager.getInstance(driverClass).setup();  
					driver = new ChromeDriver(cap);
					driver.manage().window().maximize();
					break;
				case "ie":
					System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\jars\\IEDriverServer.exe");                 				
					cap.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
					cap.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
					cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
					driver = new InternetExplorerDriver(cap);		
					break;
				case "firefox":
					 System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\jars\\geckodriver.exe");
					 driver = new FirefoxDriver(cap);				 
					break;
				default: 
					System.out.println("Please provide valid browser");
				}
			
				driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Tear down. Below function will run after every scenario
	 */
	@AfterTest
	public void TearDown() {
		try {
			if(!(driver==null))
			{
				/*if (scenario.isFailed()) {
			        byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			        screenshot = ImageProcessing.imageResize(screenshot);
			        scenario.embed(screenshot, "image/png");}*/
				driver.close();
				driver.quit();	
			}
			
			}	
		catch (Exception e) {
			e.printStackTrace();		
				}
		}
	
	/**
	 * Gets the driver.
	 * @return the driver
	 */
	public static WebDriver getDriver() {
		return driver;
	}
}