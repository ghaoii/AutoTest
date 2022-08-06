package com.ghaoi.baidu_test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTest {
    ChromeDriver driver = new ChromeDriver();

    public void start() throws InterruptedException {
        driver.get("https://www.baidu.com");
    }


    public void SleepTest() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
                "li:nth-child(1) > a > span.title-content-title")).click();
        Thread.sleep(3000);
        String title = driver.getTitle();
        System.out.println(title);
    }

    public void implicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
                "li:nth-child(1) > a > span.title-content-title")).click();
        String title = driver.getTitle();
        System.out.println( title);
    }

    public void WebDriverWait() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#hotsearch-content-wrapper >" +
                " li:nth-child(1) > a > span.title-content-title")));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("#hotsearch-content-wrapper >" +
                " li:nth-child(3) > a > span.title-content-title"), "中秋节国庆节放假通知来了"));
    }

    public void close() {
        driver.close();
    }
}
