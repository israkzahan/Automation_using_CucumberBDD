package eCom_Website.stepDefinations;

import eCom_Website.pages_Seller.Seller_create_product_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Seller_create_product extends LoginURL {
    Seller_create_product_POM seller_create_product_pom;

    @Given("expand the products option from the left side bar")
    public void expand_the_products_option_from_the_left_side_bar() {
        seller_create_product_pom= new Seller_create_product_POM();
        seller_create_product_pom.clickProductsFromSidebar();
        waitDriver(2000);

    }

    @Given("click on the Create Product option")
    public void click_on_the_create_product_option() {
        seller_create_product_pom.clickCreateProducts();
        waitDriver(2000);

    }

    @Given("input all the information in Product Information section")
    public void input_all_the_information_in_product_information_section() {
        seller_create_product_pom.inputTheProductInformation(prop.getProperty("seller_productName"),
                prop.getProperty("productUnit"),prop.getProperty("tags"));
        waitDriver(2000);

    }

    @Given("upload the image in the product price + stock section")
    public void upload_the_image_in_the_product_price_stock_section() {
        seller_create_product_pom.uploadProductImage(prop.getProperty("imagePath"));
        waitDriver(2000);

    }

    @Given("input the description in the Product Description section")
    public void input_the_description_in_the_product_description_section() {
        seller_create_product_pom.productPriceStock();
        waitDriver(2000);

    }

    @Given("click on the Save Product button")
    public void click_on_the_save_product_button() {
        seller_create_product_pom.clickSaveProductBtn();
        waitDriver(2000);

    }

    @Then("it should create a product")
    public void it_should_create_a_product() {
        System.out.println("Product Successfull");

    }
}
