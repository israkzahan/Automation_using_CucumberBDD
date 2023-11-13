package eCom_Website.stepDefinations;

import eCom_Website.pages_Buyer.Search_Product_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Search_Product_Steps extends LoginURL {
    Search_Product_POM search_product_pom;
    @When("click on the searchBar")
    public void clickSearch(){
        search_product_pom= new Search_Product_POM();
        search_product_pom.clickSearchBar();
        waitDriver(2000);
    }

    @When("input the product name in the searchbar")
    public void inputProductName(){
        search_product_pom.SendProductNameOnSearchBar(prop.getProperty("productName"));
        waitDriver(2000);
    }

    @When("click the search icon")
    public void searchIconClick(){
        search_product_pom.clickSearchIcon();
        waitDriver(2000);

    }
    @When("it should appear the specific product")
    public void getTheProduct(){
        Assert.assertEquals(search_product_pom.getProductName(),"HeadPhone","The product name doesn't match");
        waitDriver(2000);
        System.out.println(search_product_pom.getProductName());
        search_product_pom.clickProduct();
       // driver.quit();
    }
    @And("search for a product")
    public void searchForProduct(){
        search_product_pom= new Search_Product_POM();
        search_product_pom.SendProductNameOnSearchBar(prop.getProperty("productName"));
        waitDriver(2000);
        search_product_pom.clickSearchIcon();
        waitDriver(2000);
        search_product_pom.clickProduct();
        waitDriver(2000);
    }
}
