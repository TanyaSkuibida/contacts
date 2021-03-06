package pageobjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    AppiumDriver<MobileElement> driver;
    boolean ios = false;
    boolean android = false;

    public BasePage(AppiumDriver<MobileElement> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        this.driver = driver;
    }

    public void setPlatform() {
        String platformName = (String) driver.getCapabilities().getCapability("platformName");
        if (platformName.equals("Android")) {
            android = true;
        } else {
            ios = true;
        }
    }
}
