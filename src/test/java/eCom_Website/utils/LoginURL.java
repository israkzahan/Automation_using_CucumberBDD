package eCom_Website.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class LoginURL {

    //variables
    public static WebDriver driver;
    public static Properties prop;
    //connect and load the properties file
    public LoginURL() {
        try {
            prop = new Properties();
            FileInputStream inputStream = new FileInputStream("C:\\Users\\TS4U\\IdeaProjects\\eCom_UI_Automation_BDD\\src\\test\\java\\eCom_Website\\config\\configuration.properties");
            prop.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        //initialize the driver
        public static void initializeDriver(){
        String browserName= prop.getProperty("browser");
        if (browserName.equals("chrome")){
            driver=new ChromeDriver();
        }else if (browserName.equals("firefox")){
            driver= new SafariDriver();
        }else {
            System.out.println("Browser's name is not correct! ");
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(prop.getProperty("baseURL"));
        }

        public static void waitDriver(long duration){
        try {
            Thread.sleep(duration);
        }catch (Exception e){
            e.printStackTrace();
        }
        }



    }
