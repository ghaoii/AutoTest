package com.ghaoi.junit_test.assert_test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssertTest {
//    private ChromeDriver driver = new ChromeDriver();
//
//    @Test
//    void assertEqualsTest() {
//        driver.get("https://www.baidu.com");
//        // 测试"百度一下"按钮上的属性值是否匹配
//        String str = driver.findElement(By.cssSelector("#su")).getAttribute("value");
//        Assertions.assertEquals("百度", str);
//    }
//
//    @Test
//    void assertNotEqualsTest() {
//        driver.get("https://www.baidu.com");
//        String str = driver.findElement(By.cssSelector("#su")).getAttribute("value");
//        Assertions.assertNotEquals("百度", str);
//    }
//
//    @Test
//    void assertTrueTest() {
//        driver.get("https://www.baidu.com");
//        String str = driver.findElement(By.cssSelector("#su")).getAttribute("value");
//        Assertions.assertTrue("百度".equals(str));
//    }
//
//    @Test
//    void assertFalseTest() {
//        driver.get("https://www.baidu.com");
//        String str = driver.findElement(By.cssSelector("#su")).getAttribute("value");
//        Assertions.assertFalse("百度".equals(str));
//    }

    @Test
    void assertNullTest() {
        String test = null;
        Assertions.assertNull(test);
    }

    @Test
    void assertNotNullTest() {
        String test = new String("10");
        Assertions.assertNotNull(test);
    }
}
