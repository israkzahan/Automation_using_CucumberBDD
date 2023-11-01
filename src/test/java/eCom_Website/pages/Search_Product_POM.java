package eCom_Website.pages;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Product_POM extends LoginURL {
    @FindBy(xpath = "//input[@placeholder='search for...']" )
    WebElement searchBarLink;

    @FindBy(xpath = "//div[@class='search_wrapper']//i[@class='fas fa-search']")
    WebElement searchIcon;

    @FindBy(xpath = "//h5[normalize-space()='HeadPhone']")
    WebElement productName;

    public Search_Product_POM(){
        PageFactory.initElements(driver,this);
    }

    //click searchBar
    public void clickSearchBar(){
        searchBarLink.click();
    }
    //send keys on the searchbar
    public void SendProductNameOnSearchBar(String productName){

        searchBarLink.sendKeys(productName);
    }
    //click search icon
    public void clickSearchIcon(){
        searchIcon.click();
    }
    public String getProductName(){
        return productName.getText();
    }
}
