package test.testScripts;

import main.pageObjects.PaytmHomepage;
import main.testBase.TestBase;
import org.testng.annotations.Test;
import static main.testBase.Driver.driver;

public class PaytmMall extends TestBase {

    @Test
    public void search(){
        PaytmHomepage homeObj = new PaytmHomepage(driver);
        homeObj.searchBox.sendKeys("python books");

    }
}
