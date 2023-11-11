package eCom_Website.pages;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCart_product_POM extends LoginURL {

    @FindBy(xpath = "//button[normalize-space()='Add To Cart']")
    WebElement addCartButton;
    @FindBy(xpath = "//h5[normalize-space()='HeadPhone']")
    WebElement productName;
    @FindBy(xpath = "//button[normalize-space()='Proceed to checkout']")
    WebElement proceedToCheckoutButton;



    public AddCart_product_POM(){
        PageFactory.initElements(driver,this);
    }

    public void clickAddCartButton(){
        addCartButton.click();
    }
    public String getProductNameText(){
        return productName.getText();
    }
    public void clickProceedCheckoutButton(){
        proceedToCheckoutButton.click();
    }

    public String getProceedCheckoutButtonText(){
        return proceedToCheckoutButton.getText();
    }







}
