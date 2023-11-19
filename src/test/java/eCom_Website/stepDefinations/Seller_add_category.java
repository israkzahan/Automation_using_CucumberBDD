package eCom_Website.stepDefinations;

import eCom_Website.pages_Seller.Seller_AddCategory_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Seller_add_category extends LoginURL {
    Seller_AddCategory_POM seller_addCategory_pom;
    @When("I click on the category option from the left sidebar")
    public void i_click_on_the_category_option_from_the_left_sidebar() {
        seller_addCategory_pom= new Seller_AddCategory_POM();
        seller_addCategory_pom.clickOnAddCategoriesOption();
    }

    @When("click on the Add category button")
    public void click_on_the_add_category_button() {
        seller_addCategory_pom.clickOnAddCategoryButton();
    }

    @When("input the category name")
    public void input_the_category_name() {
       seller_addCategory_pom.writeCategoryName();
    }

    @When("upload the category image")
    public void upload_the_category_image() {
        seller_addCategory_pom.clickUploadImageButton();
    }

    @When("click on the Add to cart button")
    public void click_on_the_add_to_cart_button() {
        seller_addCategory_pom.clickAddButton();
    }

    @Then("it should create a category")
    public void it_should_create_a_category() {
        System.out.println("Category added successfully");
    }

}
