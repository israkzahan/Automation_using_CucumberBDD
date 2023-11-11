package eCom_Website.stepDefinations;

import eCom_Website.utils.LoginURL;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LoginURL {
    //global hooks
    @Before
    public void setupBrowser(){
        System.out.println("Executing Before Hooks........");
        initializeDriver();
    }
    @Before("@Smoke")
    public void smokeTests(){
        System.out.println("Execute scenario-2");
        System.out.println("Executing the tagged hooks.....");
    }
    @After
    public void tearDown(){
        System.out.println("Executing After Hooks........");
        //driver.quit();
    }
}
