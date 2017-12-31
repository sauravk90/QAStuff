package main.testBase;

import main.utilities.Constants;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestBase extends Driver {
    public String baseUrl;

    @BeforeSuite
    @Parameters({"browser"})
    public void setUp(String browser) throws TestAutomationException {

        Driver.Initialize(browser);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to(Constants.URL);
        System.out.println(browser + " browser initialized!");
    }

    @AfterSuite
    public void tearDown(){
        driver.quit();
        System.out.println("Test Execution was completed.");
    }
}
