package utilities;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PersonalInformationPage;
import pages.PreApprovalDetailsPage;
import tests.LoginTests;
import tests.PersonalInformationTests;
import tests.PreApprovalDetailTests;
import tests.TestBase;

public class SequenceOfClassesToTest extends TestBase {
   public void FirstStepLoginMethod(){
       LoginPage loginPage = new LoginPage();

       loginPage.useremailField.sendKeys(ConfigReader.getProperty("username1"));
       loginPage.passwordField.sendKeys(ConfigReader.getProperty("password1"));
       loginPage.loginButton.click();


   }
   public  void  SecondStepPreApprovalTest() throws Exception {
       this.FirstStepLoginMethod();
       PreApprovalDetailsPage preApprovalDetailPage = new PreApprovalDetailsPage();
       preApprovalDetailPage.mortgageApplicationLink.click();



       preApprovalDetailPage.realtorInfo.sendKeys(ConfigReader.getProperty("realtorInfo"));
       preApprovalDetailPage.loanOfficerCheckBox.click();
       preApprovalDetailPage.estimatePurchasePrice.sendKeys(ConfigReader.getProperty("purchasePrice"));
       preApprovalDetailPage.downPayment.sendKeys(ConfigReader.getProperty("downPayment"));
       selectDropDownValueByValue(preApprovalDetailPage.downPaymentSource, ConfigReader.getProperty("downPaymentSource"));
       preApprovalDetailPage.nextButton.click();
   }
    public void ThirdStepPersonalInformationMethod() throws Exception {

        this.SecondStepPreApprovalTest();
        PersonalInformationPage p = new PersonalInformationPage();
        p.mortgageApplicationLink.click();

        PreApprovalDetailsPage pad = new PreApprovalDetailsPage();
        pad.realtorInfo.sendKeys("Julia: 1234567890");


        pad.estimatePurchasePrice.sendKeys("250000");
        pad.downPayment.sendKeys("5000");

        pad.nextButton.click();

        PersonalInformationPage q = new PersonalInformationPage();

        q.firstName.sendKeys("Matt");
        q.middleName.sendKeys("R");
        q.lastName.sendKeys("Young");
        q.email.sendKeys("abc123@gmail.com");
        q.dob.sendKeys("11171986");
        q.ssn.sendKeys("123563434");

        Select s = new Select(q.sex);
        s.selectByValue("Married");

        q.cellPhoneNo.sendKeys("1234566767");
        q.homePhoneNo.sendKeys("3457670987");
        q.nextButton.click();
    }
}
