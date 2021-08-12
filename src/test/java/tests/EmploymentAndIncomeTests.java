package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.EmploymentAndIncomePage;
import pages.ExpensesPage;

public class EmploymentAndIncomeTests extends ExpensesTests {

    private void fillEmploymentAndIncomeForm(EmploymentAndIncomePage page) {
        if (page.checkboxCurrentJob.isSelected()) {
            page.checkboxCurrentJob.click();
        }

        page.employerName1.sendKeys("n/a");
        page.grossMonthlyIncome.sendKeys("5000");
        page.monthlyBonuses.sendKeys("500");
        page.monthlyDividents.sendKeys("1000");

    }

    @Test (groups = {"smoke"})
    public void assertTotalIncomeTest() {

        EmploymentAndIncomePage employmentAndIncomePage = new EmploymentAndIncomePage();
        fillEmploymentAndIncomeForm(employmentAndIncomePage);

        Assert.assertTrue(employmentAndIncomePage.totalIncome.getText().contains("6500 $"));

    }

    @Test (groups = {"smoke"})
    public  void fillEmploymentAndIncomeFormTest(){
        EmploymentAndIncomePage employmentAndIncomePage = new EmploymentAndIncomePage();
        fillEmploymentAndIncomeForm(employmentAndIncomePage);
        employmentAndIncomePage.nextButton.click();

        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/mortagage.php"));

    }

}
