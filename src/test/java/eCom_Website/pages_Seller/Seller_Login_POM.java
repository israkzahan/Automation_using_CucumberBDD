package eCom_Website.pages_Seller;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Seller_Login_POM extends LoginURL {
    @FindBy(xpath = "//input[@id='basic_email']")
    WebElement sellerEmailField;
    @FindBy(xpath = "//input[@id='basic_password']")
    WebElement sellerPasswordField;
    @FindBy(xpath = "//span[normalize-space()='Login']")
    WebElement sellerLoginButton;
    @FindBy(xpath = "//a[normalize-space()='Dashboard']")
    WebElement sellerDashboard;
    public Seller_Login_POM(){
        PageFactory.initElements(driver, this);
    }
    public void input_Email_Password(String email, String password){
        sellerEmailField.sendKeys(email);
        sellerPasswordField.sendKeys(password);
    }
    public void clickSellerLoginButton(){
        sellerLoginButton.click();
    }
    public String verifyDashboardText(){
        return sellerDashboard.getText();
    }

}
