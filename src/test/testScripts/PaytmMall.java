package test.testScripts;

import main.pageObjects.PaytmHomepage;
import main.testBase.Driver;
import main.testBase.TestBase;
import org.testng.annotations.Test;

public class PaytmMall extends TestBase {

    @Test
    public void search(){
        PaytmHomepage homeObj = new PaytmHomepage(driver);
        homeObj.searchBox.sendKeys("python books");
        Driver.clickElement(homeObj.searchBox);

    }
}
