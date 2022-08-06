package com.ghaoi.web_autotest.common;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class CommonDriver {
    private static ChromeDriver driver;

    public static ChromeDriver getDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
            // 添加隐式等待
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        }
        return driver;
    }
}
