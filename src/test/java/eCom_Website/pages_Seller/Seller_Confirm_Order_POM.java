package eCom_Website.pages_Seller;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class Seller_Confirm_Order_POM extends LoginURL {
    @FindBy(xpath = "//a[normalize-space()='Orders']")
    WebElement orderLink;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div/div[2]/div/div/div/div/div/div/table/tbody/tr[1]/td[7]/div/div/button")
    WebElement actionIcon;
    @FindBy(xpath = "//div[@class='status_wrapper']//div[1]//div[1]//div[1]")
    WebElement selectOrderStatus;
    @FindBy(xpath = "//div[@title='Processing']")
    WebElement selectProcessing;
    @FindBy(xpath = "//div[@title='Shipped']")
    WebElement selectShipped;
    @FindBy(xpath = "//div[@title='Delivered']")
    WebElement selectDelivered;
    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary']")
    WebElement saveButton;
    @FindBy(xpath = "//*[@id=\"orderdetails\"]/div/div[2]/div[2]/div/div[2]/div/div")
    WebElement paymentStatus;
    @FindBy(xpath = "//div[@title='Paid']")
    WebElement paidStatus;
    @FindBy(xpath = "//p[normalize-space()='Your order has been delivered']")
    WebElement verifyDelivery;

    public Seller_Confirm_Order_POM(){
        PageFactory.initElements(driver,this);
    }
    public void clickOrder(){
        orderLink.click();
    }
    public void clickActionIcon(){
        actionIcon.click();
    }
    public void clickOrderStatus(){
        selectOrderStatus.click();
        waitDriver(2000);
        selectProcessing.click();
        saveButton.click();
        waitDriver(1000);
        selectOrderStatus.click();
        waitDriver(1000);
        selectShipped.click();
        waitDriver(1000);
        saveButton.click();
        waitDriver(1000);
        selectOrderStatus.click();
        waitDriver(1000);
        selectDelivered.click();
        waitDriver(1000);
        paymentStatus.click();
        waitDriver(1000);
        paidStatus.click();
        waitDriver(1000);
        saveButton.click();
    }
    public String getOrderConfirmation(){
        return verifyDelivery.getText();
    }
}
