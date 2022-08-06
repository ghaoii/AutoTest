package com.ghaoi.baidu_test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaiduTest {
    private ChromeDriver driver = new ChromeDriver();

    public void start() {
        // 进入百度首页
        driver.get("https://www.baidu.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void printTest() {
        driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");
        driver.findElement(By.cssSelector("#su")).click();
        String str = driver.findElement(By.xpath("//*[@id=\"1\"]/div/div/h3/a")).getText();
        System.out.println(str);
    }

    public void close() {
        driver.close();
    }
}
