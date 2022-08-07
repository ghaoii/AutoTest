package com.ghaoi.web_autotest.actual_test;

import com.ghaoi.web_autotest.common.CommonDriver;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class FrontPageTest extends CommonDriver{
    private ChromeDriver driver = getDriver();

    /**
     * 跳转链接
     */
    @BeforeEach
    void getUrl() {
        driver.get("http://182.254.132.183:8050/");
    }

    /**
     * 测试网页首页是否正常展示
     */
    @Test
    void checkPage() {
        String pageElement1 = driver.findElement(By.cssSelector("body > ul > li > ul > a:nth-child(2) > li")).getText();
        String pageElement2 = driver.findElement(By.cssSelector("body > ul > li > ul > a:nth-child(1) > li")).getText();
        Assertions.assertEquals("浏览商品", pageElement1);
        Assertions.assertEquals("上架商品", pageElement2);
    }

    /**
     * 测试当前页面的功能是否正常展示
     */
   @Test
    void checkFun() {
        // 点击"上架商品按钮"
        driver.findElement(By.cssSelector("body > ul > li > ul > a:nth-child(1) > li")).click();
        // 检查跳转页面的元素是否存在
        String pageElement = driver.findElement(By.cssSelector("body > div > div > div > div.hd > ul > li")).getText();
        Assertions.assertEquals("商品入库", pageElement);
    }

}
