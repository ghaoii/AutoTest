package com.ghaoi.web_autotest.common;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;
import java.util.SimpleTimeZone;
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

    public void getScreenShot(String className) throws IOException {
        List<String> list = getTime();
        String fileName = "./src/test/" + list.get(0) + File.separator + className  + "-" + list.get(1) + ".png";
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(srcFile, new File(fileName));
    }

    private List<String> getTime() {
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyyMMdd-HHmmssSS");
        String dirName = format1.format(System.currentTimeMillis());
        String fileName = format2.format(System.currentTimeMillis());
        List<String> list = new LinkedList<>();
        list.add(dirName);
        list.add(fileName);
        return list;
    }
}
