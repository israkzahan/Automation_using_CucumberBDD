package eCom_Website.stepDefinations;

import eCom_Website.pages_Buyer.AddCart_product_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class BuyerAddToCartProduct extends LoginURL {
    AddCart_product_POM addCart_product_pom;
    @And("click on the AddAdd to cart button")
    public void clickOnProduct(){
        addCart_product_pom= new AddCart_product_POM();
        addCart_product_pom.clickAddCartButton();
    }
    @Then("verify the product is added to cart list")
    public void getProceedCheckoutButton(){
        waitDriver(2000);
        Assert.assertEquals(addCart_product_pom.getProductNameText(),"HeadPhone","Product not found");
        System.out.println(addCart_product_pom.getProductNameText());
        waitDriver(2000);
        System.out.println(addCart_product_pom.getProceedCheckoutButtonText());
        Assert.assertEquals(addCart_product_pom.getProceedCheckoutButtonText(),"Proceed to checkout","Button not found");
        addCart_product_pom.clickProceedCheckoutButton();


//        waitDriver(2000);
//        System.out.println(addCart_product_pom.clickProceedCheckoutButton());
    }

    //1:23


}
