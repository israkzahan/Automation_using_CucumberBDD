package eCom_Website.stepDefinations;

import eCom_Website.pages_Seller.Seller_Confirm_Order_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SellerConfirmOrder extends LoginURL {
    Seller_Confirm_Order_POM seller_confirm_order_pom;

    @Given("click on the Order from the menuBar")
    public void click_on_the_order_from_the_menu_bar() {
        seller_confirm_order_pom= new Seller_Confirm_Order_POM();
        seller_confirm_order_pom.clickOrder();
        waitDriver(2000);
    }

    @Given("click on the order Action icon")
    public void click_on_the_order_action_icon() {
        seller_confirm_order_pom.clickActionIcon();
        waitDriver(2000);

    }

    @Given("change the Order status and click on the save button")
    public void change_the_order_status_and_click_on_the_save_button() {
        seller_confirm_order_pom.clickOrderStatus();
        waitDriver(2000);
    }

    @Then("verify the order Confirmation")
    public void verify_the_order_confirmation() {
        System.out.println(seller_confirm_order_pom.getOrderConfirmation());
    }
}
