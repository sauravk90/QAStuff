package main.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver {
    public static WebDriver driver;

    public static void Initialize(String driverType)
    {
        switch (DriverType.valueOf(driverType))
        {
            case Chrome:
                InitializeChrome();
                break;

            case Firefox:
                InitializeFireFox();
                break;

            default:
                InitializeChrome();
                break;
        }
    }

    private static void InitializeChrome()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Saurav PC\\IdeaProjects\\QAStuff\\src\\main\\config\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    private static void InitializeFireFox()
    {
        System.setProperty("webdriver.gecko.driver","C:");
        driver = new FirefoxDriver();
    }

    public enum DriverType
    {
        InternetExplorer,
        Chrome,
        Firefox
    }
}
