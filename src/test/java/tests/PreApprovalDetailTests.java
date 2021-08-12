package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.PreApprovalDetailsPage;
import utilities.ConfigReader;
import utilities.SequenceOfClassesToTest;

public class PreApprovalDetailTests extends  TestBase {






    @Test (groups = {"smoke"})
    public void preApprovalPageAccess(){
        SequenceOfClassesToTest sequenceOfClassesToTest=new SequenceOfClassesToTest();
        sequenceOfClassesToTest.FirstStepLoginMethod();
        PreApprovalDetailsPage preApprovalDetailPage = new PreApprovalDetailsPage();
        preApprovalDetailPage.mortgageApplicationLink.click();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/mortagage.php"));


    }
    @Test(groups = {"smoke"})
    public void fillFieldsOfPreApprovalDetailPage() throws Exception {
        preApprovalPageAccess();
        Assert.assertTrue(driver.getCurrentUrl().equals("http://duobank-env.eba-hjmrxg9a.us-east-2.elasticbeanstalk.com/mortagage.php"));
        PreApprovalDetailsPage preApprovalDetailPage = new PreApprovalDetailsPage();
        preApprovalDetailPage.realtorInfo.sendKeys(ConfigReader.getProperty("realtorInfo"));
        preApprovalDetailPage.loanOfficerCheckBox.click();
        preApprovalDetailPage.estimatePurchasePrice.sendKeys(ConfigReader.getProperty("purchasePrice"));
        preApprovalDetailPage.downPayment.sendKeys(ConfigReader.getProperty("downPayment"));
        selectDropDownValueByValue(preApprovalDetailPage.downPaymentSource, ConfigReader.getProperty("downPaymentSource"));
    preApprovalDetailPage.nextButton.click();


    }
}