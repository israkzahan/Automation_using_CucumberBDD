package eCom_Website.stepDefinations;

import eCom_Website.pages_Buyer.Buyer_Login_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuyerLoginSteps extends LoginURL {
    Buyer_Login_POM buyer_login_pom;

    @Given("Buyer navigates to the baseUrl")
    public void navigateBaseUrl(){
        Assert.assertEquals(driver.getTitle(),"Ecommerce Website");
        System.out.println(driver.getTitle());

//        initializeDriver();
//        waitDriver(2000);
    }
    @When("click on the user icon from the right top corner")
    public void clickTheUserIcon(){
        buyer_login_pom= new Buyer_Login_POM();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}

        buyer_login_pom.clickUserIcon();
        waitDriver(2000);
        System.out.println(buyer_login_pom.getLoginText());
    }

    @When("input the email and password")
    public void inputEmailPassword(){
        buyer_login_pom.inputEmailPassword(prop.getProperty("email"),prop.getProperty("password"));
        waitDriver(2000);
    }

    @When("click on the login button")
    public void clickLoginButton(){
        buyer_login_pom.clickLoginButton();


    }


    @When("it should navigate to the homepage and verify the username")
    public void navigateHomepageUsername(){
        waitDriver(3000);
        buyer_login_pom.clickUserIcon();
        waitDriver(3000);
        System.out.println(buyer_login_pom.verifyUserName());
        Assert.assertEquals(buyer_login_pom.verifyUserName(),"israk","Login not success");

    }

    @Then("it's login successfully")
    public void loginSuccess(){
        System.out.println("Login Success");
        //driver.quit();
    }

    //Scenario: Buyer shouldn't be able to login to keep the email field empty with correct password
    @When("buyer keep blank the email field but input the correct password")
    public void emptyEmailFieldButInputPassword(){
        buyer_login_pom.inputEmailPassword("",prop.getProperty("password"));
    }
    @Then("it should throw an error message under the email field")
    public void throwErrorMessage(){
        Assert.assertEquals(buyer_login_pom.verifyErrorMessageBlankEmail(),"Please provide your email address", "Text not matched");
        System.out.println(buyer_login_pom.verifyErrorMessageBlankEmail());
    }
    @When("the buyer is logged in to the website")
    public void buyerLoggedInWebsite(){
        buyer_login_pom= new Buyer_Login_POM();
        buyer_login_pom.clickUserIcon();
        waitDriver(2000);
        buyer_login_pom.inputEmailPassword(prop.getProperty("email"),prop.getProperty("password"));
        buyer_login_pom.clickLoginButton();
        buyer_login_pom.getLoginText();
        Assert.assertEquals(buyer_login_pom.getLoginText(),"Login","Login not found");
        waitDriver(2000);
        System.out.println(buyer_login_pom.getLoginText());
    }

    @When("input the {string} and {string}")
    public void inputEmailAndPassword(String email,String password){
        buyer_login_pom.inputEmailPassword(email,password);
    }


}
