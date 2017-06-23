package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class ContactDetailsPage extends BasePage {

    public ContactDetailsPage(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    public String getDetailName() {
        String result = null;
        if (android) result = driver.findElementById("detail_name").getText();
        //      if (ios) result = driver.findElementById("").getText(); //TODO: add locator for iOS
        return result;
    }

    public String getEmailAddress() {
        String result = null;
        if (android) result = driver.findElementById("email").getText();
  //      if (ios) result = driver.findElementById("").getText(); //TODO: add locator for iOS
        return result;
    }

    public String getPhoneNumber(){
        String result = null;
        if (android) result = driver.findElementById("phonenumber").getText();
  //      if (ios) result = driver.findElementById("").getText();
        return result;
    }

    public String getStreet1(){
        String result = null;
        if (android) result = driver.findElementById("street1").getText();
  //      if (ios) result = driver.findElementById("").getText();
        return result;
    }

    public String getStreet2(){
        String result = null;
        if (android) result = driver.findElementById("street2").getText();
   //     if (ios) result = driver.findElementById("").getText();
        return result;
    }

    public String getNoContactsFound() {
        String result = null;
        if (android) result = driver.findElementById("main_text").getText();
        //      if (ios) result = driver.findElementById("").getText();
        return result;
    }

}
