package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.PersonalInformationPage;
import utilities.SequenceOfClassesToTest;

public class PersonalInformationTests extends TestBase{




        @Test(groups={"smoke"})


        public void checkbox() {
            SequenceOfClassesToTest sequenceOfClassesToTest=new SequenceOfClassesToTest();

            try {
                sequenceOfClassesToTest.SecondStepPreApprovalTest();
            } catch (Exception e) {
                e.printStackTrace();
            }
       PersonalInformationPage q = new PersonalInformationPage();
            Faker faker=new Faker();
      q.firstName.sendKeys(faker.address().firstName());
      q.middleName.sendKeys("R");
      q.lastName.sendKeys(faker.address().lastName());
      q.email.sendKeys(faker.internet().emailAddress());
      q.dob.sendKeys(faker.backToTheFuture().date());
      q.ssn.sendKeys(faker.idNumber().ssnValid());


      Select s = new Select(q.sex);
      s.selectByIndex((int)(Math.random()*2));

      q.cellPhoneNo.sendKeys(faker.phoneNumber().cellPhone());
      q.homePhoneNo.sendKeys(faker.phoneNumber().phoneNumber());
      q.nextButton.click();

    }


}



