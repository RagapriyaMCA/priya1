package NykaaRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import BaseClass.baseClass;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import property.FileReaderManager;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\NykaaFeature\\Nykaa.feature",
glue="Nykaa_StepDefinition",
monochrome=true,
strict=true,
dryRun=true)

public class Runner extends baseClass{
public static WebDriver driver;

@BeforeClass
public static void signIn() throws Throwable {
	String browser=FileReaderManager.getinstance().getinstanceCR().getBrowser();
	driver=baseClass.browserLaunch(browser);
}
@AfterClass
public static void browserClose() {
	driver.close();
}
}
