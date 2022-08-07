package com.ghaoi.web_autotest.actual_test;

import com.ghaoi.web_autotest.common.CommonDriver;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteFruitInfo extends CommonDriver{
    private static ChromeDriver driver = getDriver();

    @BeforeEach
    void getUrl() {
        driver.get("http://182.254.132.183:8050/goodsbrowse.html");
    }

    @Test
    void checkPage() {
        String pageElement = driver.findElement(By.cssSelector("body > div > div > div > div.hd > ul > li")).getText();
        Assertions.assertEquals("浏览商品", pageElement);
    }

    @Test
    void deleteInfo() throws InterruptedException {
        driver.findElement(By.cssSelector("#tbRecord > tbody > tr:nth-child(1) > td.delete > button")).click();
        Thread.sleep(2000);// 睡两秒，确保警告窗口弹出
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String str = driver.findElement(By.cssSelector("#tbRecord > thead > tr > th:nth-child(2)")).getText();
        Assertions.assertEquals("商品名称", str);
    }
}
