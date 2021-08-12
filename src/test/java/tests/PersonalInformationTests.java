package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.PersonalInformationPage;
import pages.PreApprovalDetailsPage;
import utilities.ConfigReader;

public class PersonalInformationTests extends PreApprovalDetailTests{

@Test(groups = {"matt"})
      public void checkbox() throws InterruptedException {



      LoginPage loginPage = new LoginPage();

      loginPage.useremailField.sendKeys(ConfigReader.getProperty("username1"));
      loginPage.passwordField.sendKeys(ConfigReader.getProperty("password1"));
      loginPage.loginButton.click();



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



