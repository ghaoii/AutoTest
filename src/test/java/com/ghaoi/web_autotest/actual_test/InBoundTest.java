package com.ghaoi.web_autotest.actual_test;

import com.ghaoi.web_autotest.common.CommonDriver;
import com.ghaoi.web_autotest.common.GetFruit;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class InBoundTest extends CommonDriver{
    private static ChromeDriver driver = getDriver();

    private static Random random = new Random();

    @BeforeEach
    void getUrl() {
        driver.get("http://182.254.132.183:8050/inbound.html");
    }

    @Test
    void checkPage() {
        String pageElement = driver.findElement(By.cssSelector("body > div > div > div > div.bd > ul > " +
                "div > div > div > div > div > div.am-u-sm-12.am-u-md-8.am-u-md-pull-4 > form > " +
                "div:nth-child(1) > label")).getText();
        Assertions.assertEquals("商品名称", pageElement);
    }

    @ParameterizedTest
    @MethodSource
    void addFruit(String name, List<Integer> list) {
        // 商品名称
        driver.findElement(By.cssSelector("#name")).sendKeys(name);
        // 库存
        driver.findElement(By.cssSelector("#stock")).sendKeys("66");
        // 商品介绍
        driver.findElement(By.cssSelector("#introduce")).sendKeys("common fruit");
        // 商品单位
        driver.findElement(By.cssSelector("#unit")).sendKeys("ton");
        // 商品价格
        driver.findElement(By.cssSelector("#price")).sendKeys(String.valueOf(list.get(0)));
        // 商品折扣
        driver.findElement(By.cssSelector("#discount")).sendKeys(String.valueOf(list.get(1)));
        // 添加商品
        driver.findElement(By.cssSelector("body > div > div > div > div.bd > ul > div > div > " +
                "div > div > div > div.am-u-sm-12.am-u-md-8.am-u-md-pull-4 > form > " +
                "div:nth-child(7) > div > input")).click();
        String string = driver.findElement(By.cssSelector("body > ul > li > ul > a:nth-child(1) > li")).getText();
        Assertions.assertEquals("上架商品", string);
    }

    static Stream<Arguments> addFruit() {
        GetFruit fruit = new GetFruit();
        return Stream.of(Arguments.arguments(fruit.getName(), fruit.getPrice()),
                Arguments.arguments(fruit.getName(), fruit.getPrice()),
                Arguments.arguments(fruit.getName(), fruit.getPrice()));
    }
}
