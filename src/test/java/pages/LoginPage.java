package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigReader;
import utilities.CreateDriver;

public class LoginPage extends  PageBase{


    @FindBy(id = "exampleInputEmail1")
    public WebElement useremailField;

    @FindBy(id = "exampleInputPassword1")
    public WebElement passwordField;

    @FindBy(name = "login")
    public WebElement loginButton;

    @FindBy(id = "hideLogin")
    public WebElement signUpLink;

    @FindBy(xpath = "//span[.='Your Music']")
    public WebElement yourMusicLink;


    public void login(String username, String pass){
        useremailField.sendKeys(username);
        passwordField.sendKeys(pass);
        loginButton.click();
    }


}