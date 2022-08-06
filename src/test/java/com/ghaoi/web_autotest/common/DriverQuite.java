package com.ghaoi.web_autotest.common;

import org.openqa.selenium.chrome.ChromeDriver;

public class DriverQuite {
    private static ChromeDriver driver;

    public static void driverQuite() {
        if(driver == null) {
            driver = CommonDriver.getDriver();
        }
        driver.close();
    }
}
