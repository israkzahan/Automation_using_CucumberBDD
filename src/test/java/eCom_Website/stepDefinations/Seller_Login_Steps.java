package eCom_Website.stepDefinations;

import eCom_Website.pages_Seller.Seller_Login_POM;
import eCom_Website.utils.LoginURL;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class Seller_Login_Steps extends LoginURL {
    Seller_Login_POM seller_login_pom;

    @Given("Seller on the login panel")
    public void seller_on_the_login_panel() {
        System.out.println("Navigates to the login panel");
    }

    @When("input the email and password of seller account")
    public void input_the_email_and_password_of_seller_account() {
        seller_login_pom= new Seller_Login_POM();
        seller_login_pom.input_Email_Password(prop.getProperty("seller_Email"),prop.getProperty("seller_Password"));
        waitDriver(2000);


    }

    @When("click on the seller login button")
    public void click_on_the_seller_login_button() {
        seller_login_pom.clickSellerLoginButton();
        waitDriver(2000);

    }

    @Then("it should navigate to the dashboard page")
    public void it_should_navigate_to_the_dashboard_page() {
        Assert.assertEquals(seller_login_pom.verifyDashboardText(),"Dashboard","Login Failed");
        System.out.println(seller_login_pom.verifyDashboardText());
    }
    @Given("I logged into the seller portal")
    public void i_logged_into_the_seller_portal() {
        seller_login_pom= new Seller_Login_POM();
        seller_login_pom.input_Email_Password(prop.getProperty("seller_Email"),prop.getProperty("seller_Password"));
        waitDriver(2000);
        seller_login_pom.clickSellerLoginButton();
    }

}
