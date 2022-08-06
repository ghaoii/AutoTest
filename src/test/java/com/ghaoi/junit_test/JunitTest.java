package com.ghaoi.junit_test;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitTest {
//    ChromeDriver driver = new ChromeDriver();

//    @Test
//    void firTest() {
//        driver.get("https://www.baidu.com");
//        driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");
//        driver.findElement(By.cssSelector("#su")).click();
//        driver.close();
//    }
//    @Test
//    void secTest() {
//        driver.findElement(By.cssSelector("[id=\"\\31 \"] > div > div > h3 > a"));
//    }

//    @Test
//    @BeforeEach
//    void beforeEachTest() {
//        System.out.println("BeforeEach注解测试");
//    }

//    @BeforeAll // 使用@BeforeAll注解必须定义为static静态方法才能运行
//    static void beforeAllTest() {
//        System.out.println("BeforeAll注解测试");
//    }

//    @AfterEach
//    void afterEachTest() {
//        System.out.println("AfterEach注解测试");
//    }

    @AfterAll
    static void afterAllTest() {
        System.out.println("AfterAll注解测试");
    }

    @Test
    void beforeAndAfterTest2() {
        System.out.println("test2");
    }

    @Test
    void beforeAndAfterTest3() {
        System.out.println("test3");
    }

}
