package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ExpensesPage;
import pages.LoginPage;
import utilities.CreateDriver;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import org.openqa.selenium.WebElement;

public class    ExpensesTests extends PersonalInformationTests {

    private void fillExpensesForm(ExpensesPage page) {
        page.checkboxOwn.click();
        page.firstMortgageTotalPayment.sendKeys("500000");

    }

    @Test (groups = {"smoke"})
    public void fillExpensesFormTest(){

        ExpensesPage expensesPage = new ExpensesPage();
        fillExpensesForm(expensesPage);

        expensesPage.nextButton.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/mortagage.php"));
    }


}
