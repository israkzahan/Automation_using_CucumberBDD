package eCom_Website.stepDefinations;

import eCom_Website.pages.Buyer_Login_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuyerLoginSteps extends LoginURL {
    Buyer_Login_POM buyer_login_pom;

    @Given("Buyer navigates to the baseUrl")
    public void navigateBaseUrl(){
        initializeDriver();
    }
    @When("click on the user icon from the right top corner")
    public void clickUserIcon(){
        buyer_login_pom= new Buyer_Login_POM();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}

        buyer_login_pom.clickUserIcon();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        buyer_login_pom.getLoginText();
    }

    @When("input the email and password")
    public void inputEmailPassword(){
        buyer_login_pom.inputEmailPassword(prop.getProperty("email"),prop.getProperty("password"));
    }

    @When("click on  the login in button")
    public void clickLoginButton(){
        buyer_login_pom.clickLoginButton();
        waitDriver(3000);
    }


    @When("it should navigate to the homepage and verify the username")
    public void navigateHomepageUsername(){
        buyer_login_pom.clickUserIcon();
        waitDriver(3000);
        buyer_login_pom.verifyUserName();
    }

    @Then("it's login successfully")
    public void loginSuccess(){

    }
}
