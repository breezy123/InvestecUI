package Investec.co.za.core;

import Investec.co.za.pageobjects.InvestecSearchPO;
import Investec.co.za.pageobjects.InvestecSignUp;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {

    public static WebDriver driver;

    public static InvestecSearchPO investecPO;
    public static InvestecSignUp investecSignUp;

    public static void setUpSeleniumWebDriver(String browserType) throws Exception{ //uses google driver for now

        if(browserType.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if(browserType.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        driver.manage().window().maximize();
    }

    public static void initializePageObjects(){

        investecPO = new InvestecSearchPO(driver);
        investecSignUp = new InvestecSignUp(driver);
    }
}
