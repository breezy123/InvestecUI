package Investec.co.za.Runners;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        monochrome = true,
        //dryRun = false,
        features = {"src/test/java/Investec/co/za/features"},

        glue = {"Investec.co.za.StepsDef"},

        plugin = {"pretty",
                "html:target/cucumber-htmlreport",
                "json:target/cucumber-reportInvestec.json",
                "com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReportInvestec.html"})
public class InvestecRunner extends AbstractTestNGCucumberTests {
}
