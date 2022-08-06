package com.ghaoi.autotest;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;


public class autoTest {
    private ChromeDriver driver = new ChromeDriver();

    /**
     * 打开浏览器之后进入百度页面
     */
    public void startTest() {
        // 输入网页链接 - 百度
        driver.get("https://www.baidu.com");
        // 输入网页连接 - 工具
//        driver.get("https://tool.lu");
        // 本地html文件 - model
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/modal.html");
        // 本地 html文件 - alter
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/alert.html");
        // 本地 html文件 - confirm
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/confirm.html");
        // 本地 html文件 - Prompt
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/Prompt.html");
        // 本地 html文件 - level_locate
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/level_locate.html");
        // 本地 html文件 - select
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/select.html");
        // 本地 html文件 - upload
//        driver.get("file:///Users/harley/Desktop/code/helper/selenium4html/upload.html");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }

    public void screenShotTest() throws IOException {
        // 百度搜索关键词并验证结果页
        driver.findElement(By.cssSelector("#kw")).sendKeys("selenium");
        driver.findElement(By.cssSelector("#su")).click();
        // 执行下面代码的时候，界面还没渲染完
        // 屏幕截图
        File srcFile = driver.getScreenshotAs(OutputType.FILE);
        // 将截图文件file保存到指定路径下 - 桌面
        File file = new File("/Users/harley/Desktop/src.png");
        // 将截图文件保存到指定路径下
        FileUtils.copyFile(srcFile, file);
        driver.findElement(By.cssSelector("[id=\"\\31 \"] > div > div > h3 > a"));
    }

    public void fileUpload() throws InterruptedException {
        WebElement element = driver.findElement(By.cssSelector("body > div > div > input[type=\"file\"]"));
        element.sendKeys("/Users/harley/Desktop/code/helper/selenium4html/upload.html");
        Thread.sleep(2000);
    }

    public void selectTest() throws InterruptedException {
        // 普通方法
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#ShippingMethod")).click();
//        Thread.sleep(1000);
//        driver.findElement(By.cssSelector("#ShippingMethod > option:nth-child(4)")).click();
//        Thread.sleep(1000);

        // Select接口
        WebElement element = driver.findElement(By.cssSelector("#ShippingMethod"));
        Select select = new Select(element);
        // 通过索引选择
        select.selectByIndex(0);// OK
        Thread.sleep(1000);
        select.selectByIndex(3);// OK
        Thread.sleep(1000);
        // 通过value值选择
        select.selectByValue("10.69");// OK
        Thread.sleep(1000);
        // 通过可见文本选择
        select.selectByVisibleText("UPS Ground ==> $8.34");// OK
    }

    public void mouseAndKeyboardTest() throws InterruptedException {
//        // 模拟鼠标操作
//        driver.findElement(By.cssSelector("body > div:nth-child(2) > div > div > a")).click();
//        // 模拟鼠标移动到指定元素位置
//        WebElement element = driver.findElement(By.cssSelector("#dropdown1 > li:nth-child(2) > a"));
//        Actions actions = new Actions(driver);
//        // 将鼠标移动到element上，然后点击(这里只要按住鼠标的效果，没有移动效果)
//        actions.clickAndHold(element).perform();
//        Thread.sleep(1000);
//        // 模拟鼠标点击按钮
//        actions.click(element).perform();
//        Thread.sleep(1000);

        // 模拟键盘操作
        WebElement element = driver.findElement(By.cssSelector("#kw"));
        element.sendKeys("test");
        Thread.sleep(2000);
    }


    public void alterTest() {
        try {
//            // 点击按钮，出现弹窗
//            driver.findElement(By.cssSelector("#show_modal")).click();
//            // 关闭弹窗
//            Thread.sleep(2000);
//            driver.findElement(By.cssSelector("#myModal > div.modal-footer > button:nth-child(1)")).click();

//            // 点击按钮出现弹窗
//            driver.findElement(By.cssSelector("#tooltip")).click();
//            // 切换到警告弹窗上
//            Alert alert = driver.switchTo().alert();
//            Thread.sleep(1000);
//            // 点击确认按钮
//            alert.accept();

//            driver.findElement(By.cssSelector("body > input[type=\"button\"]")).click();
//            Alert alert = driver.switchTo().alert();
//            Thread.sleep(1000);
//            alert.dismiss();

            driver.findElement(By.cssSelector("body > input[type=button]")).click();
            Thread.sleep(1000);
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("测试文本");
            Thread.sleep(1000);
            alert.accept();
            Thread.sleep(2000);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateTest() {
        try {
//            driver.findElement(By.cssSelector("#nav > div > div > ul > li:nth-child(3) > a > span")).click();
//            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
            driver.navigate().forward();
            Thread.sleep(2000);
            driver.navigate().back();
            Thread.sleep(2000);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void windowSize() {
//        // 窗口最大化
//        driver.manage().window().maximize();
//        // 窗口最小化
//        driver.manage().window().minimize();
//        // 设置窗口大小
//        driver.manage().window().setSize(new Dimension(1000, 500));

        try {
            driver.executeScript("window.scroll(0,document.body.scrollHeight)");
            Thread.sleep(2000);
            driver.executeScript("window.scroll(0,document.body.scrollTop)");
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void switchTest() {
        // 获取点击后的当前页面句柄
        String curWindow = driver.getWindowHandle();
        System.out.println(curWindow);
        driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
                "li:nth-child(1) > a > span.title-content-title")).click();
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            if(!curWindow.equals(handle)) {
                // 切换页面
                driver.switchTo().window(handle);

            }
        }
        // 打印当前页面的句柄
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getWindowHandle());
    }

    public void windowTest() throws InterruptedException {
        // 获取点击前的百度首页的句柄
        String handle1 = driver.getWindowHandle();
        System.out.println(handle1);// CDwindow-B010FA5CD03F6DCD9ABC34EB24E3878D

        // 获取点击后的当前页面句柄
        driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
                "li:nth-child(1) > a > span.title-content-title")).click();
        Thread.sleep(2000);
        String handle2 = driver.getWindowHandle();
        System.out.println(handle2);// CDwindow-B010FA5CD03F6DCD9ABC34EB24E3878D

        // 获取所有页面的句柄
        Set<String> handles = driver.getWindowHandles();
        for(String handle : handles) {
            System.out.println(handle);
        }
    }

    public void printTest() {
        driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
                "li:nth-child(1) > a > span.title-content-title")).click();
        String title = driver.getTitle();
        System.out.println(title);
        String url = driver.getCurrentUrl();
        System.out.println(url);
    }

    public void waitTogether() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            // 隐式等待
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            // 显示等待
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            System.out.println(format.format(System.currentTimeMillis()));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#hotsearch-content-wrapper >" +
                    " li:nth-child(1) > a > span.title-content")));
        } catch (Exception e) {
            System.out.println(format.format(System.currentTimeMillis()));
        }
    }

    public void waitTest() {
        // 强制等待
//        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline 网易云音乐");
//        driver.findElement(By.cssSelector("#su")).click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(By.cssSelector("#\\31  > div > div:nth-child(1) > h3 > a"));

        // 隐式等待
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline 网易云音乐");
//        driver.findElement(By.cssSelector("#su")).click();
//        driver.findElement(By.cssSelector("#\\31  > div > div:nth-child(1) > h3 > a"));

        // 显示等待
        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline 网易云音乐");
        driver.findElement(By.cssSelector("#su")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("#\\31  > div > " +
                "div:nth-child(1) > h3 > a")));
        wait.until(ExpectedConditions.textToBe(By.cssSelector("#\\31  > div > " +
                "div:nth-child(1) > h3 > a > em:nth-child(2)"), "网易云音乐"));
    }

    /**
     * 元素操作测试
     */
    public void controlTest() {
//        // click点击行为 - 点击"百度一下"按钮
//        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();// OK
//        // submit提交行为 - 搜索并提交"百度一下"按钮
//        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline网易云");
//        driver.findElement(By.xpath("//*[@id=\"su\"]")).submit();// OK

        // submit 标签页面
//        driver.findElement(By.xpath("//*[@id=\"hotsearch-content-wrapper\"]" +
//                "/li[1]/a/span[2]")).submit();

        // clear 清除文本
//        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline Lana");
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        // 输错了，清除一下，重新输入
//        driver.findElement(By.cssSelector("#kw")).clear();
//        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline halsey");

        // gettext 获取文本
        String str1 = driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
                "li:nth-child(1) > a > span.title-content-title")).getText();
        String str2 = driver.findElement(By.cssSelector("#su")).getText();
        String str3 = driver.findElement(By.cssSelector("#su")).getAttribute("value");
        System.out.println("期望的文本：文明之美看东方，实际的文本：" + str1);
        System.out.println("期望的文本：百度一下，实际的文本：" + str2);
        System.out.println("期望的文本：百度一下，实际的文本：" + str3);
    }

    public void locateTest() {
        // css选择器
//        String str = driver.findElement(By.cssSelector("#hotsearch-content-wrapper > " +
//                "li:nth-child(2) > a > span.title-content-title")).getText();
//        System.out.println(str);

        // xpath选择器
//        driver.findElement(By.xpath("//*[@id=\"kw\"]")).sendKeys("xpath");
//        driver.findElement(By.xpath("//*[@id=\"su\"]")).click();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        driver.findElement(By.xpath("//*[@id=\"1\"]/div/div/h3/a"));

        // 定位要唯一
        String str = driver.findElement(By.xpath("//*[@id=\"" +
                "hotsearch-content-wrapper\"]/li[2]")).getText();
        System.out.println("期望输出：文明之美看东方，实际输出：" + str);
    }

    public void taylorTest() throws InterruptedException {
        // 找到百度输入框，输入关键字"gasoline网易云"
        driver.findElement(By.cssSelector("#kw")).sendKeys("gasoline网易云");
        Thread.sleep(3000);
        // 找到"百度一下"按钮，并点击
        driver.findElement(By.cssSelector("#su")).click();
    }

    /**
     * 释放驱动对象，关闭浏览器
     */
    public void endTest() {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        driver.close();
    }
}
