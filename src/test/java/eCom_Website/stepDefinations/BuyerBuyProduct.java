package eCom_Website.stepDefinations;

import eCom_Website.pages.BuyerBuyProduct_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuyerBuyProduct extends LoginURL {
    BuyerBuyProduct_POM buyerBuyProduct_pom;

    @When("click on the Buy Now button")
    public void click_on_the_buy_now_button() {
        buyerBuyProduct_pom=new BuyerBuyProduct_POM();
        buyerBuyProduct_pom.clickBuyNowButton();
        waitDriver(2000);
    }

    @When("click on the Continue to Shipping button")
    public void click_on_the_continue_to_shipping_button() {
        buyerBuyProduct_pom.clickContinueToShippingButton();
        waitDriver(2000);
    }

    @When("click on the Add New Address plus icon")
    public void click_on_the_add_new_address_plus_icon() {
        buyerBuyProduct_pom.clickAddAddressButton();
        waitDriver(2000);
        Assert.assertEquals(buyerBuyProduct_pom.clickAddAddressButton(),"Add New Address");
        System.out.println(buyerBuyProduct_pom.clickAddAddressButton());

    }

    @When("input all the information")
    public void input_all_the_information() {
        buyerBuyProduct_pom.inputAllTheInformation(prop.getProperty("fullName"),prop.getProperty("address"),prop.getProperty("zipCode"),prop.getProperty("city"),prop.getProperty("mobileNumber"));
        waitDriver(2000);

    }
    @When("click on the Create Button")
    public void click_Create_Button() {
        buyerBuyProduct_pom.clickOnCreateButton();
        waitDriver(2000);

    }

    @When("select the address")
    public void select_the_address() {
        buyerBuyProduct_pom.clickTheAddressRadioButton();
        waitDriver(2000);

    }

    @When("click on the Continue to Payment button")
    public void click_on_the_continue_to_payment_button() {
        buyerBuyProduct_pom.clickContinueToPaymentButton();
        waitDriver(2000);

    }

    @When("click on the Cash On Delivery")
    public void click_on_the_cash_on_delivery() {
        buyerBuyProduct_pom.clickPaymentMethod();
        waitDriver(2000);
    }

    @When("click on the Confirm Order button")
    public void click_on_the_confirm_order_button() {
        buyerBuyProduct_pom.clickConfirmOrderButton();
        waitDriver(2000);

    }
}
