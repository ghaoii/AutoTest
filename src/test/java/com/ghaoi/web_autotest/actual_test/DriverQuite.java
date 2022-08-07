package com.ghaoi.web_autotest.actual_test;

import com.ghaoi.web_autotest.common.CommonDriver;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverQuite extends CommonDriver{
    private static ChromeDriver driver = getDriver();

    @Test
    void driverQuite() {
        driver.close();
    }
}
