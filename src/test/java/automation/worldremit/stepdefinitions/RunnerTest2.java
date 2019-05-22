package automation.worldremit.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.utils.image.ImageProcessing;

import automation.worldremit.initialsetup.TestNgRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.CucumberFeatureWrapper;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import cucumber.api.testng.TestNGCucumberRunner;

/**
 * The Class RunnerTest.
 */
@CucumberOptions(features = "src/test/resources/Features", glue = {"automation.worldremit.initialsetup","automation.worldremit.stepdefinitions" }, tags = { "@sendMoney" }, plugin = { "pretty", "html:target/cucumber",
				"json:target/cucumber/cucumber.json"}, monochrome = true)

public class RunnerTest2 extends TestNgRunner{

}


