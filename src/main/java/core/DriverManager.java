package core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverManager {
    private static AndroidDriver driver;

    private DriverManager() {}

    public static AndroidDriver getDriver() {
        if (driver == null) {
            try {
                UiAutomator2Options options = new UiAutomator2Options()
                        .setPlatformName("Android")
                        .setAutomationName("UiAutomator2")
                        .setDeviceName("Android Emulator")
                        .setPlatformVersion("14")
                        .setAppPackage("com.google.android.calculator")
                        .setAppActivity("com.android.calculator2.Calculator")
                        .setNoReset(false)
                        .setFullReset(false)
                        .amend("ignoreHiddenApiPolicyError", true)
                        .amend("enforceAppInstall", false)
                .amend("autoGrantPermissions", true);

                driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
                System.out.println(" AndroidDriver initialized successfully.");
            } catch (MalformedURLException e) {
                System.err.println(" Invalid Appium server URL.");
                e.printStackTrace();
            } catch (Exception e) {
                System.err.println(" Error initializing AndroidDriver.");
                e.printStackTrace();
            }
        }
        return driver;
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
            System.out.println(" AndroidDriver session ended.");
        }
    }

    public static void setDriver(AndroidDriver customDriver) {
        driver = customDriver;
    }
}



//                DesiredCapabilities caps = new DesiredCapabilities();
//                caps.setCapability("platformName", "Android");
//                caps.setCapability("automationName", "UiAutomator2");
//                caps.setCapability("deviceName", "Android Emulator");
//                caps.setCapability("platformVersion", "14");
//                caps.setCapability("appPackage", "com.google.android.calculator");
//                caps.setCapability("appActivity", "com.android.calculator2.Calculator");
//                caps.setCapability("noReset", false);
//
