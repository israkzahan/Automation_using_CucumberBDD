package eCom_Website.pages_Buyer;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuyerBuyProduct_POM extends LoginURL {
    //inspect the elements
    @FindBy(xpath = "//button[normalize-space()='Buy Now']")
    WebElement buyNowButton;
    @FindBy(xpath = "//button[normalize-space()='Continue to shipping']")
    WebElement continueToShippingButton;
    @FindBy(xpath = "//span[normalize-space()='Add New Address']")
    WebElement addNewAddressButton;
    @FindBy(xpath = "//input[@id='form_in_modal_name']")
    WebElement fullNameField;
    @FindBy(xpath = "//textarea[@id='form_in_modal_address']")
    WebElement addressField;
    @FindBy(xpath = "//input[@id='form_in_modal_zip']")
    WebElement zipCodeField;
    @FindBy(xpath = "//input[@id='form_in_modal_city']")
    WebElement cityField;
    @FindBy(xpath = "//div[@class='ant-select-selector']")
    WebElement stateField;
    @FindBy(xpath = "//input[@id='form_in_modal_state']")
    WebElement writeState;
    @FindBy(xpath = "//input[@id='form_in_modal_mobileNumber']")
    WebElement mobileField;
    @FindBy(xpath = "//span[normalize-space()='Create']")
    WebElement createButton;
    @FindBy(xpath = "//input[@name='address_id']")
    WebElement selectAddressRadioButton;
    @FindBy(xpath = "//button[normalize-space()='Continue to Payment']")
    WebElement continueToPaymentButton;
    @FindBy(xpath = "//input[@value='cod']")
    WebElement paymentMethodButton;
    @FindBy(xpath = "//button[normalize-space()='Confirm Order']")
    WebElement confirmOrderdButton;
    @FindBy(xpath = "//h5[normalize-space()='Your Orders']")
    WebElement orderConfirmations;

    public BuyerBuyProduct_POM(){
        PageFactory.initElements(driver,this);
    }
    public void clickBuyNowButton(){
        buyNowButton.click();
    }
    public void clickContinueToShippingButton(){
        continueToShippingButton.click();
    }
    public void clickAddAddressButton(){
        addNewAddressButton.click();
        //return addNewAddressText.getText();
    }
    //input all the information
    public void inputAllTheInformation(String fullName,String address,String zipCode,String city,String mobileNumber){
        fullNameField.sendKeys(fullName);
        addressField.sendKeys(address);
        zipCodeField.sendKeys(zipCode);
        cityField.sendKeys(city);
        stateField.click();
        writeState.sendKeys("Michigan", Keys.ENTER);
        mobileField.sendKeys(mobileNumber);
    }
    //click on the create button
    public void clickOnCreateButton(){
        createButton.click();
    }
    //select the address
    public void clickTheAddressRadioButton(){
        selectAddressRadioButton.click();
    }

    //click on the continue to the payment method
    public void clickContinueToPaymentButton(){
        continueToPaymentButton.click();
    }
    //select the payment method
    public void clickPaymentMethod(){
        paymentMethodButton.click();
    }
    public void clickConfirmOrderButton(){
        confirmOrderdButton.click();
    }

    public String verifyOrderConfirmationText(){
        return orderConfirmations.getText();
    }


}
