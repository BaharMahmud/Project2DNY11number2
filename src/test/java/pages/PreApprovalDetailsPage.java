package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreApprovalDetailsPage extends PageBase{



    @FindBy (xpath = "//input[@name='realtor_info']")
    public WebElement realtorInfo;



    @FindBy (name = "est_purchase_price")
        public WebElement purchasePrice;

    @FindBy (xpath = "//input[@id='downpayment']")
    public WebElement downPaymentAmount;

    @FindBy ( xpath = "//a[@href='#next']")
     public WebElement nextButton;







}
