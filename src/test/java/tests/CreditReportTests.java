package tests;

import org.testng.annotations.Test;
import pages.CreditReportPage;

public class CreditReportTests extends EmploymentAndIncomeTests{

    @Test
    public void positiveAnswerforCreditReport(){
        CreditReportPage creditReportPage=new CreditReportPage();
        creditReportPage.yesCheckBox.click();
        creditReportPage.nextButton.click();

    }
    @Test
    public void negativeAnswerforCreditReport(){
        CreditReportPage creditReportPage=new CreditReportPage();
        creditReportPage.noCheckBox.click();
        creditReportPage.nextButton.click();
    }


}
