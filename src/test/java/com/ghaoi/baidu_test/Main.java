package com.ghaoi.baidu_test;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        BaiduTest test = new BaiduTest();
//        test.start();
//        test.printTest();
//        test.close();

        WaitTest test = new WaitTest();
        test.start();
//        test.SleepTest();
//        test.implicitlyWait();
        test.WebDriverWait();
        test.close();
    }
}
