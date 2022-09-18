package org.epam.aqa.ht5;

import org.epam.aqa.ht5.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTest {
    private static final String ASOS_URL = "https://www.asos.com/";
    private WebDriver driver;

    @BeforeTest
    @Parameters("browser")
    public void setUp(String browser) throws MalformedURLException {
        if (browser.equalsIgnoreCase("chrome")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
            driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), capabilities);
        } else if (browser.equalsIgnoreCase("firefox")) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "firefox");
            driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"), capabilities);
        }
    }

    @BeforeMethod
    public void methodSetUp() {
        driver.manage().window().maximize();
        HomePage homePage = new HomePage(driver);
        homePage.homePage(ASOS_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public HomePage getHomepage() {
        return new HomePage(getDriver());
    }
}
