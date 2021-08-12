package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import utilities.ConfigReader;
import utilities.CreateDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;


    @BeforeMethod(alwaysRun = true)
    @Parameters("browser")
    public void setupMethod(@Optional String browser) {

        driver = CreateDriver.getDriver(browser);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(ConfigReader.getProperty("url"));


    }


  @AfterMethod(alwaysRun = true)
   public void tearDownMethod() {

       CreateDriver.quitDriver();}
        public void selectDropDownValueByValue (WebElement element, String Value ) throws Exception {
            Select dropdown = new Select((element));
            dropdown.selectByVisibleText(Value);


    }
}