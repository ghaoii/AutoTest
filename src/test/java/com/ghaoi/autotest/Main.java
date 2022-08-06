package com.ghaoi.autotest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws Exception {
        autoTest test = new autoTest();
        test.startTest();
//        test.controlTest();
//        test.waitTest();
//        test.waitTogether();
//        test.printTest();
//        test.windowTest();
//        test.switchTest();
//        test.windowSize();
//        test.navigateTest();
//        test.alterTest();
//        test.mouseAndKeyboardTest();
//        test.selectTest();
//        test.fileUpload();
        test.screenShotTest();
        test.endTest();
    }
}
