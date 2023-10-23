package eCom_Website.pages;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Buyer_Login_POM extends LoginURL {

    @FindBy(xpath = "//div[@class='header_info']//i[@class='far fa-user']")
    WebElement userIcon;
    @FindBy(xpath = "//p[normalize-space()='Login']")
    WebElement loginTitle;
    @FindBy(xpath = "//input[@id='normal_login_email']")
    WebElement emailField;
    @FindBy(xpath = "//input[@id='normal_login_password']")
    WebElement passwordField;
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

    @FindBy(xpath = "//p[normalize-space()='israk']")
    WebElement userName;
//initialize the elements
    public Buyer_Login_POM(){

        PageFactory.initElements(driver, this);
    }

    //click on the user icon
    public void clickUserIcon(){
        userIcon.click();
    }
    //get Login text
    public void getLoginText(){
        String loginText= loginTitle.getText();
        System.out.println(loginText);
        Assert.assertEquals(loginText,"Login","Not Login that's why Login text doesn't come");
    }
    //input the email and password
    public void inputEmailPassword(String email, String password){
        emailField.sendKeys(email);
        passwordField.sendKeys(password);
    }
    //click on the login button

    public void clickLoginButton(){
        loginButton.click();
    }

    public void verifyUserName(){
        String userNameText= userName.getText();
        System.out.println(userNameText);
        Assert.assertEquals(userNameText,"israk","User name not matching");
        System.out.println("User name found");
    }




}
