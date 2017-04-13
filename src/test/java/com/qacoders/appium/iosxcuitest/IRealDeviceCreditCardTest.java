package com.qacoders.appium.iosxcuitest;

import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by apple on 4/9/17.
 */
public class IRealDeviceCreditCardTest {

    AppiumDriver<MobileElement> driver;
    DesiredCapabilities capabilities;

    @Test
    public void testOne() throws MalformedURLException{

                /*"platformName": "iOS",
                "platformVersion": "10.3.1",
                "deviceName": "Khaja Moinuddin Mohammed's iPhone",
                "automationName": "XCuiTest",
                "app": "/Users/apple/Desktop/CreditCard.app",
                "udid": "08f02934d61d4216153a36fe78cc445cf6006d0d",
                "xcodeOrgId": "459N6L7RYM",
                "xcodeSigningId": "iPhone Developer"*/

        capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("platformVersion", "10.3.1");
        capabilities.setCapability("deviceName", "Khaja Moinuddin Mohammed's iPhone");
        capabilities.setCapability("app", "/Users/apple/Desktop/CreditCard.app");
        //capabilities.setCapability("udid", "08f02934d61d4216153a36fe78cc445cf6006d0d");
        capabilities.setCapability("udid", "dc61563f6e188b42d0bac266d927c11a55310922");

        driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        driver.findElementByXPath("//*[1]//*[1]//*[1]//*[2]//*[1]//*[1]//*[2]").sendKeys("1234567890123456");

        Assert.assertEquals(driver.findElementByXPath
                ("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[2]").getText(), "1234 5678 9012 3456");

        System.out.println(driver.findElementByXPath
                ("//*[1]//*[1]//*[1]//*[1]//*[1]//*[1]//*[2]").getText());

    }
}