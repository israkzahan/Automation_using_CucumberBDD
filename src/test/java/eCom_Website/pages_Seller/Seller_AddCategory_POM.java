package eCom_Website.pages_Seller;

import eCom_Website.utils.LoginURL;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Seller_AddCategory_POM extends LoginURL {
    @FindBy(xpath = "//a[normalize-space()='Categories']")
    WebElement categoryLink;
    @FindBy(xpath = "//span[normalize-space()='Add Category']")
    WebElement addCategoryLink;
    @FindBy(xpath = "//input[@type='text']")
    WebElement categoryNameText;
    @FindBy(xpath = "//span[normalize-space()='Upload image']")
    WebElement uploadImageButton;
    @FindBy(xpath = "//*[@id=\"react-media-library-tabs-tabpane-upload\"]/div/div/input")
    WebElement dragNdrop;
    @FindBy(xpath = "//a[@id='react-media-library-tabs-tab-library']")
    WebElement libraryButtonClick;
    @FindBy(xpath = "//*[@id=\"react-media-library-tabs-tabpane-library\"]/div[1]/div[1]/div/img")
    WebElement clickOnThePhoto;
    @FindBy(xpath = "//button[normalize-space()='Select File']")
    WebElement selectButton;
    @FindBy(xpath = "//span[normalize-space()='Add']")
    WebElement addButton;

    public Seller_AddCategory_POM(){
        PageFactory.initElements(driver,this);
    }

    public void clickOnAddCategoriesOption(){
        categoryLink.click();

    }
    public void clickOnAddCategoryButton(){
        addCategoryLink.click();
    }
    public void writeCategoryName(){
        categoryNameText.sendKeys("Women Dress");
    }
    public void clickUploadImageButton(){
        uploadImageButton.click();
        waitDriver(1000);
        dragNdrop.sendKeys("C:\\Users\\TS4U\\IdeaProjects\\eCom_UI_Automation_BDD\\images\\dress.jpg");
        waitDriver(1000);
        libraryButtonClick.click();
        waitDriver(1000);
        clickOnThePhoto.click();
        waitDriver(1000);
        selectButton.click();
    }
    public void clickAddButton(){
        waitDriver(1000);
        addButton.click();
    }
}
