package com.ghaoi.web_autotest.actual_test;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({FrontPageTest.class, InBoundTest.class, DeleteFruitInfo.class, DriverQuite.class})
public class RunSuite {

}
