package eCom_Website.pages_Seller;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seller_create_product_POM extends LoginURL {
   @FindBy(xpath = "//span[normalize-space()='Products']")
    WebElement productsFromSidebar;
    @FindBy(xpath = "//a[normalize-space()='Create Product']")
    WebElement createProducts;


   //------------Product Information--------------------
    @FindBy(xpath = "//input[@placeholder='Product name']")
    WebElement productNameField;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[2]/div/div")
    WebElement categoryField;

    @FindBy(xpath = "//div[contains(text(),'Electronics')]")
    WebElement electronicsOption;
    @FindBy(xpath = "//*[@id=\"__next\"]/div/div/div[2]/div[2]/div/div[1]/div[2]/div/div[3]/div/div/div")
    WebElement subCategoryField;

    @FindBy(xpath = "//span[contains(text(),'Laptops')]")
    WebElement laptopOption;
    @FindBy(xpath = "//*[@id=\"rc_select_1\"]")
    WebElement brandField;
    @FindBy(xpath = "//div[contains(text(),'Xiaomi')]")
    WebElement appleBrand;
    @FindBy(xpath = "//input[@placeholder='Unit (e.g. KG,Pc etc)']")
    WebElement unitField;
    @FindBy(xpath = "//input[@placeholder='Enter tag name and press enter']")
    WebElement tagsField;
 //---------------------------Product Images-----------------------------------
    @FindBy(xpath = "//span[normalize-space()='Upload thumbnail']")
    WebElement thumbnailImage;
    @FindBy(xpath = "//*[@id=\"react-media-library-tabs-tabpane-upload\"]/div/div/input")
    WebElement uploadImageOption;
//    @FindBy(xpath = "//span[normalize-space()='Upload Galary']")
//    WebElement uploadGalary;
    @FindBy(xpath = "//a[@id='react-media-library-tabs-tab-library']")
    WebElement libraryButton;
    @FindBy(xpath = "//*[@id=\"react-media-library-tabs-tabpane-library\"]/div[1]/div[1]/div/img")
    WebElement selectProductImage;
    @FindBy(xpath = "//button[normalize-space()='Select File']")
    WebElement selectFileButton;

    //------------Product price + stock ----------------
    @FindBy(xpath = "//input[@placeholder='Product price']")
    WebElement unitPrice;
    @FindBy(xpath = "//input[@placeholder='Discount price']")
    WebElement discountPrice;

    @FindBy(xpath = "//input[@placeholder='Tax value']")
    WebElement taxValueField;

    @FindBy(xpath = "//input[@placeholder='Product SKU']")
    WebElement productSKU;
    @FindBy(xpath = "//input[@placeholder='Product stock']")
    WebElement productStock;
    //------------Product Description ----------------
    @FindBy(xpath = "//div[@class='ql-editor ql-blank']")
    WebElement descriptionField;
    //------------SAVE Product ----------------
    @FindBy(xpath = "//span[normalize-space()='Save Product']")
    WebElement saveProduct;

    //javascript executor for scroll down
    JavascriptExecutor scroll= (JavascriptExecutor) driver;


    //initialize driver
    public Seller_create_product_POM(){
        PageFactory.initElements(driver,this);
    }
    public void clickProductsFromSidebar(){
        productsFromSidebar.click();
    }
    public void clickCreateProducts(){
        createProducts.click();
    }
    public void inputTheProductInformation(String seller_productName,String productUnit,String tags){
        productNameField.sendKeys(seller_productName);
        waitDriver(2000);
        categoryField.click();
        waitDriver(2000);
        electronicsOption.click();
        waitDriver(2000);
        subCategoryField.click();
        waitDriver(1000);
        laptopOption.click();
        waitDriver(1000);
        brandField.click();
        waitDriver(1000);
        appleBrand.click();
        waitDriver(1000);
        unitField.sendKeys(productUnit);
        tagsField.sendKeys(tags);
//        categoryField.sendKeys("Electronics",Keys.ENTER);
////      categoryField.sendKeys(Keys.ENTER);
//        //subCategory
//        subCategoryField.sendKeys(Keys.ARROW_DOWN);
//        subCategoryField.sendKeys(Keys.ARROW_DOWN);
//        subCategoryField.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
//        brandField.sendKeys(productBrand);

    }
    public void uploadProductImage(){
        waitDriver(1000);
        thumbnailImage.click();
        //uploadImageOption.sendKeys("C:\\Users\\TS4U\\IdeaProjects\\eCom_UI_Automation_BDD\\images\\4940511ad5fae4c492189c4710741857.jpg");
        waitDriver(2000);
        uploadImageOption.sendKeys("C:\\Users\\TS4U\\IdeaProjects\\eCom_UI_Automation_BDD\\images\\fancy_hat.jpg");
        waitDriver(1000);
        libraryButton.click();
        waitDriver(1000);
        selectProductImage.click();
        waitDriver(1000);
        selectFileButton.click();
        waitDriver(1000);
    }
    public void productPriceStock(){
        scroll.executeScript("window.scrollBy(0,300)");
        waitDriver(1000);
        unitPrice.sendKeys("1000");
        waitDriver(1000);
        discountPrice.sendKeys("850");
        waitDriver(1000);
        taxValueField.sendKeys("900");
        waitDriver(1000);
        productSKU.sendKeys("Null");
        waitDriver(1000);
        productStock.sendKeys("5");
        waitDriver(1000);
    }
    public void productDescription(){
        descriptionField.sendKeys("Color: Black, Size: 5'' ");


    }
    public void clickSaveProductBtn(){
        scroll.executeScript("window.scrollBy(0,700)");
        waitDriver(2000);
        saveProduct.click();
    }








}
