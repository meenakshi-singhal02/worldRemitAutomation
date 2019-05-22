package automation.worldremit.initialsetup;

import org.openqa.selenium.WebDriver;

import automation.worldremit.stepdefinitions.RunnerTest;

/**
 * The Class TestBase.
 */
//public class TestBase extends Hooks {

public class TestBase {

	/**
	 * Gets the web driver.
	 * @return the web driver
	 */
//	public static WebDriver getWebDriver() {
//		if (RunnerTest.driver == null) {
//			synchronized (TestBase.class) {
//				Hooks.getDriver();
//			}
//		}
//		return Hooks.driver;
//	}

//	public static WebDriver getWebDriver() {
//		if (RunnerTest.driver == null) {
//			synchronized (TestBase.class) {
//				RunnerTest.getDriver();
//			}
//		}
//		return RunnerTest.driver;
//	}
	
	public static WebDriver getWebDriver() {
		if (TestNgRunner.driver == null) {
			synchronized (TestBase.class) {
				TestNgRunner.getDriver();
			}
		}
		return TestNgRunner.driver;
	}
}

